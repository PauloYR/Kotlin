import java.util.*

fun main(args: Array<String>) {
    olaMundo()
    println(horaAtual())
    var total = soma(2,3)
    println("Minha soma é : $total")
}

fun olaMundo(){
    println("Olá Mundo")
}

fun soma(x: Int,j :Int) :Int{
    return x +j
}
fun horaAtual(): Date {
    return Date()
}