package com.bridglabz.programingproblems.logger

import org.slf4j.LoggerFactory

object LoggerTypes extends App {
  val logger = LoggerFactory.getLogger(getClass.getSimpleName)
  logger.trace("Trace log message")
  logger.debug("Debug log message")
  logger.info("Info log message")
  logger.warn("Warning log message")
  logger.error("Error log message")
}
