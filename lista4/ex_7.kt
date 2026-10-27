
fun maior(idade:Int):Boolean{
    if(idade > 18) return true
    else return false
}

fun main() {
    print("digite a idade: ")
    val idade = readLine()!!.toInt()
    if (maior(idade)) println("Maior")
    else println("Menor")
}