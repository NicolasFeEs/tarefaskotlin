//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun saudacao(nome: String?, idade: Int?): String {
    return ("ola, " + nome + " !  Voce tem " + idade + " anos!")
}

fun main() {
    val nome : String?
    val idade : Int?

    println("entre o nome")
    nome = readLine()

    println("entre a idade")
    idade = readLine()?.toIntOrNull()

    val retorno = saudacao(nome, idade)
    println(retorno)
}