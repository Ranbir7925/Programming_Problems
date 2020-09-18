package com.bridglabz.programingproblems.logicalproblems

import java.util.concurrent.TimeUnit

import scala.io.StdIn.readLine

object StopWatch {
  def main(args: Array[String]): Unit = {
    var start: Long = 0
    var end: Long = 0
    var input: String = readLine("Enter any key to start stopwatch:")
    start = System.nanoTime()
    input = readLine("Enter any key to start stopwatch:")
    end = System.nanoTime()
    println(TimeUnit.SECONDS.convert(end - start, TimeUnit.NANOSECONDS)+" Secs")
  }

}
