package com.allaboutscala.chapter.two.tutorial_06

/**
  * Created by rogier.verkaik on 15-9-2016.
  */
object ForComprehension extends App {

  println("Step 1: A simple for loop from 1 to 5 inclusive")
  for (numberOfDonuts <- 1 to 5) {
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("\nStep 2: A simple for loop from 1 to 5, where 5 is NOT inclusive")
  for (numberOfDonuts <- 1 until 5) {
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("\nStep 3: Filter values using if conditions in for loop")
  val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
  for (ingredient <- donutIngredients if ingredient == "sugar") {
    println(s"Found sweetening ingredient = $ingredient")
  }

  println("\nStep 4: Filter values using if conditions in for loop and return back using the yield keyword")
  val sweeteningIngredients = for {
    ingredient <- donutIngredients
    if ingredient == "sugar" || ingredient == "syrup"
  } yield ingredient
  println(s"Sweetening ingredients = $sweeteningIngredients")

  val twoDimensionalArray = Array.ofDim[String](2,2)
  twoDimensionalArray(0)(0) = "flour"
  twoDimensionalArray(0)(1) = "sugar"
  twoDimensionalArray(1)(0) = "egg"
  twoDimensionalArray(1)(1) = "syrup"

  println("\nStep 5: Using for comprehension to loop through 2-Dimensional array")
  for {
    x <- 0 to 1
    y <- 0 to 1}
    println(s"Donut ingredient at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")

}
