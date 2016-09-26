package com.allaboutscala.chapter.three.tutorial_08

/**
  * Created by rogier.verkaik on 26-9-2016.
  */
object PolymorphicFunctionWithGenericReturnType extends App {

  println("Step 1: Review how to define a generic typed function which will specify the type of its parameter")
  def applyDiscount[T](discount: T): Unit = {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")
      case d: Double =>
        println(s"$d discount will be applied")
      case _ =>
        println("Unsupported discount type")
    }
  }

  println("\nStep 2: Review how to call a function which has typed parameters")
  applyDiscount("COUPON_123")
  applyDiscount[Double](10)

  println("\nStep 3: How to define a generic typed function which also has a generic return type")
  def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")
        Seq[T](discount)

      case d: Double =>
        println(s"$d discount will be applied")
        Seq[T](discount)

      case _ =>
        println("Unsupported discount type")
        Seq[T](discount)
    }
  }

  println("\nStep 4: How to call a generic typed function which also has a generic return type")
  println(s"Results of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}")
  println()
  println(s"Results of applyDiscountWithReturnType with Double parameter = ${applyDiscountWithReturnType[Double](10.5)}")
  println()
  println(s"Results of applyDiscountWithReturnType with Char parameter = ${applyDiscountWithReturnType[Char]('U')}")


}
