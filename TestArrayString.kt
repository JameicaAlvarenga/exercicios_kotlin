
package me.jamei.collections
fun main(){
    val nomes = Array(3){""}
    nomes[0]="Jameica"
    nomes[1]="Braga"
    nomes[2]="Alvarenga"


    nomes.forEach {
        print(it)
    }

    for(nome in nomes){
        print(nome)
    }

    nomes.sort()
    nomes.forEach { print(it) }

    val nomes2 = arrayOf("Jameica", "Braga","Alvarenga")

    nomes2.sort()
    nomes.forEach { print(it) }
}