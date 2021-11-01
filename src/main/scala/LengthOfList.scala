import scala.annotation.tailrec

class LengthOfList{

  def length(myList:List[Int]): Int = {

    @tailrec
    def len(myList:List[Int],count:Int): Int = myList match {
      case Nil => count
      case _ => len(myList.tail,count+1)
    }
    val LenList = len(myList,0)
    LenList
  }
}

object Main extends App{
  val testlen = new LengthOfList
  println(testlen.length(List(1,2,3,4,5)))
  println(testlen.length(List()))
}