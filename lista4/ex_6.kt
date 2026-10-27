
fun IMC(peso : Int, altura : Int):Int{
    return peso/(altura*altura)
}

fun main(){
    print("insira o peso(kg): ")
    val peso = readLine()!!.toInt()
    print("insira a altura(m): ")
    val altura = readLine()!!.toInt()
    println(IMC(peso, altura))
}