fun main() {
    println("Digite qnts litros de álcool deseja abastecer: ")
    var a = readLine()!!.toDouble()
    println("Digite qnts litros de gasolina deseja abastecer: ")
    var g = readLine()!!.toDouble()
    println("Digite o valor do litro do álcool: ")
    var precoA = readLine()!!.toDouble()
    println("Digite o valor do litro da gasolina: ")
    var precoG = readLine()!!.toDouble()
    var precoFinalA:Double
    var precoFinalG:Double

    if (a > 20) {
       precoFinalA = a * precoA - precoA * 5 / 100
        println("O preço total será ${precoFinalA}.")
    } else if (a <= 20) {
        precoFinalA = a * precoA - precoA * 3 / 100
        println("O preço total será ${precoFinalA}.")
    }
     if (g > 20) {
         precoFinalG = g * precoG - precoG * 6 / 100
         println("O preço total será ${precoFinalG}.")
    } else if (g <= 20) {
         precoFinalG = g * precoG - precoG * 4 / 100
         println("O preço total será ${precoFinalG}.")
    }
}