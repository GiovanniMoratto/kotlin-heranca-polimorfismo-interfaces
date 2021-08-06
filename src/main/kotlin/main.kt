/**
 *@Author giovanni.moratto
 */

fun main() {
    println("Bem vindo ao Bytebank")

    val giovanni = Funcionario(
        nome = "Giovanni",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )

    println("nome ${giovanni.nome}")
    println("cpf ${giovanni.cpf}")
    println("salario ${giovanni.salario}")
    println("bonificação ${giovanni.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }

}