package com.bridglabz.programingproblems.logger

import org.slf4j.LoggerFactory

object LoggerException extends App {
  val logger = LoggerFactory.getLogger(getClass.getSimpleName)
  try{
    throw new Exception("oops!")
  }
  catch {
    case e:Throwable => logger.info("I am a log message with exception", e)
  }
  println("Hello World")

}
