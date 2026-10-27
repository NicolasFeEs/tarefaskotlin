fun main(){
    val cont = 10
    var soma = 0
    for (i in 1..cont){
        println("insira o valor $i:")
        val aux = readLine()?.toIntOrNull()
        if (aux != null) {
            if (aux%2==0){
                soma += aux
            }
        }
    }
    println("soma = $soma")
}