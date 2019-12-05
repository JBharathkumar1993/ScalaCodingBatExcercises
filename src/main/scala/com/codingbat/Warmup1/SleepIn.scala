package com.codingbat.Warmup1

object SleepIn {

  def sleepIn(weekDay: Boolean, vacation: Boolean): Boolean = {
    if(weekDay && !vacation){false}
    else true
  }

  def main(args: Array[String]): Unit = {
    println(sleepIn(weekDay = false, vacation = false))     // → true
    println(sleepIn(weekDay = true, vacation = false))      // → false
    println(sleepIn(weekDay = false, vacation = true))      // → true
    println(sleepIn(weekDay = true, vacation = true))      //  → true
  }
}
