fun main() {
    val minhaCalc = calculosFisica()

    println("Para descobrir a força peso, digite o valor da massa:")
    val num1: Float = readLine()!!.toFloat()
    println("Para descobrir a força peso, digite o valor da gravidade:")
    val num2: Float = readLine()!!.toFloat()
    // P = m * g

    println("Para descobrir a força centrípeta, digite o valor da massa:")
    val num3: Float = readLine()!!.toFloat()
    println("Para descobrir a força centrípeta, digite o valor da velocidade:")
    val num4: Float = readLine()!!.toFloat()
    println("Para descobrir a força centrípeta, digite o valor do raio:")
    val num5: Float = readLine()!!.toFloat()
    println("Para descobrir a força centrípeta, digite 2")
    val expoente2: Float = readLine()!!.toFloat()
    // F = m * V² / R

    println("Para descobrir o impulso, digite o valor da força:")
    val num6: Float = readLine()!!.toFloat()
    println("Para descobrir o impulso, digite o valor do tempo final:")
    val num7: Float = readLine()!!.toFloat()
    println("Para descobrir o impulso, digite o valor do tempo inicial:")
    val num8: Float = readLine()!!.toFloat()
    // i = F * (T - To)

    println("Para descobrir a força elástica, digite o valor da constante elástica do corpo:")
    val num9: Float = readLine()!!.toFloat()
    println("Para descobrir a força elástica, digite o valor da deformação do corpo:")
    val num10: Float = readLine()!!.toFloat()
    // Fe = k * X

    println("Para descobrir a velocidade média, digite o valor da posição inicial:")
    val num11: Float = readLine()!!.toFloat()
    println("Para descobrir a velocidade média, digite o valor do posição final:")
    val num12: Float = readLine()!!.toFloat()
    println("Para descobrir a velocidade média, digite o valor do tempo final:")
    val num13: Float = readLine()!!.toFloat()
    println("Para descobrir a velocidade média, digite o valor do tempo inicial:")
    val num14: Float = readLine()!!.toFloat()
    // Vm = S - So / T - To

    println("Para descobrir o MRU, digite o valor da posição inicial:")
    val num15: Float = readLine()!!.toFloat()
    println("Para descobrir o MRU, digite o valor da velocidade:")
    val num16: Float = readLine()!!.toFloat()
    println("Para descobrir o MRU, digite o valor do tempo final:")
    val num17: Float = readLine()!!.toFloat()
    println("Para descobrir o MRU, digite o valor do tempo inicial:")
    val num18: Float = readLine()!!.toFloat()
    // s = So + v * t

    println("Para descobrir o MRUV, digite o valor da posição inicial:")
    val num19: Float = readLine()!!.toFloat()
    println("Para descobrir o MRUV, digite o valor da velocidade:")
    val num20: Float = readLine()!!.toFloat()
    println("Para descobrir o MRUV, digite o valor do tempo:")
    val num21: Float = readLine()!!.toFloat()
    println("Para descobrir o MRUV, digite o valor da aceleração:")
    val num22: Float = readLine()!!.toFloat()
    println("Para descobrir o MRUV, digite 2")
    val expoente: Float = readLine()!!.toFloat()
    // s = So + Vo * t + a * t² / 2

    val forcaPeso = minhaCalc.forcaPeso(num1, num2)
    val forcaCentripeta = minhaCalc.forcaCentripeta(num3.toDouble(), num4.toDouble(), num5.toDouble(), expoente2.toDouble())
    val impulso = minhaCalc.impulso(num6, num7, num8)
    val forcaElastica = minhaCalc.forcaElastica(num9, num10)
    val velocidadeMedia = minhaCalc.velocidadeMedia(num11, num12, num13, num14)
    val movimentoRetilineoUniforme = minhaCalc.movimentoRetilineoUniforme(num15, num16, num17, num18)
    val movimentoRetilineoUniformementeVariado = minhaCalc.movimentoRetilineoUniformementeVariado(num19.toDouble(), num20.toDouble(), num21.toDouble(), expoente.toDouble(), num22.toDouble())

    println("A força peso é $forcaPeso")
    println("A força centrípeta é $forcaCentripeta")
    println("O impulso é $impulso")
    println("A força elástica é $forcaElastica")
    println("A velocidade média é $velocidadeMedia")
    println("O resultado do MRU é $movimentoRetilineoUniforme")
    println("O resultado do MRUV é $movimentoRetilineoUniformementeVariado")
}