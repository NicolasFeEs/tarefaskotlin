fun main() {
    println("-----------inicio do programa-----------")
    print("entre com um valor numerico inteiro: ")

    val valor = readLine()?.toIntOrNull()

    if (valor != null) {
        println("valor entrado: $valor")

        if(valor % 2 == 0) {
            println("valor entrado é par")
        } else {
            println("valor entrado é impar")
        }
    } else {
        println("entre com um valor numerico inteiro")
    }

    println("-----------fim do programa-----------")
    print("pressione enter para sair")
    readLine()
}