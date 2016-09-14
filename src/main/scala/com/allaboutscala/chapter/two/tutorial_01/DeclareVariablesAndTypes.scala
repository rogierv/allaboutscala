package com.allaboutscala.chapter.two.tutorial_01

/**
  * Created by rogierverkaik on 14-09-16.
  */
object DeclareVariablesAndTypes extends App {

  val donutsToBuy: Int = 5

  var favoriteDonut: String = "Glazed Donut"
  favoriteDonut = "Vanilla Donut"

  lazy val donutService = "initialize some donut service"

  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 1000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutByte: Byte = 0xa
  val nothing: Unit = ()

  var leastFavoriteDonut: String = _
  leastFavoriteDonut = "Plain Donut"
}
