package samples

import fun.bdd.Hello_World
import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloWorldSpec extends FunSpec {

  describe("A Hello World App") {
    it("should say hi") {
      val message = Hello_World.sayHi()
      assert("Hello World" === message)
    }
  }
}