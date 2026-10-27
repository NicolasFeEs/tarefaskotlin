fun main() {
    print("entre com um valor ")
    val n = readLine()?.toIntOrNull()

    if (n == null) {
        println("valor entrado invalido")
    }else{
        println("valor entrado $n")
        if(n<0){
            println("valor entrado invalido")
        }else{
            for(i in 0..n){
                println("$i, USCS")
            }
        }
    }
}