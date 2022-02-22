 fun main() {
     println("Responda as perguntas com 1 para sim e 0 para não. \nMora perto da vítima?")
     val primeira = readLine()!!.toInt()
     println("Telefonou para a vítima? ")
     val segunda = readLine()!!.toInt()
     println("Já trabalhou com a vítima? ")
     val terceira = readLine()!!.toInt()
     println("Devia para a vítima? ")
     val quarta = readLine()!!.toInt()
     println("Esteve no local do crime? ")
     val quinta = readLine()!!.toInt()

     var resultado = primeira + segunda + terceira + quarta + quinta

        if (resultado == 2) {
            println("Suspeita!")
        } else if(resultado >=3 && resultado == 4) {
            println("Cúmplice!")
        } else if(resultado == 5) {
            println("Assassino!")
        } else {
            println("Inocente!")
        }
    }