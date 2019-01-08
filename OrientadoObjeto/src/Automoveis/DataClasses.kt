package Automoveis

//São classes que não fazem nada, apenas carregam dados de um lado
//para o outro e por padrão já vem com algumas funcionalidades implementadas
data class DataLivro(val titulo: String, val autor: String, val ano: Int)

class Livro(val titulo: String, val autor: String, val ano: Int)
fun main(args: Array<String>) {
    val dataLivro = DataLivro("AndroidPro Book", "Fellipe Cordeiro", 2017)
    val dataLivro2 = DataLivro("AndroidPro Book", "Fellipe Cordeiro", 2017)
    val (titulo, autor, ano) = dataLivro
    println("$titulo $autor $ano")
    println("Data Automoveis.Livro é igual ? ${dataLivro.equals(dataLivro2)}")

    val livro = Livro("AndroidPro Book", "Fellipe Cordeiro", 2017)
    val livro2 = Livro("AndroidPro Book", "Fellipe Cordeiro", 2017)

    println("Automoveis.Livro é igual ? " + livro.equals(livro2))

}

