package samples

import fun.bdd.Database
import org.junit.{Assert, Test}
import org.mockito.Mockito

class DatabaseTest {

  @Test
  def userAccountRetrievedByValidID(): Unit = {
    val databaseMock = Mockito.mock(classOf[Database])
    Mockito.when(databaseMock.getLastNameByID(1234)).thenReturn("Smith")
    Assert.assertEquals("Smith", databaseMock.getLastNameByID(1234))
  }

  @Test
  def userAccountNotRetrievedByInvalidID(): Unit = {

  }
}
