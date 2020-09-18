package com.bridglabz.programingproblems.filehandling

import java.io.{File, PrintWriter}

object WritingFile {
  def main(args: Array[String]): Unit = {
    val fileObject = new File("ScalaWriteFile.txt" )
    val printWriter = new PrintWriter(fileObject)
    printWriter.write("Hello, I am learning scala")
    printWriter.close()
  }
}
