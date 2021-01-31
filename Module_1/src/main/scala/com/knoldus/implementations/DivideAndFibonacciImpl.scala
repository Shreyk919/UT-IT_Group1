package com.knoldus.implementations

import com.knoldus.`trait`.DivideAndFibonacci


class DivideAndFibonacciImpl extends DivideAndFibonacci {
  override def divide(numerator: Int, denominator: Int): Int = {
    numerator / denominator
  }

  override def fibonacci(firstNumber: Int, secondNumber: Int, noOfTermsInSeries: Int): Array[Int] = {
    var fibonacciSeries: Array[Int] = new Array[Int](noOfTermsInSeries)
    var firstNo = firstNumber
    var secondNo = secondNumber
    fibonacciSeries(0) = firstNumber
    fibonacciSeries(1) = secondNumber
    for (i <- 2 until noOfTermsInSeries) {
      val sum = firstNo + secondNo
      fibonacciSeries(i) = sum
      firstNo = secondNo
      secondNo = sum
    }
    fibonacciSeries

  }


}

