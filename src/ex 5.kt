fun main() {
    println("-----------inicio do programa-----------")
    print("entre o preço do produto: ")
    val preço = readLine()?.toDoubleOrNull()
    print("digite a quantidade do produto: ")
    val quantidade = readLine()?.toIntOrNull()
    var desconto = 1
    if (preço != null && quantidade != null) {
        println("preço: $preço, quantidade: $quantidade")
        if (quantidade > 10) {
            desconto = 0,9
        }
        var total = quantidade * preço * desconto
        println("valor total = $total")

    } else {
        println("uma das entradas é invalida")
    }

    println("-----------fim do programa-----------")
    print("pressione enter para sair")
    readLine()
}