package fun.bdd

/**
 * @author ${user.name}
 */
object App {
  def max(firstNumber: Int, secondNumber: Int): Int = if (firstNumber > secondNumber) firstNumber else secondNumber

  def double(value: Int): Int = value * 2

  def safeStringOp(s: String, f: String => String): String = {
    if (s != null) f(s) else s
  }

  def areaOfCircle(radius: Int): Double = 3.14 * Math.pow(radius, 2)

  def areaOfCircle(radius: String): Double = if (radius.isEmpty)
    0.0
  else
    areaOfCircle(radius.toDouble)

  def areaOfCircle(radius: Double): Double = {
    Math.pow(radius.toDouble, 2) * Math.PI
  }

  def sum(items: Int*): Int = {
    var total: Int = 0
    for (i <- items) total += i
    total
  }

  def multiplier(multicand: Int, multiplier: Int): Int = multicand * multiplier

  def printFivePerLine(number: Int): String = {
    var numbersByFive: String = ""
    for (i <- 1 to number by 5) {
      for (j <- i to (i + 4)) {
        numbersByFive += s"$j, "
      }
      if (i + 5 < number) numbersByFive += "\n"
    }
    numbersByFive
  }

  def hexValueOfColor(color: String): String = {
    color match {
      case "cyan" => "#00FFFF"
      case "yellow" => "#FFFF00"
      case other => "Unexpected Value"
    }
  }

  def isDoubleGreater(number: Double): String = {
    if (number > 0.0) "greater"
    else if (number == 0.0) "same"
    else "less"
  }

  def isEmpty(name: String): String = {
    if (name.isEmpty) "n/a"
    else name
  }

  def powerOf2(): IndexedSeq[Int] = for (i <- 0 to 8; pow = 1 << i) yield pow

  def mod3(): IndexedSeq[Int] = for (i <- 1 to 20 if i % 3 == 0) yield i

  def foo(x: Array[String]): String = x.foldLeft("")((a, b) => a + b)

  def main(args: Array[String]) {
    println("Hello World!")
    println("concat arguments = " + foo(args))
  }
}