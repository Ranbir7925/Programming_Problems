package com.bridglabz.programingproblems.basiccoreproblems

import scala.io.StdIn.readLine
import scala.math.pow

object PowerOf2 {
  def main(args: Array[String]): Unit = {
    val number = readLine("Enter a number: ").toInt
    val maxLimit = pow(2, number).toInt
    if (0 <= number && number < 31) {
      for (i <- 1.to(maxLimit)) {
        println("2 X " + i + " = " + (2 * i))
      }
    }
  }
}
