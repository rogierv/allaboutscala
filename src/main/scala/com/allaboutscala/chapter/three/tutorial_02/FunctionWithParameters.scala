package com.allaboutscala.chapter.three.tutorial_02

/**
  * Created by rogierverkaik on 20-09-16.
  */
object FunctionWithParameters extends App {

  println("Step 1: How to define function with parameters")
  def calculateDonutCost(donutName: String, quantity: Int): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")
    // Make some calculations
    2.50 * quantity
  }

  println("\nStep 2: How to call a function with parameters")
  val totalCost = calculateDonutCost("Glazed Donut", 5)
  println(s"Total costs of donut = $totalCost")

  println("\nStep 3: How to add default values to functions parameters")
  def calculateDonutCost(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity, couponcode = $couponCode")
    // Make some calculations
    2.50 * quantity
  }

  println("\nStep 4: How to call a function with parameters that has default values")
  val totalCostWithDiscount = calculateDonutCost("Glazed Donut", 4, "COUPON_12345")
  val totalCostWithoutDiscount = calculateDonutCost("Plain Donut", 4)

}
