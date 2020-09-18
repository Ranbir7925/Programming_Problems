package com.bridglabz.programingproblems.logger

import org.slf4j.LoggerFactory

object logger1 extends App {
  val logger = LoggerFactory.getLogger(getClass.getSimpleName)
  val someValue = 1 to 5
  logger.info("I am a log message")
  logger.info("I am a log message with some extra values: {}",someValue)
  println("Hello,world!")
}
