package com.allaboutscala.chapter.two.tutorial_13

/**
  * Created by rogierverkaik on 17-09-16.
  */
object Enumerations extends App {

  println("Step 1: How to create an enumeration")
  object Donut extends Enumeration {
    type Donut = Value

    val Glazed      = Value("Glazed")
    val Strawberry  = Value("Strawberry")
    val Plain       = Value("Plain")
    val Vanilla     = Value("Vanilla")
  }

  println("\nStep 2: How to print the String value of the enumeration")
  println(s"Vanilla donut string value = ${Donut.Vanilla}")

  println("\nStep 3: How to print the id of the enumeration")
  println(s"Vanilla donut's id = ${Donut.Vanilla.id}")

  println("\nStep 4: How to print all the values of the enumeration")
  println(s"All donuts types = ${Donut.values}")

  println("\nStep 5: How to pattern match on enumeration values")
  Donut.values.foreach {
    case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"Found favorite donut = $d")
    case _ => None
  }

  println("\nStep 6: How to change the default ordering of enumeration values")
  object DonutTaste extends Enumeration {
    type DonutTaste = Value

    val Tasty     = Value(0, "Tasty")
    val VeryTasty = Value(1, "Very Tasty")
    val Ok        = Value(-1, "Ok")
  }

  println(s"Donut taste values = ${DonutTaste.values}")
  println(s"Donut taste of Ok = ${DonutTaste.Ok.id}")

}
