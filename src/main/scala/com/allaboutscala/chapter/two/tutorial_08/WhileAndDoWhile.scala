package com.allaboutscala.chapter.two.tutorial_08

/**
  * Created by rogierverkaik on 15-09-16.
  */
object WhileAndDoWhile extends App {

  println("Step 1: How to use while loop in Scala")
  var numberOfDonutsToBake = 10
  while (numberOfDonutsToBake > 0) {
    println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
    numberOfDonutsToBake -= 1
  }

  println("Step 1: How to use do while loop in Scala")
  var numberOfDonutsBaked = 0
  do {
    numberOfDonutsBaked += 1
    println(s"Number of donuts baked = $numberOfDonutsBaked")
  } while (numberOfDonutsBaked < 5)

}
