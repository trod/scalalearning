package com.github.trod

object Algorythms {
  def sqrt(x: Double) = {
    val start = 1.0

    sqrtIter(start, x)
    def abs(x: Double) = if (x > 0) x else -x

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) = {
      abs(guess * guess - x) < 0.001
    }

    def improve(guess: Double, x: Double) = {
      println("i:" + guess)
      (guess + x / guess) / 2
    }
  }
}
