import scala.collection.immutable.ListMap

class Fizzbuzz {

  def convert(n: Int) = {
    val matchers = ListMap(
      isFizzbuzz _ -> "fizzbuzz",
      isFizz _ -> "fizz",
      isBuzz _ -> "buzz",
      isNotFizzOrBuzz _ -> n.toString
    )

    (for ((isMatched, matchedText) <- matchers if isMatched(n))
     yield matchedText).head
  }

  def isFizzbuzz(n: Int) = isFizz(n) && isBuzz(n)

  def isFizz(n: Int) = n % 3 == 0

  def isBuzz(n: Int) = n % 5 == 0

  def isNotFizzOrBuzz(n: Int) = true

}
