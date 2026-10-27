
fun concatena(str1: String, str2: String): String {
    return str1 + str2
}

fun main(){
    println("insira a primeira parte da string:")
    val str1 = readLine()!!
    println("insira a segunda parte da string:")
    val str2 = readLine()!!
    println(concatena(str1, str2))
}