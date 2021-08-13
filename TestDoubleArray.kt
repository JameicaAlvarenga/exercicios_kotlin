package me.jamei.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0]= 8000.00
    salarios[1] = 10000.00
    salarios[2] = 15000.00

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    val bonus = doubleArrayOf(3000.0,5000.0,1000.0)
    bonus.sort()
    bonus.forEach { println(it) }
}
