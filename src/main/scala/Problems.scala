
object Problems{
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }

  def last(list: List[Int]): Int = list match {
    case x :: Nil => x
    case _ :: xs  => last(xs)
    case Nil      => throw new IllegalArgumentException("empty list")
  }

  def penultimate(list: List[Int]): Int = list match {
    case x :: _ :: Nil => x
    case _ :: xs       => penultimate(xs)
    case Nil           => throw new IllegalArgumentException("empty list")
  }

  def nthElem(n: Int, list: List[Int]): Int = (n, list) match {
    case (0, x :: _ ) => x
    case (n, _ :: xs) => nthElem(n - 1, xs)
    case (_, Nil )    => throw new IllegalArgumentException("no nth elem")
  }

  def length(list: List[Int]): Int = list match {
    case Nil => 0
    case _ :: xs => 1 + length(xs)
  }

  def lengthFun[A](list: List[A]): Int = list.foldLeft(0) {
    (c, _) => c + 1
  }
}

object TraitProblem {

  trait Eq[A] {
    def ===(rhs: A): Boolean
  }

  class TV {
    val csatorna = 8
  }


  class Macska extends Eq[Macska] with Eq[TV] {
    val elet = 9

    override def ===(rhs: Macska) = elet == rhs.elet
    override def ===(rhs: TV) = false
  }
}
