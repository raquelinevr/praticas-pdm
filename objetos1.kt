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
