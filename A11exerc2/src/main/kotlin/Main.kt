fun main() {
    println("Digite um ano: ")
    val ano = readLine()!!.toInt()

    if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)){
     println("$ano é ano bissexto.")
} else {
    println("$ano não é ano bissexto.")
}
}