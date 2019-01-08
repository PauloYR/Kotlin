fun main(args: Array<String>) {
    /*-------------List---------------*/
    val items = listOf("SP", "RJ", "SC")

    val numeros = mutableListOf(1, 2, 3)//Mutavel

    val mix = arrayListOf("SP", 1, 2, 3)//

    var array =  arrayListOf("João", "Maria", "Fillipe")
    array.add("Jiselle")
    println(array)
    println(array.size)
    array.remove("Maria")
    println(array)
    println(array.size)
    println(array.contains("João"))
    for(nome in array){
        println(nome)
    }
    /*-------------HashSet---------------*/
    println("-------------------HashSet-------------------")
    var set = hashSetOf(1,2,3,3,45,60,60,60,70)//não repete e tira da ordem se tiver repetido
    set.remove(60)
    set.add(100)
    for (item in set){
        println(item)
    }
    /*---------------Map-----------------*/
    println("-------------------HashMap-------------------")
    var map = hashMapOf("Chave1" to 1,"Chave2" to 2)
    map.remove("Chave2")
    map.put("Chave4",4)

    for (keys in map.values){//.key mostra a chaves ||.values mostra os valores
        println(keys)

    }
}