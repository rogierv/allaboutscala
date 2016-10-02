package com.allaboutscala.chapter.three.tutorial_09

/**
  * Created by rogierverkaik on 01-10-16.
  */
object VariableArgumentFunction extends App {

  println("Step 1: Create function with variable arguments")
  def printReport(names: String*): Unit = {
    println(s"""Donut Report = ${names.mkString(", ")}""")
  }

  println("\nStep 2: How to call a function which takes variable number of String arguments")
  printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport("Chocolate Donut")

  println("\nStep 3: How to pass a list to a function with variable number of arguments")
  val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport(listDonuts: _*)

  println("\nStep 4: How to pass a Sequence to a function with variable number of arguments")
  val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donut")
  printReport(seqDonuts: _*)

  println("\nStep 5: How to pass an Array to a function with variable number of arguments")
  val arrDonuts: Array[String] = Array("Coconut Donut")
  printReport(arrDonuts: _*)


}
