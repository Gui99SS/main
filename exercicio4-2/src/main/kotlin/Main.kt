fun main (){
    println("Digite o valor do Produto: ")
    val valor = readLine()!!.toDouble()
    println("Escolha o método de pagamento.\nDigite 1 para pagar à vista: \nDigite 2 para pagar à prazo (30 dias): \nDigite 3 paga pagar parcelado até 12 vezes: ")
    val metodo = readLine()!!.toInt()
    val valorFinal:Double

    if (metodo == 1) {
        valorFinal = valor - (valor / 10)
        println("O preço total à vista será ${valorFinal}.")
    } else if (metodo == 2) {
        valorFinal = valor + (valor * 3 / 100)
        println("O preço total à prazo de 30 dias será ${valorFinal}.")
    } else if (metodo == 3) {
        println("Digite o nº de parcelas escolhidos (lembrando que o limite é 12 meses): ")
        val mes = readLine()!!.toInt()
        valorFinal = valor + (valor * (1.5 / 100)) * mes
        println("O preço total parcelado será ${valorFinal}.")
    }  else if (metodo < 1){
        println("Nenhum método de pagamento selecionado.")
    } else if (metodo > 3){
        println("Nenhum método de pagamento selecionado.")
    }
}