// Questão 1 

class Produto {
    var nome: String
    var preco: Double

    constructor() {
        nome = "Produto"
        preco = 0.0
    }

    constructor(nome: String) {
        this.nome = nome
        preco = 0.0
    }

    constructor(nome: String, preco: Double) {
        this.nome = nome
        this.preco = preco
    }
}

fun main() {
    val produto1 = Produto("bola", 20.0)
    println("Produto 1: Nome - ${produto1.nome}, Preço - ${produto1.preco}")

    val produto2 = Produto("raquete", 50.0)
    println("Produto 2: Nome - ${produto2.nome}, Preço - ${produto2.preco}")

    val produto3 = Produto("capacete", 30.0)
    println("Produto 3: Nome - ${produto3.nome}, Preço - ${produto3.preco}")
}

// questao 2

class Cliente {
    var nome: String = "raqueline"
        private set

    private var idade: Int = 23

    fun mostrarIdade() {
        println("A idade do cliente é: $idade")
    }
}

fun main() {
    val cliente = Cliente()

    cliente.mostrarIdade()
}


// questao 3 

abstract class Personagem {
    abstract fun atacar()
}

class Guerreiro : Personagem() {
    override fun atacar() {
        println("O Guerreiro ataca com X")
    }
}

class Mago : Personagem() {
    override fun atacar() {
        println("O Mago ataca com Y")
    }
}

fun main() {
    val guerreiro = Guerreiro()
    val mago = Mago()
    guerreiro.atacar()
    mago.atacar()
}


// questao 4 

interface FormaGeometrica {
    fun calcularArea(): Double
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return altura * largura
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
     override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }
}

fun main() {
    val retangulo = Retangulo(5.0, 3.0)
    val circulo = Circulo(2.0)

    val areaRetangulo = retangulo.calcularArea()
    val areaCirculo = circulo.calcularArea()

    println("Área do Retângulo: $areaRetangulo")
    println("Área do Círculo: $areaCirculo")
}


// questao 5

class ContaBancaria {
    var numeroConta: String = ""
    var nomeTitular: String = ""
    private var saldo: Double = 0.0
    init {
        this.nomeTitular = this.nomeTitular.capitalize()
    }
    constructor(numeroConta: String, nomeTitular: String, saldo: Double) {
        this.numeroConta = numeroConta
        this.nomeTitular = nomeTitular.capitalize()
        this.saldo = saldo
    }

    fun mostrarSaldo() {
        println("Saldo: $saldo")
    }
    fun getSaldo(): Double {
        return this.saldo
    }
    fun setSaldo(valor: Double): Unit{
        if(saldo <= 0 && (saldo - valor < 0)){
            throw  IllegalArgumentException("Saldo in suficiente")
        }
        saldo -= valor
    }
    fun mostrarNome(){
        println("Oi, $nomeTitular seu saldo é $saldo" )
    }
    override fun toString(): String {
        return "ContaBancaria(numeroConta='$numeroConta', nomeTitular='$nomeTitular', saldo=$saldo)"
    }

}

fun main(){
    val contaRaq = ContaBancaria("213123","Raqueline",21.90)

    contaRaq.mostrarNome()
}
