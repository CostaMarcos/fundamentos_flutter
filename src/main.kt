fun main() {
    println("Bem vindo ao Bytebank")
    var contaVinicius = Conta()
    var contaMarcos = Conta()

    contaVinicius.deposita(100.0)
    contaMarcos.deposita(50.0)

    contaVinicius.transfere(25.0, contaMarcos)
    println("Saldo Vinicius ${contaVinicius.saldo}")
    println("Saldo Marcos ${contaMarcos.saldo}")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo > valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }

        return false
    }

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