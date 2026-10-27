
fun soma2numeros (n1 : Int, n2 : Int) :Int {
    return n1 + n2
}

fun main(){
    print("digite o primeiro numero: ")
    val n1 = readLine()!!.toInt()
    print("Digite o segundo numero: ")
    val n2 = readLine()!!.toInt()
    val soma = soma2numeros(n1, n2)
    println("$n1 + $n2 = ${soma}")
}