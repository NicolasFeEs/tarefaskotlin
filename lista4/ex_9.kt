fun fibonacci(numero: Int): Long {
    if (numero <= 1) return numero.toLong()

    var anterior = 0L
    var atual = 1L
    for (i in 2..numero) {
        val proximo = anterior + atual
        anterior = atual
        atual = proximo
    }
    return atual
}

fun main(){
    print("Digite um numero: ")
    var numero = readLine()!!.toInt()
    println("o valor de fibonacci para $numero é " + fibonacci(numero))
}