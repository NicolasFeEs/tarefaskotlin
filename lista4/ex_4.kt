
fun verificaparidade(numero : Int) : Boolean {
    return numero%2 == 0
}

fun main(){
    print("Digite o numero: ")
    val numero = readLine()!!.toInt()
    if (verificaparidade(numero)){
        println("o numero $numero é par")
    }else{
        println("o numero $numero é impar")
    }
}