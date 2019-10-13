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

    @Test
    def testNonEmptyString(): Unit = {
        val name = "Test"
        assertEquals("Test", App.isEmpty(name))
    }

    @Test
    def testEmptyString(): Unit = {
        val name = ""
        assertEquals("n/a", App.isEmpty(name))
    }

    @Test
    def testIsDoubleGreaterThanZero(): Unit = {
        assertEquals("greater", App.isDoubleGreater(10.0))
    }

    @Test
    def testIsDoubleSameAsZero(): Unit = {
        assertEquals("same", App.isDoubleGreater(0.0))
    }

    @Test
    def testIsDoubleLessThanZero(): Unit = assertEquals("less", App.isDoubleGreater(-1.0))

    @Test
    def testConvertCyanColorToHexStringValue(): Unit = assertEquals("#00FFFF", App.hexValueOfColor("cyan"))

    @Test
    def testConvertYellowColorToHexStringValue(): Unit = assertEquals("#FFFF00", App.hexValueOfColor("yellow"))
}


