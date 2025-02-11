```scala
import scala.collection.mutable.ListBuffer

class MyClass {
  private val myList = new ListBuffer[Int]()

  def addToList(element: Int): Unit = {
    myList += element
  }

  def getList: List[Int] = myList.toList
}

object Main extends App {
  val myObject = new MyClass
  myObject.addToList(1)
  myObject.addToList(2)
  myObject.addToList(3)
  println(myObject.getList) // This will print List(1, 2, 3)

  // The following will throw an exception if the list is empty:
  val firstElement = myObject.getList.head
  println(firstElement) // This will print 1
}
```