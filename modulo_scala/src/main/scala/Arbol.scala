package main.scala

abstract class EcuacionArbol
case class Sum(l: EcuacionArbol, r: EcuacionArbol) extends EcuacionArbol
case class Por(l: EcuacionArbol, r: EcuacionArbol) extends EcuacionArbol
case class Var(n: String) extends EcuacionArbol
case class Const(v: Int) extends EcuacionArbol

