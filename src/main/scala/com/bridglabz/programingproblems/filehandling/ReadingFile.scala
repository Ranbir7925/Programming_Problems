package com.bridglabz.programingproblems.filehandling

import scala.io.Source

object ReadingFile {
  def main(args: Array[String]): Unit = {
    val filename = "ScalaFile.txt"
    val fileSource =Source.fromFile(filename)
    //Reading Each Charecter
//    while (fileSource.hasNext){
//      println(fileSource.next())
//    }
    for ( line <- fileSource.getLines){
      println(line)
    }
    fileSource.close()
  }

}
