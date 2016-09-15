package com.allaboutscala.chapter.two.tutorial_04

/**
  * Created by rogierverkaik on 15-09-16.
  */
object TypeInference extends App {

  println("Step 1: Immutable variable")
  val donutsToBuy = 5

  println("\nStep 2: Scala Types")
  val donutsBought = 5
  val bigNumberOfDonuts = 1000000L
  val smallNumberOfDonuts = 1
  val priceOfDonut = 2.50
  val donutPrice = 2.50f
  val donutStoreName = "allaboutscala Donut Store"
  val donutByte = 0xa
  val nothing = ()

  println("\nStep 3: Using Scala compiler to convert from one data type to another")
  val numberOfDonuts: Short = 1
  val minimumDonutsToBuy: Int = numberOfDonuts

  println("\nStep 4: User driven conversion from one data type to another ")
  // NB: You cannot convert from an Int to a String
  val minimumDonutsToSell: String = numberOfDonuts.toString


}
