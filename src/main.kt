fun main() {
    println("Bem vindo ao Bytebank")
    val contaVinicius = Conta("Vinicius", 100)
    var contaMarcos = Conta("Marcos", 101)

    contaVinicius.deposita(100.0)
    contaMarcos.deposita(50.0)

    contaVinicius.transfere(25.0, contaMarcos)
    println("Saldo Vinicius ${contaVinicius.saldo}")
    println("Saldo Marcos ${contaMarcos.saldo}")
}

class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo > valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }

        return false
    }

//    fun getSaldo(): Double{
//        return this.saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor > 0){
//            this.saldo = valor
//        }
//    }
}

fun infoConta(i: Int) {
    val titular: String = "Vinicin $i"
    val numeroConta: Int = 1000 + i
    var saldo = 10.0 + i

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")
    println()
}

fun whileLoop(fim: Int) {

    var i = 0
    while (i < fim) {
        infoConta(i)
        i++
    }
}

fun forLoop(init: Int, fim: Int) {

    for (i in init..fim) {
        infoConta(i)
    }
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta positiva")
    } else if (saldo == 0.0) {
        println("Conta neutra")
    } else {
        println("Conta negativa")
    }

    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("Conta neutra")
        saldo < 0.0 -> println("Conta negativa")
    }
}