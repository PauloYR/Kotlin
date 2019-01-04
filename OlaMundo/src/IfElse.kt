fun main(args: Array<String>) {
    var int: Int  = 2
    var str = if (int > 1) "Maior que 1" else "Menos que 2"
    println(str)
    str =  if (int > 1){
        "Maior que 1"
    }else{
        "Menor que 2"
    }
    println(str)
}