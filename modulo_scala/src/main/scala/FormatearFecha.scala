import java.util.{Date, Locale}
import java.text.DateFormat._
object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now);"""o lo que es lo mismo"""
    //olo que es lo mismo
    println(df.format(now));
    println(1+2*3/9);
    """esto es lo mismo dado que cada numero es un objeto y utiliza el del interior del parentesis resolviendolos de dentro a fuera
    el 9 es el primero y es el divisor del resultado de todo lo demas y asi sucesivamente"""
    println(1.+(2.*(3./(9))))
    """Quizá más sorprendente para el programador Java, las funciones también son objetos en Scala. Por tanto es posible pasar
      |funciones como argumentos, guardarlas en variables y devolverlas como respuesta de otras funciones. Esta habilidad para
      |manipular funciones como valores es una de las piedras angulares de un interesante
      |paradigma de programación llamado programación funcional."""
  }
}
