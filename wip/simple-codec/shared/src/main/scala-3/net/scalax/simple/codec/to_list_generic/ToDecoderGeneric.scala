package net.scalax.simple.codec
package to_list_generic

trait ToDecoderGeneric[F[_[_]]] {
  def toHList[M1[_], M2[_]](monad: MonadAdd[M1])(input: F[({ type U1[X] = M1[M2[X]] })#U1]): M1[F[M2]]
}

object ToDecoderGeneric {
  type IdImpl[T] = T

  type MatchTuple1[T, M1[_]] <: Tuple = T match {
    case h *: tail  => M1[h] *: MatchTuple1[tail, M1]
    case EmptyTuple => EmptyTuple
  }

  trait HListFuncMapGeneric[Source1, Target1, Target2, M1[_], M2[_]] {
    def output(monad: MonadAdd[M1])(o1: Target1): M1[Target2]
  }
  object HListFuncMapGeneric {
    private val instanceAny: HListFuncMapGeneric[Tuple, Tuple, Tuple, [x] =>> Any, [x] =>> Any] =
      new HListFuncMapGeneric[Tuple, Tuple, Tuple, [x] =>> Any, [x] =>> Any] {
        self =>
        override def output(monad: MonadAdd[[x] =>> Any])(o1: Tuple): Any = o1.match
          case head *: tail =>
            val zip = monad.zip(self.output(monad)(tail), head)
            monad.map(zip) { tupleiImpl =>
              val tuplei = tupleiImpl.asInstanceOf[Tuple2[_, _]]
              tuplei._2 *: tuplei._1.asInstanceOf[Tuple]
            }
          case EmptyTuple => monad.map(monad.unit)(_ => EmptyTuple)
      }

    def instance[Source1, M1[_], M2[_]]
      : HListFuncMapGeneric[Source1, MatchTuple1[MatchTuple1[Source1, M2], M1], MatchTuple1[Source1, M2], M1, M2] = instanceAny.asInstanceOf
  }

  trait HListFuncMapGenericGen[Source1, M1[_], M2[_]] {
    def generic: HListFuncMapGeneric[Source1, MatchTuple1[MatchTuple1[Source1, M2], M1], MatchTuple1[Source1, M2], M1, M2] =
      HListFuncMapGeneric.instance[Source1, M1, M2]
  }
  object HListFuncMapGenericGen {
    def apply[Source1, M1[_], M2[_]]: HListFuncMapGenericGen[Source1, M1, M2] = new HListFuncMapGenericGen[Source1, M1, M2] {
      //
    }
  }

  // ===
  class SimpleFuncion1Impl[F[_[_]], M1[_], M2[_]] {
    self =>
    def derived2[Source1, Target1, Target2](
      simpleTo1: SimpleTo[F[IdImpl], Source1],
      simpleFrom2: SimpleFrom[F[M2], Target2],
      simpleTo3: SimpleTo[F[({ type U1[X] = M1[M2[X]] })#U1], Target1]
    ): FuncInnerApply1[F, M1, M2, Source1, Target1, Target2] =
      new FuncInnerApply1[F, M1, M2, Source1, Target1, Target2](simpleTo1, simpleFrom2, simpleTo3)
  }

  class FuncInnerApply1[F[_[_]], M1[_], M2[_], Source1, Target1, Target2](
    simpleTo1: SimpleTo[F[IdImpl], Source1],
    simpleFrom2: SimpleFrom[F[M2], Target2],
    simpleTo3: SimpleTo[F[({ type U1[X] = M1[M2[X]] })#U1], Target1]
  ) {
    def apply(
      genericFunc: HListFuncMapGenericGen[Source1, M1, M2] => HListFuncMapGeneric[Source1, Target1, Target2, M1, M2]
    ): MonadAdd[M1] => F[({ type U1[X] = M1[M2[X]] })#U1] => M1[F[M2]] = { monad => model =>
      monad.map(genericFunc(HListFuncMapGenericGen[Source1, M1, M2]).output(monad)(simpleTo3.to(model)))(simpleFrom2.from)
    }
  }

  trait Impl[F[_[_]]] extends ToDecoderGeneric[F] {
    def impl[M1[_], M2[_]]: SimpleFuncion1Impl[F, M1, M2] => (MonadAdd[M1] => F[({ type U1[X] = M1[M2[X]] })#U1] => M1[F[M2]])
    override def toHList[M1[_], M2[_]](monad: MonadAdd[M1])(input: F[({ type U1[X] = M1[M2[X]] })#U1]): M1[F[M2]] =
      impl[M1, M2](new SimpleFuncion1Impl[F, M1, M2])(monad)(input)
  }
}
