package samples

import org.junit._
import Assert._
import fun.bdd.App

@Test
class AppTest {

    @Test
    def testOK() = assertTrue(true)

//    @Test
//    def testKO() = assertTrue(false)

    @Test
    def testVectorModOf3() = assertArrayEquals(Vector(3,6,9,12,15,18).toArray, App.mod3().toArray)
}


