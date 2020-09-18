package com.bridglabz.programingproblems.functionalprograms

import scala.io.StdIn.readLine

object Array2D {
  def main(args: Array[String]): Unit = {
    try {
      val row = readLine("Enter a row of matrix:").toInt
      val column = readLine("Enter a columns of matrix:").toInt
      val myArray = Array.ofDim[Int](row, column)
      for (rowValue <- 0 until row) {
        for (colValue <- 0 until column) {
          myArray(rowValue)(colValue) = readLine("Enter value for row:" + rowValue + " col:" + colValue + "-->").toInt
        }
      }
      for (rowValue <- 0 until row) {
        for (colValue <- 0 until column) {
          print(myArray(rowValue)(colValue) + " ")
        }
        println()
      }

    }
    catch {
      case _: NumberFormatException => println("Please enter number only")
      case e: NegativeArraySizeException => println("Please enter positive number only")
    }
  }
}
