
fun fatorial(numero:Int): Long{
    var resultado = 1L
    for (i in 1..numero) {
        resultado *= i
    }
    return resultado
}

fun main(){
    println("Digite um numero")
    val numero = readLine()!!.toInt()
    println("o fatorial de $numero é" + fatorial(numero))
}