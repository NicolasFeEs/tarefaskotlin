//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("entre com um valor ")
    val n = readLine()?.toIntOrNull()

    if (n == null) {
        println("valor entrado invalido")
    }else{
        println("valor entrado $n")
        if(n<10){
            println("valor entrado invalido")
        }else{
            for(i in 1..n){
                println("$i, USCS")
            }
        }
    }
}