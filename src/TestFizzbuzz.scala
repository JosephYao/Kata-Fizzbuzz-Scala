import org.scalatest.FunSuite

class TestFizzbuzz extends FunSuite {

  val fizzbuzz = new Fizzbuzz

  test("non fizzbuzz number should return itself") {
    assert ("1" === fizzbuzz.convert(1))
    assert ("2" === fizzbuzz.convert(2))
  }

  test("multiply of 3 should return fizz") {
    assert ("fizz" === fizzbuzz.convert(3))
    assert ("fizz" === fizzbuzz.convert(6))
  }

  test("multiply of 5 should return buzz") {
    assert ("buzz" === fizzbuzz.convert(5))
  }

  test("multiply of 3 and 5 should return fizzbuzz") {
    assert ("fizzbuzz" === fizzbuzz.convert(15))
  }

}
