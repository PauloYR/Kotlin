fun main(args: Array<String>) {
    var opcao: Int = 1
    when(opcao){
        1 -> {
            println("Conta Corrente")
        }
        2 -> println("Cartão de Credito")
        3 -> println("Internet Bank")
        else ->{
            println("Nenhuma das opções !")
        }
    }
    opcao = 2
    var str: String = when(opcao){
        1 -> {
            "Conta Corrente"
        }
        2 -> "Cartão de Credito"
        3 -> "Internet Bank"
        else ->{
            "Nenhuma das opções !"
        }
    }
    println(str)
}