package com.allaboutscala.chapter.two.tutorial_03

/**
  * Created by rogierverkaik on 14-09-16.
  */
object EscapeCharactersAndMultilineString extends App {

  println("Step 1: How to escape a JSON String")
  //val donutJson: String = "{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"

  println("\nStep 2: Using backslash to escape quotes")
  val donutJson2: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson2 = $donutJson2")

  println("\nStep 3: Using triple quotes \"\"\" to escape characters")
  val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson3 = $donutJson3")

  println("\nStep 4: Creating multi-line text using stripMargin")
  val donutJson4: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """.stripMargin
  println(s"donutJson4 = $donutJson4")

  println("\nTip: stripMargin using a different character")
  val donutJson5: String =
    """
      #{
      #"donut_name":"Glazed Donut",
      #"taste_level":"Very Tasty",
      #"price":2.50
      #}
    """.stripMargin('#')
  println(s"donutJson5 = $donutJson5")
}

