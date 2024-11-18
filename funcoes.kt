// 1. Declaração de Funções
fun apresentarPessoa(nome: String, idade: Int): String {
    return "Nome: $nome, Idade: $idade"
}

fun calcularAreaCirculo(raio: Double): Double {
    return Math.PI * raio * raio
}

// 2. Parâmetros
fun descreverProduto(nome: String, preco: Double, quantidade: Int): String {
    return "Produto: $nome, Preço: $preco, Quantidade: $quantidade"
}

fun calcularDesconto(preco: Double, porcentagemDesconto: Double): Double {
    return preco - (preco * porcentagemDesconto / 100)
}

// 3. Retornos
fun obterMaiorNumero(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun verificarIdadeParaVotar(idade: Int): Boolean {
    return idade >= 18
}

// 4. Funções de Ordem Superior
fun operacaoComNumero(numero: Double, operacao: (Double) -> Double): Double {
    return operacao(numero)
}

fun filtrarNumerosPositivos(numeros: List<Int>, filtro: (Int) -> Boolean): List<Int> {
    return numeros.filter(filtro)
}

// 5. Lambdas
val ehPar: (Int) -> Boolean = { numero ->
    numero % 2 == 0
}

val calcularSalario: (Int, Double) -> Double = { horasTrabalhadas, valorPorHora ->
    horasTrabalhadas * valorPorHora
}

// Função principal para testar as práticas
fun main() {
    // Testes de cada função com os resultados 

    // 1. Declaração de Funções
    println(apresentarPessoa("Raqueline", 30))  // Resultado esperado: "Nome: raqueline, Idade: 30"
    println("Área do círculo: ${calcularAreaCirculo(5.0)}")  // Esperado: 78.53981633974483

    // 2. Parâmetros
    println(descreverProduto("Caneta", 1.50, 10))  // Esperado: "Produto: Caneta, Preço: 1.5, Quantidade: 10"
    println("Preço com desconto: ${calcularDesconto(100.0, 15.0)}")  // Esperado: 85.0

    // 3. Retornos
    println("Maior número: ${obterMaiorNumero(5, 10)}")  // Esperado: 10
    println("Pode votar? ${verificarIdadeParaVotar(20)}")  // Esperado: true

    // 4. Funções de Ordem Superior
    println("Resultado da operação: ${operacaoComNumero(10.0) { it * 2 }}")  // Esperado: 20.0
    println("Números positivos: ${filtrarNumerosPositivos(listOf(-1, 2, 3, -4)) { it > 0 }}")  // Esperado: [2, 3]

    // 5. Lambdas
    println("Número é par? ${ehPar(4)}")  // Esperado: true
    println("Salário calculado: ${calcularSalario(40, 15.0)}")  // Esperado: 600.0
}
