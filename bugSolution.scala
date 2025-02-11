```scala
import scala.collection.mutable.ListBuffer

class MyClass {
  private val myList = new ListBuffer[Int]()

  def addToList(element: Int): Unit = {
    myList += element
  }

  def getList: List[Int] = myList.toList
  def getHeadOption: Option[Int] = if (myList.isEmpty) None else Some(myList.head)
}

object Main extends App {
  val myObject = new MyClass
  myObject.addToList(1)
  myObject.addToList(2)
  myObject.addToList(3)
  println(myObject.getList)

  // Safer way to access the head element:
  val headOption = myObject.getHeadOption
  println(headOption.getOrElse(0)) // Prints 1

  val emptyObject = new MyClass
  println(emptyObject.getHeadOption.getOrElse(0)) // Prints 0, handles empty list
}
```