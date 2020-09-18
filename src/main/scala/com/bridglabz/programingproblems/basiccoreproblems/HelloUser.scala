package com.bridglabz.programingproblems.basiccoreproblems

import scala.io.StdIn.readLine
import scala.util.Random

object HelloUser {
  def main(args: Array[String]): Unit = {
    val username: String = readLine("Enter Your Name: ")
    println("Hello " + username + ",How are you?")
    val r = Random.nextInt(1)
    println(r)
  }

}
