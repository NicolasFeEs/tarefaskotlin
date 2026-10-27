fun main() {
    println("-----------inicio do programa-----------")
    print("entre uma idade: ")

    val idade = readLine()?.toIntOrNull()

    if (idade != null) {
        println("idade entrada: $idade")

        if(18 < idade && idade < 67){
            println("pode doar sangue")
        } else {
            println("não pode doar sangue")
        }
    } else {
        println("idade invalida")
    }

    println("-----------fim do programa-----------")
    print("pressione enter para sair")
    readLine()
}