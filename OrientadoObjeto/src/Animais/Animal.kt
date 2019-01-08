package Animais

open class Aninmal{
    private var nome  = "Maria"
    protected  var ano = 2014
    internal var tipo = "Mamifero"//Só e visto no mesmo arquivo

    fun getNome() : String{
        return this.nome
    }
    fun setNome( nome: String ){
        this.nome = nome
    }
}