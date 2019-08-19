import Temporizador.contador
//asi podemos usar la misva var en los dos objetos
//x: () => unit es el tipo de todas las funciones que no tienen parámetros de entrada
//el parametro anterior aunque vacio tiene que ser usado como se ve en la linea 9

object Temporizador {
  var contador = 0
  def unaVezPorSegundo(args: () => Unit) {
    while (contador < 3) { Thread sleep 1000; args() }
  }
  def elTiempoVuela() {
    println("el tiempo pasa volando...")
    contador += 1
  }
  def main(args: Array[String]) {
    unaVezPorSegundo(elTiempoVuela)
  }
}
//una version en la que se usa una funcion sin nombre de un solo uso llamada anonima es dejar abierto el => saltandonos una
//def el tiempo vuela
object TemporizadorAnonimo {
  def unaVezPorSegundoAnonimo(repite: () => Unit) {
    while (contador == 3) { repite(); Thread sleep 1000 }
  }
  def main(args: Array[String]) {
    unaVezPorSegundoAnonimo(() =>
      println("el tiempo pasa volando segunda parte..."))
  }
}
