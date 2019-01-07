fun main(args: Array<String>) {
    var array = arrayOf("CE","RJ","SP")
    array[0] = "RJ"
    array[1] = "CE"

    var mix = arrayOf(1,"String",2)
    var int  = intArrayOf(1,2,3)
    for (i in array){
        println(i)
    }
    for ((j,valor) in array.withIndex()){
        println("Index $j - Valor $valor")
    }
    var outrosEstados = arrayOf("PA","BA","SC")
    var todosEstaods = array + outrosEstados
    println("Todos os Estaods")
    for(estados in todosEstaods){
        print(estados + " ")
    }
}