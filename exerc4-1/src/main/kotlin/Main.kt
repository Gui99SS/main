fun main() {
    println("Digite 1 para calcular a taxa de Natalidade ou 2 para calcular a taxa de Mortalidade.")
    val calcular = readLine()!!.toInt()
    val taxaNatalidade:Double
    val taxaMortalidade:Double

    if (calcular == 1) {
        println("Digite o número de crianças nascidas: ")
        val numInfantil = readLine()!!.toDouble()
        println("Digite o número de habitantes: ")
        val numHabitantes = readLine()!!.toDouble()
        taxaNatalidade = (numInfantil * 1000) / numHabitantes
        println("A taxa de natalidade é ${taxaNatalidade}.")
    } else if (calcular == 2) {
        println("Digite o número de óbitos: ")
        val numDeObitos = readLine()!!.toDouble()
        println("Digite o número de habitantes: ")
        val numHabitantes = readLine()!!.toDouble()
        taxaMortalidade = (numDeObitos * 1000) / numHabitantes
        println("A taxa de mortalidade é ${taxaMortalidade}.")
    } else {
        println("Dados não informados.")
    }
}