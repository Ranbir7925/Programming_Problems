package com.bridglabz.programingproblems.logicalproblems

import scala.io.StdIn.readLine
import scala.sys.exit
import scala.util.Random
import scala.util.control.Breaks._

object TicTacToe {
  val totalCell = 9
  var count = 0
  var switchPlayer = 2
  var position = 1
  var playerLetter = "O"
  var computerLetter = "X"
  var turnChange = ""
  var winner = 2
  var block = 0
  var center = 0
  var middle = 0


  var board = new Array[String](10)

  //  Function to reset the board
  def resettingBoard(): Unit = {
    for (counter <- 1 to 9) {
      board(counter) = "-"
    }
  }

  //Function to display  board
  def displayBoard(): Unit = {
    println("***TicTacToe Board***" + "\n" +
      "| " + board(1) + " || " + board(2) + " || " + board(3) + " |" + "\n" +
      "| " + board(4) + " || " + board(5) + " || " + board(6) + " |" + "\n" +
      "| " + board(7) + " || " + board(8) + " || " + board(9) + " |" + "\n" +
      "*********************")
  }


  //Function to tossTheCoin
  def tossToPlay(): Unit = {
    println("Tossing Coin....!!")
    if (Random.nextInt(2) == 0) {
      switchPlayer = 0
      println("Player won toss.")
      var letter = readLine("Choose your letter X or O: ")
      if (letter == "X" || letter == "O") {
        if (letter == computerLetter) {
          playerLetter = letter
          computerLetter = "O"
        }
        else {
          playerLetter = letter
          computerLetter = "X"
        }
      }
      else {
        letter = readLine("Please choose X or O only: ")
      }
    }
    else {
      println("Computer won toss\nComputer will play first.")
      switchPlayer = 1
    }
  }

  //Function for Player playing game
  def playerPlaying(): Unit = {
    println("===========================\nPlayer turn: ")
    displayBoard()
    println("Player Letter: " + playerLetter + "\n" + "Computer Letter: " + computerLetter)
    try {
      position = readLine("Enter Position: ").toInt
    } catch {
      case _: NumberFormatException => position = readLine("Please Enter Int value only.....\n" +
        "Enter Position: ").toInt
    }
    turnChange = playerLetter
    checkingEmptyCell()
    board(position) = playerLetter
    switchPlayer = 1
  }

  def computerPlaying(): Unit = {
    println("=========================\nComputer Turn:")
    computerPlayingToWin()
    computerPlayingToBlock()
    if (block == 0) {
      takeAvailableCorners()
    }
    switchPlayer = 0
    displayBoard()
  }

  def checkingEmptyCell(): Unit = {
    if (position > 0 && position < 10) {
      if (board(position) == "-") {
        println("............." + turnChange + " is placed at " + position + "...............")
        count += 1
      }
      else {
        println("Cell is already occupied...!!!")
        switchPlayers()
      }
    }
    else {
      println("Invalid cell Value...!!!")
      switchPlayers()
    }
  }

  //Function to switch between Player and Computer Move
  def switchPlayers(): Unit = {
    if (switchPlayer == 0) {
      playerPlaying()
    }
    else if (switchPlayer == 1) {
      computerPlaying()
    }
    winningCondition(turnChange)
  }


  //Function computer playing to win
  def computerPlayingToWin(): Unit = {
    for (counter <- 1 to totalCell) {
      if (board(counter) == "-") {
        board(counter) = computerLetter
        winningCondition(computerLetter)
        if (winner == 1) {
          displayBoard()
          println("Winner is Computer")
          exit(0)
        }
        else {
          board(counter) = "-"
          block = 0
        }
      }
    }
  }

  //Function computer will play to block the player from getting win
  def computerPlayingToBlock(): Unit = {
    breakable {
      for (counter <- 1 to totalCell) {
        if (board(counter) == "-") {
          board(counter) = playerLetter
          winningCondition(playerLetter)
          if (winner == 1) {
            board(counter) = computerLetter
            winner = 0
            block = 1
            count += 1
            break
          }
          else {
            board(counter) = "-"
          }
        }
      }
    }
  }


  def takeAvailableCorners(): Unit = {
    val myPosList = List(1, 3, 7, 9)
    breakable {
      for (counter <- myPosList) {
        if (board(counter) == "-") {
          board(counter) = computerLetter
          center = 1
          count += 1
          break
        }
      }
      takeCenter()
    }
  }

  def takeCenter(): Unit = {
    if (center != 1) {
      middle = (totalCell + 1) / 2
      if (board(middle) == "-") {
        board(middle) = computerLetter
        count += 1
      }
      else
        takeAvailableSides()
    }
  }

  def takeAvailableSides(): Unit = {

    for (counter <- 2 to 8 by 2) {
      breakable {
        if (board(counter) == "-") {
          board(counter) = computerLetter
          count += 1
          break
        }
      }
    }
  }

  def checkingGameStatus(): Unit = {
    if (winner == 1) {
      displayBoard()
      println("Winner is " + turnChange)
      exit
    }
    else if (count >= totalCell) {
      println("=============================")
      displayBoard()
      println("TIE...!!")
    }
  }


  def winningCondition(letter: String): Unit = {
    for (counter <- 1 to totalCell by 3) {
      //To check winning condition for row
      if ((board(counter) == board(counter + 1)) && (board(counter + 1) == board(counter + 2)) && (board(counter + 2) == letter)) {
        winner = 1
      }
    }
    for (counter <- 1 to 3) {
      //To check winning condition for columns
      if ((board(counter) == board(counter + 3)) && (board(counter + 3) == board(counter + 6)) && (board(counter) == letter)) {
        winner = 1
      }
    }
    if ((board(1) == board(5)) && (board(5) == board(9)) && (board(5) == letter)) {
      winner = 1
    }
    if ((board(3) == board(5)) && (board(5) == board(7)) && (board(5) == letter)) {
      winner = 1
    }
  }


  def main(args: Array[String]): Unit = {
    resettingBoard()
    displayBoard()
    tossToPlay()
    while (count != totalCell) {
      switchPlayers()
      checkingGameStatus()
    }
  }
}
