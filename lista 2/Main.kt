
fun main() {
    println("-----------inicio do programa-----------")
    print("entre com um valor numerico inteiro: ")

    val valor = readLine()?.toIntOrNull()

    if (valor != null) {
        println("valor entrado: $valor")

        if(valor > 10){
            println("valor entrado maior que 10")
        } else {
            println("valor entrado menor que 10")
        }
    } else {
        println("entre com um valor numerico inteiro")
    }

    println("-----------fim do programa-----------")
    print("pressione enter para sair")
    readLine()
}