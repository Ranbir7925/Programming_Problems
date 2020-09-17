package com.bridglabz.programingproblems.functionalprograms

import scala.io.StdIn.readLine

object WindChill {
  def main(args: Array[String]): Unit = {
    val t = readLine("Enter value of t: ").toDouble
    val v = readLine("Enter value of v: ").toDouble
    val w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16)
    println("Temperature: " + t)
    println("Wind Speed: " + v)
    println("Wind Chill: " + w)
  }
}
