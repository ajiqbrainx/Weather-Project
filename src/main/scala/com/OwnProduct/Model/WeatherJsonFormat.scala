package com.OwnProduct.Model

import spray.json.{DefaultJsonProtocol, RootJsonFormat}

object WeatherJsonFormat extends DefaultJsonProtocol {

  implicit val CoordinateDataJsonFormat: RootJsonFormat[Coordinate] = jsonFormat2(Coordinate)
  implicit val WeatherJsonFormat: RootJsonFormat[Weather] = jsonFormat4(Weather)
  implicit val MainJsonFormat: RootJsonFormat[Main] = jsonFormat6(Main)
  implicit val WindJsonFormat: RootJsonFormat[Wind] = jsonFormat2(Wind)
  implicit val CloudsJsonFormat: RootJsonFormat[Clouds] = jsonFormat1(Clouds)
  implicit val SysJsonFormat: RootJsonFormat[Sys] = jsonFormat6(Sys)
  implicit val WeatherDataJsonFormat: RootJsonFormat[WeatherData] = jsonFormat12(WeatherData)
}
