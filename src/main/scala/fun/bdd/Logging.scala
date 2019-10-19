package fun.bdd

import org.apache.log4j.Logger

import scala.io.Source

object Logging {
  def log(): Unit = {
    val logger = Logger.getLogger(Logging.getClass.getName)
    logger.debug("Hello World Debug Entry")
  }

  def read(pathToFile: String): String = {
    val bufferedSource = Source.fromFile(pathToFile)
    val logEntry: String = bufferedSource.getLines().next
    bufferedSource.close
    logEntry
  }

}
