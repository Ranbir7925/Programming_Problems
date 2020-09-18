package com.bridglabz.programingproblems.functionalprograms

import scala.io.StdIn.readLine

object SumOf_3_IntegersAddTo_0 {
  def tuplets: Unit = {
    try {
      val size = readLine("Enter the size of array:").toInt
      val myArray = new Array[Int](size)
      var counter = 0
      for (input <- 0 until size) {
        myArray(input) = readLine("Enter elements to array").toInt
      }
      for (thirdNo <- 0 until size - 2) {
        for (secondNo <- 0 until size - 1) {
          for (firstNo <- 0 until size) {
            if (myArray(thirdNo) + myArray(secondNo) + myArray(firstNo) == 0) {
              counter += 1
              println(myArray(thirdNo), myArray(secondNo), myArray(firstNo))
            }
          }
        }
      }
      println("Number of Triplets:" + counter)
    }
    catch {
      case _: NumberFormatException => print(" please enter number only")
      case _: NegativeArraySizeException => print("please enter positive number only")
    }
  }

  def main(args: Array[String]): Unit = {
    tuplets
  }
}
