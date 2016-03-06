import org.scalatest._

class TraitsSpec extends WordSpec with Matchers {
  "All Traits" should {
    "be equal" in {
      val magicnum = 5
      val list = List(1, 2, 3, magicnum)
      assert(Problems.last(list) == magicnum)
    }
  }
}
