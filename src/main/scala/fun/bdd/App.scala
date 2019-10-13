package fun.bdd

/**
 * @author ${user.name}
 */
object App {
  def powerOf2(): IndexedSeq[Int] = for (i <- 0 to 8; pow = 1 << i) yield pow

  def mod3(): IndexedSeq[Int] = for (i <- 1 to 20 if i % 3 == 0) yield i

  def foo(x : Array[String]): String = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}