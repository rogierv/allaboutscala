package com.allaboutscala.chapter.three.tutorial_06

/**
  * Created by rogier.verkaik on 26-9-2016.
  */
object ImplicitFunction extends App {

  println("Step 1: How to create a wrapper String class which will extend the String type")
  class DonutString(s: String) {
    def isFavoriteDonut: Boolean = s == "Glazed Donut"
  }

  println("\nStep 2: How to create an implicit function to convert a String to the wrapper String class")
  object DonutConversion {
    implicit def stringToDonutString(s: String) = new DonutString(s)
  }

  println("\nStep 3: How to import the String conversion so that it is in scope")
  import DonutConversion._

  println("\nStep 4: How to create String values")
  val glazedDonut = "Glazed Donut"
  val vanillaDonut = "Vanilla Donut"

  println("\nStep 5: How to access the custom String function called isFavoriteDonut")
  println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavoriteDonut}")
  println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavoriteDonut}")
}
