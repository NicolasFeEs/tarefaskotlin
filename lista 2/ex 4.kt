fun main() {
    println("-----------inicio do programa-----------")
    print("entre a nota da p1: ")
    val nota1 = readLine()?.toDoubleOrNull()
    print("entre a nota da p2: ")
    val nota2 = readLine()?.toDoubleOrNull()
    print("entre a nota da p3: ")
    val nota3 = readLine()?.toDoubleOrNull()

    if (nota1 != null && nota2 != null && nota3 != null) {
        println("notas entradas; p1:$nota1 p2:$nota2 p3:$nota3")
        val media = (2*nota1 + 3*nota2 + 4*nota3) / 9
        println("media = $media")

        if(media > 5.0){
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