package net.scalax.simple.nat.合集

import net.scalax.simple.ghdmzsk.ghdmzsk

import scala.annotation.tailrec

object 乘除法喵 {

  def main(arr: Array[String]): Unit = {
    object num1 {
      val Parent: Int = 2688
      val Sub: Int    = 4
    }
    val num2: Int            = 21
    val num3: Int            = 32
    val num1GHDMZSK: ghdmzsk = 统计.gen(positive = 合集.s6, zero = 合集.s1)(positiveLen = num1.Parent, zeroLen = num1.Sub)
    val num2GHDMZSK: ghdmzsk = 统计.gen(positive = 合集.s6, zero = 合集.s4)(positiveLen = num2, zeroLen = 1)
    val num3GHDMZSK: ghdmzsk = 统计.gen(positive = 合集.s4, zero = 合集.s2)(positiveLen = num3, zeroLen = 1)

    val execResultForInput: ghdmzsk = num1GHDMZSK.inputGHDMZSK(num2GHDMZSK).inputGHDMZSK(num3GHDMZSK)

    统计.confirm(execResultForInput)
  }

}
