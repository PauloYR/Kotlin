package Automoveis

class Carro(override var cor: String, override var ano: Int, override var modelo: String) : Veiculo(cor, ano, modelo), iDirigivel {
    override fun acelerar(velociade: Int) {
        println("Acelerando o $velociade Km/h")
    }

    fun abriPorta() {
        println("Abrindo A porta do $modelo")
    }
}
/*
-------------Construtor Primario----------------
ex. 1:
    class Automoveis.Carro(cor:String , ano: Int, modelo: String){
        var cor: String
        var ano: Int
        var modelo: String

        init {
            this.cor = cor
            this.ano = ano
            this.modelo = modelo
        }
        fun acelerar(){
            println("Acelerando o $modelo")
        }
    }
ex. 2:
    class Automoveis.Carro(var cor:String ,var ano: Int,var modelo: String){

        init{//Não é obrigatorio

        }
        fun acelerar(){
            println("Acelerando o $modelo")
        }
    }
*/
