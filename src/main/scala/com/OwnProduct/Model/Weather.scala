package com.OwnProduct.Model

final case class WeatherData(base: String,
                             visibility: Double,
                             dt: Double,
                             timezone: Double,
                             id: Double,
                             name: String,
                             cod: Int,
                             coord: Coordinate,
                             weather: Seq[Weather],
                             main: Main,
                             wind: Wind,
                             clouds: Clouds)

final case class Coordinate(lon: Double, lat: Double)

final case class Weather(id: Int, main: String, description: String, icon: String)

final case class Main(temp: Double,
                      feels_like: Double,
                      temp_min: Double,
                      temp_max: Double,
                      pressure: Double,
                      humidity: Double)

final case class Wind(speed: Double, deg: Double)

final case class Clouds(all: Double)

final case class Sys(`type`: Double,
                     id: Double,
                     message: Double,
                     country: String,
                     sunrise: Double,
                     sunset: Double)

