package com.knoldus.implementations

import org.scalatest.flatspec.AnyFlatSpec

class DivideAndFibonacciImplTest extends AnyFlatSpec {

  val divideAndFibonacciImpl= new DivideAndFibonacciImpl()


  // Test cases to validate divide method

  "A number 10" should "return 5 when divide by 2" in{

    assert(divideAndFibonacciImpl.divide(10,2)==5)
  }
it should "throw ArithmeticException when divide by 0" in {
assertThrows[ArithmeticException] {
divideAndFibonacciImpl.divide(10,0)
}
}

//Test cases to validate fibonacci method.

"Fibonacci series starting with 0&1" should "be" in{

assert(divideAndFibonacciImpl.fibonacci(0,1,5)===Array[Int](0, 1 ,1, 2,3))
}

"Fibonacci series starting with 2&3" should "be" in{

assert(divideAndFibonacciImpl.fibonacci(2,3,5)===Array[Int](2,3,5,8,13))
}
}