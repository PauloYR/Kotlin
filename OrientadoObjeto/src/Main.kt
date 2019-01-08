fun main(args: Array<String>) {
    println("------------ UNO ---------------")
    var uno = Carro("Pink",2018,"UNO")
    println("Ano do carro ${uno.ano}")
    println("Cor do carro ${uno.cor}")
    println("Modelo do Carro ${uno.modelo}")
    uno.acelerar(100)
    uno.abriPorta()
    println("--------- Caminhão ------------")
    var scania = Caminhao("Branco",2015,"X 78",1000)
    println("Ano do carro ${scania.ano}")
    println("Cor do carro ${scania.cor}")
    println("Modelo do Carro ${scania.modelo}")
    println("Capacidade ${scania.capacidade}")

}

