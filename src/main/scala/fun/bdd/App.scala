package fun.bdd

/**
 * @author ${user.name}
 */
object App {
  def printFivePerLine(number: Int): String = {
    var numbersByFive: String = ""
    for (i <- 1 to number by 5) {
      for (j <- i to (i + 4)) { numbersByFive += s"$j, " }
      println("i = " + i)
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
    if (name.isEmpty()) "n/a"
    else name
  }

  def powerOf2(): IndexedSeq[Int] = for (i <- 0 to 8; pow = 1 << i) yield pow

  def mod3(): IndexedSeq[Int] = for (i <- 1 to 20 if i % 3 == 0) yield i

  def foo(x : Array[String]): String = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }
}