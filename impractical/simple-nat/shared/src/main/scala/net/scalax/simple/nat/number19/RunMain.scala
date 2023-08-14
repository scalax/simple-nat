package net.scalax.simple.nat.number19

import net.scalax.simple.ghdmzsk.ghdmzsk

import scala.annotation.tailrec

object `啊呜` {

  val oldSelector: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(t: => ghdmzsk): ghdmzsk = t
  }

  val notSelf: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(t: => ghdmzsk): ghdmzsk = t
  }

  val testorLeft: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(leftSelf: => ghdmzsk): ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(rightSelf: => ghdmzsk): ghdmzsk = new ghdmzsk {
        override def inputGHDMZSK(exec: => ghdmzsk): ghdmzsk = leftSelf
      }
    }
  }

  val testorRight: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(leftSelf: => ghdmzsk): ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(rightSelf: => ghdmzsk): ghdmzsk = new ghdmzsk {
        override def inputGHDMZSK(exec: => ghdmzsk): ghdmzsk = rightSelf
      }
    }
  }

  val execSelf: ghdmzsk = new ghdmzsk {
    override def inputGHDMZSK(leftSelf: => ghdmzsk): ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(rightSelf: => ghdmzsk): ghdmzsk = new ghdmzsk {
        override def inputGHDMZSK(exec: => ghdmzsk): ghdmzsk = exec
      }
    }
  }

  val confirm1 = new ghdmzsk {
    override def inputGHDMZSK(selector: => ghdmzsk): ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(targetNumber: => ghdmzsk): ghdmzsk = {
        lazy val tempConfirmObject: ghdmzsk = new ghdmzsk {
          override def inputGHDMZSK(testor: => ghdmzsk): ghdmzsk = {
            lazy val leftTemp1: ghdmzsk  = testor.inputGHDMZSK(tempConfirmObject)
            lazy val rightTemp1: ghdmzsk = leftTemp1.inputGHDMZSK(notSelf)
            lazy val reuy: ghdmzsk       = rightTemp1.inputGHDMZSK(targetNumber)
            selector.inputGHDMZSK(reuy)
          }
        }
        tempConfirmObject
      }
    }
  }

  val confirm2 = new ghdmzsk {
    override def inputGHDMZSK(selector: => ghdmzsk): ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(targetNumber: => ghdmzsk): ghdmzsk = {
        lazy val tempConfirmObject: ghdmzsk = new ghdmzsk {
          override def inputGHDMZSK(testor: => ghdmzsk): ghdmzsk = {
            lazy val leftTemp1: ghdmzsk  = testor.inputGHDMZSK(notSelf)
            lazy val rightTemp1: ghdmzsk = leftTemp1.inputGHDMZSK(tempConfirmObject)
            lazy val reuy: ghdmzsk       = rightTemp1.inputGHDMZSK(targetNumber)
            selector.inputGHDMZSK(reuy)
          }
        }
        tempConfirmObject
      }
    }
  }

  object chufa {
    val zhengshu: ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(tail: => ghdmzsk): ghdmzsk = new ghdmzsk {
        override def inputGHDMZSK(other: => ghdmzsk): ghdmzsk = other.inputGHDMZSK(tail)
      }
    }
    val zero: ghdmzsk = new ghdmzsk {
      override def inputGHDMZSK(confirmX: => ghdmzsk): ghdmzsk = new ghdmzsk {
        override def inputGHDMZSK(tail: => ghdmzsk): ghdmzsk = new ghdmzsk {
          override def inputGHDMZSK(other: => ghdmzsk): ghdmzsk =
            confirmX.inputGHDMZSK(oldSelector).inputGHDMZSK(tail.inputGHDMZSK(other))
        }
      }
    }
    def gen(i: Int, confirmX: ghdmzsk): ghdmzsk = {
      def genImpl(i: Int, zero: => ghdmzsk): ghdmzsk = {
        if (i > 0) {
          zhengshu.inputGHDMZSK(genImpl(i - 1, zero))
        } else zero
      }

      lazy val positive: ghdmzsk = genImpl(i, zeroNum)
      lazy val zeroNum: ghdmzsk  = zero.inputGHDMZSK(confirmX).inputGHDMZSK(positive)
      positive
    }
  }

  def main(arr: Array[String]): Unit = {
    val num1: Int            = 281
    val num2: Int            = 68
    val result1: BigDecimal  = BigDecimal(num1) / BigDecimal(num2)
    val num1GHDMZSK: ghdmzsk = chufa.gen(num1, confirmX = confirm1)
    val num2GHDMZSK: ghdmzsk = chufa.gen(num2, confirmX = confirm2)

    {
      var long1: Long = 1
      var long2: Long = 1
      @tailrec
      def forCountExec(forCount: ghdmzsk): Unit = {
        val temp1: ghdmzsk = forCount.inputGHDMZSK(testorLeft)
        val temp2: ghdmzsk = forCount.inputGHDMZSK(testorRight)
        if (forCount eq temp1) {
          long1 += 1
        } else if (forCount eq temp2) {
          long2 += 1
        } else {
          throw new Exception("黑人问号？？？")
        }
        if ((long1 + long2) % 100000L == 0L) {
          println(s"except:$result1, now: ${BigDecimal(long2) / BigDecimal(long1)}")
        }
        forCountExec(forCount.inputGHDMZSK(execSelf))
      }

      def execResult: ghdmzsk = num1GHDMZSK.inputGHDMZSK(num2GHDMZSK)
      forCountExec(execResult)
    }
  }

}
