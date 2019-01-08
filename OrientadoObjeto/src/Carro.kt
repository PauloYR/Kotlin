class Carro(override var cor:String ,override var ano: Int,override var modelo: String): Veiculo(cor,ano,modelo),iDirigivel{
    fun abriPorta(){
        println("Abrindo A porta do $modelo")
    }

    override fun acelerar(velociade: Int) {
        super.acelerar(velociade)
        println("Acelerando o $velociade Km/h")
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
