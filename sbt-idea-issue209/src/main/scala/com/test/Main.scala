package com.test

import generated.Shiporder

object MyApp extends App {
  val order = new Shiporder
  order.setOrderperson("John")
  println(order.getOrderperson)
}