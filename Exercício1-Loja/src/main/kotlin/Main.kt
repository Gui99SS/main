fun main() {
    val bob:Vendedor = Vendedor()
    bob.nome = "João"
    bob.endereco = "Rua Fulano Ciclano"
    bob.telefoneComercial = "(51) 98324-3079"

    println("Qual o nome do vendedor?")
    bob.nome = readLine()
    println("Qual o endereço do vendedor?")
    bob.endereco = readLine()
    println("Qual o telefone comercial do vendedor?")
    bob.telefoneComercial = readLine()
    println("O número de telefone do ${bob.nome} da ${endereço} é ${telefoneComercial}.")
}