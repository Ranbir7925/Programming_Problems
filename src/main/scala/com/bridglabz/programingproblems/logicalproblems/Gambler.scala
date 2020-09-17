package com.bridglabz.programingproblems.logicalproblems

import scala.io.StdIn.readLine

object Gambler {
  def main(args: Array[String]): Unit = {
    var win, loss, counter = 0
    try {
      var stakes = readLine("Enter the Stakes: ").toInt
      val goal = readLine("Enter the goal: ").toInt
      val times = readLine("Enter the number of times gambler will play: ").toInt
      while (stakes != goal && stakes != 0 && counter < times) {
        if (Math.random() > 0.5) {
          win += 1
          stakes += 1
        }
        else {
          loss += 1
          stakes -= 1
        }
        counter += 1
      }
      println("No of times gambler wins :" + win + "\n" + "Win % :" + (win.toFloat * 100 / times.toFloat)
        + "\n" + "Loss % :" + (loss.toFloat * 100 / times.toFloat))
    }
    catch{
      case _: NumberFormatException => print("Number exception please enter number only")
    }
  }
}
