package one.digitalinnovationone.digionebank

class Pessoa{
    var nome: String = "Weslley"

    var cpf: String = "088.002.000-99"
    private set

}

fun main() {
    val weslley = Pessoa()

    println(weslley.nome)
    println(weslley.cpf)
}