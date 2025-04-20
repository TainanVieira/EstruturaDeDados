import java.util.*

fun main(){
    data class Produtos(val nome: String, val quantidade: Int,  val validade : Int){
        fun deletarPorQnt(){
            val temp = quantidade* 1000L
            println("Espetando $temp milisegundo para remover o produto $nome")
            Thread.sleep(temp)
        }
    }

        val iten = listOf("Sabonete", "Escova", "Pasta", "shampoo","Gel", "Condicionador",
            "Cotonete")


        val pilhaDeProdutos = LinkedList <Produtos>()

        pilhaDeProdutos.push(Produtos(iten.random(), 5, 30))
        pilhaDeProdutos.push(Produtos(iten.random(), 5, 30))
        pilhaDeProdutos.push(Produtos(iten.random(), 5, 30))


        while (pilhaDeProdutos.isNotEmpty() ){
            val removido = pilhaDeProdutos.pop()
             removido.deletarPorQnt()

            println("Removido $removido")
            println("Produtos restantes ${pilhaDeProdutos.size}")

            if (pilhaDeProdutos.isEmpty()){
                pilhaDeProdutos.push(Produtos(iten.random(), (1..10).random(), 30))
                pilhaDeProdutos.push(Produtos(iten.random(), (1..10).random(), 30))
                pilhaDeProdutos.push(Produtos(iten.random(), (1..10).random(), 30))
                println(" quantidade de produtos  restantes : " +
                        "${pilhaDeProdutos.size}")
            }

        }


    }




