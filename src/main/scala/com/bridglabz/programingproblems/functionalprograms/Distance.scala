package com.bridglabz.programingproblems.functionalprograms

import scala.io.StdIn.readLine
import scala.math.sqrt

object Distance {
  def main(args: Array[String]): Unit = {
    val X = readLine("Enter x: ").toInt
    val Y = readLine("Enter y: ").toInt
    val distance = sqrt(X*X + Y*Y)
    print("Euclidean Distance:"+distance)
  }

}
