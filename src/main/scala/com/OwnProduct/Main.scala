package com.OwnProduct

import com.OwnProduct.Model._
import com.OwnProduct.Model.WeatherJsonFormat._

import scala.io.Source
import spray.json._

object Main extends App {

  val source = Source.fromFile("weather.json")

  try {
    val input = source.mkString
//    println(input)

    val jsValue=input.parseJson
//    println(jsValue.prettyPrint)

    val weatherData: WeatherData =jsValue.convertTo[WeatherData]

    println(weatherData)
  } catch {
    case e: Exception => println(e.getMessage)
  } finally {
    source.close()
  }
}
