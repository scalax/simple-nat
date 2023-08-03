package net.scalax.simple.adt
package temp

import net.scalax.simple.adt.implemention.ADTGHDMZSK
import net.scalax.simple.ghdmzsk.ghdmzsk
import impl.Adt.Status

trait AdtNat
trait AdtNatPositive[Head, +T <: AdtNat] extends AdtNat
class AdtNatZero                         extends AdtNatPositive[IsFinishAndNothing, AdtNatZero]

trait ToGHDMZSK {
  def toGHDMZSK: ghdmzsk
}

trait ADTData[+N <: AdtNat, S <: Status] extends ToGHDMZSK {
  override def toGHDMZSK: ghdmzsk
}

object ADTData {
  def success[D, T <: AdtNat, S <: Status](data: D, tail: ADTData[T, S]): ADTData[AdtNatPositive[D, T], Status.Passed] =
    new ADTData[AdtNatPositive[D, T], Status.Passed] {
      override val toGHDMZSK: ghdmzsk = ADTGHDMZSK.a1VImpl(data).inputGHDMZSK(tail.toGHDMZSK)
    }
  def empty[D, T <: AdtNat, S <: Status](tail: ADTData[T, S]): ADTData[AdtNatPositive[D, T], S] = new ADTData[AdtNatPositive[D, T], S] {
    override val toGHDMZSK: ghdmzsk = ADTGHDMZSK.a1Impl1.inputGHDMZSK(tail.toGHDMZSK)
  }
  lazy val zero: ADTData[AdtNatZero, Status.NotFinished] = new ADTData[AdtNatZero, Status.NotFinished] {
    override lazy val toGHDMZSK: ghdmzsk = ADTGHDMZSK.a1VImpl(IsFinishAndNothing.value).inputGHDMZSK(zero.toGHDMZSK)
  }
}

final class IsFinishAndNothing {
  def default[T](t: => T): T           = t
  lazy val isEnded: IsFinishAndNothing = this
  def matchErrorAndNothing: Nothing    = throw new Exception("match error.")
}
object IsFinishAndNothing {
  lazy val value: IsFinishAndNothing = new IsFinishAndNothing
}

trait ApplyFactory[N <: AdtNat] {
  def apply[D](d: D)(implicit v: TypeAdtApply[D, N, Status.Passed]): ADTData[N, Status.Passed] = v.value(d)
}

object ApplyFactory {
  private val any: ApplyFactory[AdtNat] = new ApplyFactory[AdtNat] {
    //
  }
  private def factoryApply[N <: AdtNat]: ApplyFactory[N] = any.asInstanceOf[ApplyFactory[N]]

  def build[N <: AdtNat]: ApplyFactory[N] = factoryApply
}
