import java.util.LinkedList

fun main() {

    // cria uma pilha
    val pilha = LinkedList <String>()
    // prateleira de produtos
    // adicionando produtos na prateleira
    // push "Enpurrar"
    pilha.push("Sardinha")
    pilha.push("Milho")
    pilha.push("molho de Tomate")

    // Acessar primeiro elemento da pilha

    println(pilha.peek()) // peek para olhar o primeiro elemento

    // ver tamanho da pilha
    println(pilha.size)

    //Remover um elemento da prateleira (Pilha ) pop()
    val esgotado = pilha.pop()
    println("Esgotados $esgotado")

    println("Novo produto no topo da pilha : ${pilha.peek()}")

    // Verifica se existem produtos na prateleira(Pilha)
    if (pilha.isEmpty()){
        println("Acabou os produtos")
    }
    else{
        println("Ainda existem produtos")
    }
    //Verifica tudo o que tem na prateleira(Pilha)
    println(pilha)

//------------------------------------------------------------------------------------------------------------

    // Criar uma FILA

    val fila = LinkedList <String>();

    // Adicionar usuarios a fila
    fila.addLast("João")
    fila.addLast("Maria")
    fila.addLast("Pedro")

    // veja o primeiro usuario da fila
    println(fila.peek())

    // ver todos os usuarios da fila
    println(fila)

    do {
        // FAz duas coisa ao mesmo tempo, imprime o usuario e remove logo em seguida
        println(" O user ${fila.removeFirst()} entrou no servidor")

        Thread.sleep(5000)// Faz o processador parar

    }while (fila.isNotEmpty())// enquanto tiver gente na fila, repita

//-----------------------------------------------------------------------------------------------------------------
    //map


    val bubalsauro = mapOf(
        "GRAMA " to  listOf("AGUA, TERRA, PEDRA"),// a minha é uma String
        "VENENO" to listOf("FADA, PLANTA") //o meu valor é uma lista de String
    )//CHAVE to VALOR

}