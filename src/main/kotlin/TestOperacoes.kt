

fun main(){
    val salarios = doubleArrayOf(5499.00,6000.00,4756.00,4250.00,5500.01,5522.0)

    salarios.sort()
    println("Salarios em ordem crescente:")
    for (salario in salarios){
        println(salario)
    }

    println("-------------------------------------------------------------------")
    println("Maior Salario é: ${salarios.maxOrNull()}")
    println("Menor Salario é: ${salarios.minOrNull()}")
    println("Média dos salarios: ${salarios.average()}")
    println("-------------------------------------------------------------------")

    val salariosMaiorQue5500 = salarios.filter { it > 4300 }

    println("salarios acima de 5500.00:")
    salariosMaiorQue5500.sorted()
    salariosMaiorQue5500.forEach{ println(it) }

}