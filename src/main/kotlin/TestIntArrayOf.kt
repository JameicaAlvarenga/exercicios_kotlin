package me.jamei.collections

fun main(){
    val values = intArrayOf(1,3,6,10,3)

    values.forEach {
        print(it)
    }

    values.sort()
    values.forEach {
        print(it)
    }

}