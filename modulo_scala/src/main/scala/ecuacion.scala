import main.scala._

//1+2 y (x + x)+(7+ y)
object Ecuacion {
  type Entorno = String => Int

  def eval(t: EcuacionArbol, ent: Entorno): Int = t match {
    case Sum(l, r) => eval(l, ent) + eval(r, ent)
    case Por(l, r) => eval(l, ent) * eval(r, ent)
    case Var(n) => ent(n)
    case Const(v) => v
  }

  def main(args: Array[String]) {
    val entrada: Entorno = { case "x" => 5 case "y" => 7 }
    val expresion: EcuacionArbol = Sum(    Sum(  Const(1), Por( Por(Const(2),Var("y")),Sum(Var("x"),Var("x")) ) ),Sum(Const(7),Var("y")) )
    println("el resultado de la ecuacion 1+2 y (x + x)+(7+ y) es: " + eval(expresion, entrada))
  }

}