package com.allaboutscala.chapter.three.tutorial_05

/**
  * Created by rogierverkaik on 25-09-16.
  */
object FunctionsWithImplicitParameters extends App {

  println("Step 1: How to define a function with an implicit parameter")
  def totalCost(donutType: String, quantity: Int)(implicit discount: Double): Double = {
    println(s"Calculating the price for $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  println("\nStep 2: How to define an implicit value")
  implicit val discount: Double = 0.1
  println(s"All customers will receive a ${discount * 100}% discount")

  println("\nStep 3: How to call a function which has an implicit parameter")
  println(s"""Total cost with discount of 5 Glazed Donut = ${totalCost("Glazed Donut", 5)}""")

  println("\nStep 4: How to define a function which takes multiple implicit parameters")
  def totalCost2(donutType: String, quantity: Int)(implicit discount: Double, storeName: String) = {
    println(s"[$storeName] Calculating the price for $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  println("\nStep 5: How to call a function which takes multiple implicit parameters")
  implicit val storeName: String = "Tasty Donut Store"
  println(s"""Total cost with discount of 5 Glazed Donut = ${totalCost2("Glazed Donut", 5)}""")

  println("\nStep 6: How to manually pass-through implicit parameters")
  println(s"""Total cost with discount of 5 Glazed Donuts, manually passed-through = ${totalCost2("Glazed Donut", 5)(0.15, "Scala Donut Store")}""")


}
