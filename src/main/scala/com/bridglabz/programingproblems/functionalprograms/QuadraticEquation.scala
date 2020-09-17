package com.bridglabz.programingproblems.functionalprograms

import scala.io.StdIn.readLine

object QuadraticEquation {

  def main(args: Array[String]): Unit = {
    val a = readLine("Enter a: ").toDouble
    val b = readLine("Enter b: ").toDouble
    val c = readLine("Enter c: ").toDouble
    val discriminant = b * b - 4 * a * c
    print(discriminant)
    if (discriminant < 0)
      print("There are no real roots ")
    else {
      val root1 = (-b + Math.sqrt(discriminant)) / (2 * a)
      val root2 = (-b - Math.sqrt(discriminant)) / (2 * a)
      print("The roots are " + root1 + " and " + root2)
    }
  }
}
