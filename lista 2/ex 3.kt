fun main() {
    println("-----------inicio do programa-----------")
    print("entre a nota 1: ")
    val nota1 = readLine()?.toDoubleOrNull()
    print("entre a nota 2: ")
    val nota2 = readLine()?.toDoubleOrNull()
    print("entre a nota 3: ")
    val nota3 = readLine()?.toDoubleOrNull()

    if (nota1 != null && nota2 != null && nota3 != null) {
        println("notas entradas; nota1:$nota1 nota2:$nota2 nota3:$nota3")
        val media = (nota1 + nota2 + nota3) / 2
        println("media = $media")

        if(media > 6.0){
            println("aprovado")
        } else {
            println("reprovado")
        }
    } else {
        println("uma das notas entrada é invalida")
    }

    println("-----------fim do programa-----------")
    print("pressione enter para sair")
    readLine()
}