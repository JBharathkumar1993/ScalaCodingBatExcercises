package com.codingbat.Warmup1

object NearHundred {

  def nearHundred(n: Int): Boolean = {
    if(Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10){true}
    else false;
  }

  def main(args: Array[String]): Unit = {
    println(nearHundred(n = 93))  // → true
    println(nearHundred(n = 90))  // → true
    println(nearHundred(n = 89))  // → false
    println(nearHundred(n = 110))  //  → true	true	OK
    println(nearHundred(n = 111))  //  → false	false	OK
    println(nearHundred(n = 121))  //  → false	false	OK
    println(nearHundred(n = -101))  //  → false	false	OK
    println(nearHundred(n = -209))  //  → false	false	OK
    println(nearHundred(n = 190))  //  → true	true	OK
    println(nearHundred(n = 209))  //  → true	true	OK
    println(nearHundred(n = 0))  //  → false	false	OK
    println(nearHundred(n = 5))  //  → false	false	OK
    println(nearHundred(n = -50))  //  → false	false	OK
    println(nearHundred(n = 191))  //  → true	true	OK
    println(nearHundred(n = 189))  //  → false	false	OK
    println(nearHundred(n = 200))  //  → true	true	OK
    println(nearHundred(n = 210))  //  → true	true	OK
    println(nearHundred(n = 211))  //  → false	false	OK
    println(nearHundred(n = 290))  //  → false	false
  }
}
