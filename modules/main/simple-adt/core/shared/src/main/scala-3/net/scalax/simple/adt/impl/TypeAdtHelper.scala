package net.scalax.simple.adt
package impl

import CoreInstance._

final class FetchAdtApply[F[_] <: TypeAdtApply.Aux[_, _, ConfirmSucceed]]:
  type TakeTuple[T <: TypeAdtApply.Aux[_, _, ConfirmSucceed]] <: Tuple = T match
    case TypeAdtApply[a, b] =>
      b match
        case c *: d     => c *: d
        case EmptyTuple => EmptyTuple
  end TakeTuple

  inline final def input[T](inline data: T): InnerApply[[t] =>> Tuple.Map[TakeTuple[F[T]], [x] =>> (x => t)], F[T]] = InnerApply(data)
end FetchAdtApply

object FetchAdtApply:
  inline final def get[F[_] <: TypeAdtApply.Aux[_, _, ConfirmSucceed]]: FetchAdtApply[F] = null
end FetchAdtApply

final class InnerApply[O[_] <: Tuple, TAdt <: TypeAdtApply.Aux[_, _, ConfirmSucceed]](data: Any):
  inline def fold[U](inline funcCol: O[U])(using inline adt: TAdt): U =
    def tranToFoldList(t: Tuple): () => Core2 = t.match
      case head *: tail => () => FoldListAppender.append(data, head.asInstanceOf[Any => Any])(tranToFoldList(tail))
      case EmptyTuple   => () => FoldListZero
    end tranToFoldList

    val foldNumber = tranToFoldList(funcCol)
    adt.value(foldNumber).asInstanceOf[TypeAdtGetter].runGetter.asInstanceOf[U]
  end fold
end InnerApply
