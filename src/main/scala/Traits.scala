object Traits {

  trait Eq {
    // TODO: find better solution, so it doesn't have to be 'values'
    // helpful: https://gist.github.com/etorreborre/3847474
    val value: Int

    def canEqual(a: Any) = a.isInstanceOf[Eq]

    def +=+ (that: Any): Boolean = that match {
      // TODO: make hashcode function
      case that: Eq => that.canEqual(this) && value == that.value
      case _        => false
    }

  }

  trait TV extends Eq {
    val value = 8
  }


  class Gato extends Eq {
    val value = 8
  }
}
