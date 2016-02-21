import org.scalatest._

class ProblemsSpec extends WordSpec with Matchers {
  "Problems" should {
    "return last element of a list" in {
      val magicnum = 5
      val list = List(1, 2, 3, magicnum)
      assert(Problems.last(list) == magicnum)
    }

    "return penultimate element of the list" in {
      val magicnum = 3
      val list = List(1, 2, magicnum, 5)
      assert(Problems.penultimate(list) == magicnum)
    }

    "return nth element of the list" in {
      val n = 1
      val list = List(1, 2, 3, 5)
      val nth = list(n)
      assert(Problems.nthElem(n, list) == nth)
    }

    "return the length of a list" in {
      val list = List(1, 2, 3, 5)
      // assert(Problems.length(list) == 4)
      assert(Problems.lengthFun(list) == 4)
    }

    "throw IllegalArgumentException error" in {
      intercept[IllegalArgumentException] {
        assert(Problems.penultimate(List()) == 3)
      }
    }

    // TODO: write test for hello world
    // "Problem main func should return hello" in {
    //   assert(Problems.main("nothing") == "Hello, world!")
    // }
}
}
