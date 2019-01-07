class Carro(var cor:String ,var ano: Int,var modelo: String){

    fun acelerar(){
        println("Acelerando o $modelo")
    }
}
/*
-------------Construtor Primario----------------
ex. 1:
    class Carro(cor:String , ano: Int, modelo: String){
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
    class Carro(var cor:String ,var ano: Int,var modelo: String){

        init{//Não é obrigatorio

        }
        fun acelerar(){
            println("Acelerando o $modelo")
        }
    }
*/
