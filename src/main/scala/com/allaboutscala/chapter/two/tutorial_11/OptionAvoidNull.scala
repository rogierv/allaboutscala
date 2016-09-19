package com.allaboutscala.chapter.two.tutorial_11

/**
  * Created by rogierverkaik on 17-09-16.
  */
object OptionAvoidNull extends App {

  println("Step 1: How to use Option and None - a basic example")
  val glazedDonutTaste: Option[String] = Some("Very Tasty")
  println(s"Glazed Donut taste = ${glazedDonutTaste.get}")

  println("\nStep 2: How to use Option and None - a basic example")
  val glazedDonutName: Option[String] = None
  println(s"Glazed Donut name = ${glazedDonutName.getOrElse("Glazed Donut")}")

  println("\nStep 3: How to use Pattern Matching with Option")
  glazedDonutName match {
    case Some(name) => println(s"Received donut name = $name")
    case None       => println("No donut was found!")
  }

  println("\nTip 1: Filter None using map function")
  glazedDonutTaste.map(taste => println(s"Glazed Donut Taste = $taste"))
  glazedDonutName.map(name => println(s"Glazed Donut Name = $name"))

}
