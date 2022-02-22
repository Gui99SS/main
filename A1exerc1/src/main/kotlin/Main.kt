fun main() {
    println("Digite o valor de x: ")
    var x = readLine()!!.toInt()
    println("Digite o valor de y: ")
    var y = readLine()!!.toInt()
    println("Digite o valor de z: ")
    var z = readLine()!!.toInt()
    if (x == y && x == z) {
        println("Triângulo Equilátero.")
    } else if (x == y || z > x || z == y || x > y) {
        println("Triângulo Isósceles.")
    } else
        println("Triângulo Escaleno.")
}