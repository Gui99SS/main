import kotlin.math.pow

class calculosFisica {
    fun forcaPeso(num1: Float, num2: Float): Float {
        return num1 * num2
        // P = m * g
    }

    fun forcaCentripeta(num3: Double, num4: Double, num5: Double, expoente2: Double): Double {
        return (num3 * num4.pow(expoente2)) / num5
        // F = m * V² / R
    }

    fun impulso(num6: Float, num7: Float, num8: Float): Float {
        return num6 * (num7 - num8)
        // i = F * T - To
    }

    fun forcaElastica(num9: Float, num10: Float): Float {
        return num9 * num10
        // Fe = k * X
    }

    fun velocidadeMedia(num11: Float, num12: Float, num13: Float, num14: Float): Float {
        return (num11 - num12) / (num13 - num14)
        // Vm = S - So / T - To
    }

    fun movimentoRetilineoUniforme(num15: Float, num16: Float, num17: Float, num18: Float): Float {
        return num15 + (num16 * (num17 - num18))
        // s = So + v * (T - To)
    }

    fun movimentoRetilineoUniformementeVariado(num19: Double, num20: Double, num21: Double, num22: Double, expoente: Double): Double {
        return num19 + (num20 * num21) + (num22 * num21.pow(expoente)) / 2
        // s = So + Vo * T + a * T² / 2
    }

}