package samples

import java.io.File

import fun.bdd.Logging
import org.junit.runner.RunWith
import org.junit.{After, Assert, Before, Test}
import org.scalatest.junit.JUnitRunner

class LoggingTest {
  val pathToLogFile: String = "test_log4j/log.out"

  @Before
  def beforeTest(): Unit = {
    // Ensure no log exists

  }

  @Test
  def debugLevelLog(): Unit = {
    // Open log file and find log entry
    Logging.log()
    Assert.assertEquals("Hello World Debug Entry", Logging.read(pathToLogFile))
  }

  @After
  def afterTest(): Unit = {
    // Ensure log is removed
    val fileTemp = new File(pathToLogFile)
    if (fileTemp.exists())
      fileTemp.delete()
  }
}
