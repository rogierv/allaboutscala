package com.allaboutscala.chapter.two.tutorial_12

/**
  * Created by rogierverkaik on 17-09-16.
  */
object ClassAndTypeHierarchy extends App {

  println("Step 1: Declare a variable of type Any")
  val favoriteDonut: Any = "Glazed Donut"
  println(s"Favorite donut of type Any = $favoriteDonut")

  println("\nStep 2: Declare a variable of type AnyRef")
  val donutName: AnyRef = "Glazed Donut"
  println(s"Donut name of type AnyRef = $donutName")

  println("\nStep 3: Declare a variable of type AnyVal")
  val donutPrice: AnyVal = 2.50
  println(s"Donut price of type AnyVal = $donutPrice")
}
