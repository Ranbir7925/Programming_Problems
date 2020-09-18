package com.bridglabz.programingproblems.logger

import grizzled.slf4j.Logging

object LoggerGrizzled extends App with Logging{
  trace("Trace log message")
  debug("Debug log message")
  info("Info log message")
  warn("Warning log message")
  error("Error log message")
}
