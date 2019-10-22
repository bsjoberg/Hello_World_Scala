package samples

import fun.bdd.App
import org.junit.Assert._
import org.junit._

class AppTest {

  @Test
  def OK(): Unit = assertTrue(true)

  @Test
  def vectorModOf3(): Unit = assertArrayEquals(Vector(3, 6, 9, 12, 15, 18).toArray, App.mod3().toArray)

  @Test
  def powerOf2(): Unit = assertArrayEquals(Vector(1, 2, 4, 8, 16, 32, 64, 128, 256).toArray, App.powerOf2().toArray)

  @Test
  def nonEmptyString(): Unit = {
    val name = "Test"
    assertEquals("Test", App.isEmpty(name))
  }

  @Test
  def emptyString(): Unit = {
    val name = ""
    assertEquals("n/a", App.isEmpty(name))
  }

  @Test
  def doubleGreaterThanZero(): Unit = {
    assertEquals("greater", App.isDoubleGreater(10.0))
  }

  @Test
  def doubleSameAsZero(): Unit = {
    assertEquals("same", App.isDoubleGreater(0.0))
  }

  @Test
  def doubleLessThanZero(): Unit = assertEquals("less", App.isDoubleGreater(-1.0))

  @Test
  def convertCyanColorToHexStringValue(): Unit =
    assertEquals("#00FFFF", App.hexValueOfColor("cyan"))

  @Test
  def convertYellowColorToHexStringValue(): Unit =
    assertEquals("#FFFF00", App.hexValueOfColor("yellow"))

  @Test
  def fiveNumbersPerLineToTen(): Unit =
    assertEquals("1, 2, 3, 4, 5, \n6, 7, 8, 9, 10, ", App.printFivePerLine(10))

  @Test
  def fiveNumbersPerLineToFifteen(): Unit =
    assertEquals("1, 2, 3, 4, 5, \n6, 7, 8, 9, 10, \n11, 12, 13, 14, 15, ",
      App.printFivePerLine(15))

  @Test
  def multiplySixTimesSeven(): Unit = assertEquals(42, App.multiplier(6, 7))

  @Test
  def sumWithMultipleArgs(): Unit = {
    assertEquals(20, App.sum(10, 5, 3, 2))
    assertEquals(40, App.sum(5, 10, 5, 10, 5, 5))
  }

  @Test
  def reverseOfString(): Unit =
    assertEquals("ydaeR", App.safeStringOp("Ready", (s: String) => s.reverse))

  @Test
  def reverseOfStringWhenNull(): Unit = assertNull(App.safeStringOp(null, (s: String) => s.reverse))
}