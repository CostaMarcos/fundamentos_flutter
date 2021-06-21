fun main(){
    println("Bem vindo ao Bytebank")
    forLoop(0, 5)
}


fun infoConta(i: Int){
    val titular: String = "Vinicin $i"
    val numeroConta: Int = 1000 + i
    var saldo = 10.0 + i

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")
    println()
}

fun whileLoop(fim: Int){

    var i = 0
    while(i < fim){
        infoConta(i)
        i++
    }
}

fun forLoop(init: Int, fim: Int){

    for (i in init..fim){
        infoConta(i)
    }
}

fun testaCondicoes(saldo: Double){

    if(saldo > 0.0) {
        println("Conta positiva")
    } else if(saldo == 0.0){
        println("Conta neutra")
    } else{
        println("Conta negativa")
    }

    when{
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("Conta neutra")
        saldo < 0.0 -> println("Conta negativa")
    }
}