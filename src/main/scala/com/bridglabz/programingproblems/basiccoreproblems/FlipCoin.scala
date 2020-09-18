package com.bridglabz.programingproblems.basiccoreproblems

import scala.io.StdIn.readLine
import scala.util.Random

object FlipCoin {
  def flipCoin = {
    val number = readLine("Enter number of times you want to flip a coin: ").toInt
    var heads = 0
    var tails = 0
    if (number > 0) {
      for (_<- 1 to number) {
        val generate_random_num = Random.nextInt(2)
        if (generate_random_num == 0)
          heads += 1;
        else
          tails += 1;
      }
      val heads_percent = (heads.toFloat / number) * 100
      val tails_percent = (tails.toFloat / number) * 100
      println("Number of heads:" + heads)
      println("Number of tails:" + tails)
      println("Percentage of heads:" + heads_percent + "%")
      println("Percentage of tails:" + tails_percent + "%")
    }
  }

  def main(args: Array[String]): Unit = {
    flipCoin
  }
}
