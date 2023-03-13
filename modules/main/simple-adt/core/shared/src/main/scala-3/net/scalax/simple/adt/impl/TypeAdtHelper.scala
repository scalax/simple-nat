package net.scalax.simple
package adt
package impl

import core.Core2
import com.thoughtworks.binding.Binding

final class FetchAdtApply[S <: Tuple]:
  inline final def apply[T](inline data: T)(using
    inline v: TypeAdtApply.Aux[T, S, Adt.Status.Passed]
  ): InnerApply[[t] =>> Tuple.Map[S, [x] =>> (x => t)]] = InnerApply(adtList = v.value, data = data)
end FetchAdtApply

object FetchAdtApply:
  inline final def get[S <: Tuple]: FetchAdtApply[S] = null
end FetchAdtApply

final class InnerApply[O[_] <: Tuple](adtList: Binding.Var[TypeAdt.Context[Any, Any, Any]] => Core2, data: Any):
  inline def fold[U](inline funcCol: O[U]): U =
    val foldNumber = FoldListAppender.appendAll(funcCol.productIterator.asInstanceOf[Iterator[Any => Any]].to(List))
    FoldListAppender.result(number = foldNumber, adtList = adtList, data = data)
  end fold
end InnerApply
