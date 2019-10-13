package fun.bdd

/**
 * @author ${user.name}
 */
object App {
  def mod3() = for (i <- 1 to 20 if i % 3 == 0) yield i


  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}