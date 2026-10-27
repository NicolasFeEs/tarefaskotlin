
fun quadrados (numero : Int){
    for (i in 1..numero) {
        println("$i ao quadrado é igual a" + numero*numero)
    }
}

fun main(){
    println("digite um numero")
    val numero = readLine()!!.toInt()
    quadrados(numero)
}