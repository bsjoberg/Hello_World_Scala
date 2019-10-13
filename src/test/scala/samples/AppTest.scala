package samples

import org.junit._
import Assert._
import fun.bdd.App

@Test
class AppTest {

    @Test
    def testOK(): Unit = assertTrue(true)

//    @Test
//    def testKO() = assertTrue(false)

    @Test
    def testVectorModOf3(): Unit = assertArrayEquals(Vector(3,6,9,12,15,18).toArray, App.mod3().toArray)

    @Test
    def testPowerOf2(): Unit = assertArrayEquals(Vector(1,2,4,8,16,32,64,128,256).toArray, App.powerOf2().toArray)
}


