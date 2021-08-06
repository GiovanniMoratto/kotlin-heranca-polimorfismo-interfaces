/**
 *@Author giovanni.moratto
 */

fun main() {
    println("Bem vindo ao Bytebank")

    val giovanni = Funcionario(
        nome = "Giovanni",
        cpf = "111.111.111-11",
        salario = 1000.0,
        tipo = 0
    )

    println("nome ${giovanni.nome}")
    println("cpf ${giovanni.cpf}")
    println("salario ${giovanni.salario}")
    println("bonificação ${giovanni.bonificacao()}")
}