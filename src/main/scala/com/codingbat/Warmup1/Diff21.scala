package com.codingbat.Warmup1

object Diff21 {

  def diff21(n: Int): Int = {
    if(n > 21){ Math.abs(n-21)*2}
    else Math.abs(n-21)
  }

  def main(args: Array[String]): Unit = {
    println(diff21(n = 19))    // → 2
    println(diff21(n = 10))    // → 11
    println(diff21(n = 21))    // → 0
    println(diff21(n = 22))    //  → 2	OK
    println(diff21(n = 25))    //  → 8	OK
    println(diff21(n = 30))    //  → 	18	OK
    println(diff21(n = 0))    //  → 21	OK
    println(diff21(n = 1))    //  → 20	OK
    println(diff21(n = 2))    //  → 19	OK
    println(diff21(n = -1))    //  → 	22	OK
    println(diff21(n = -2))    //  → 	23	OK
    println(diff21(n = 50))    //  → 	58
  }
}
