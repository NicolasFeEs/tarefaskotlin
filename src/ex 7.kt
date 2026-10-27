fun main() {
    println("-----------inicio do programa-----------")
    print("entre com um valor numerico inteiro: ")
    val valor1 = readLine()?.toIntOrNull()
    print("entre com outro valor numerico inteiro: ")
    val valor2 = readLine()?.toIntOrNull()

    if (valor1 != null && valor2 != null) {
        println("valores entrados: $valor1 e $valor2")

        if(valor1 == valor2) {
            println("valores entrados são iguais")
        } else {
            if (valor1 < valor2) {
                println("valor 2 é maior: $valor2")
            } else {
                println("valor 1 é maior: $valor1")
            }
        }
    } else {
        println("um dos valores entrados é invalido")
    }

    println("-----------fim do programa-----------")
    print("pressione enter para sair")
    readLine()
}