package Automoveis

open class Veiculo(open var cor: String, open var ano: Int, open var modelo: String ){
    init {
        println("Construindo um $modelo")
    }
}