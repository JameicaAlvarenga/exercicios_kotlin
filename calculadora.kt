    /**
     * Calculadora em Kotlin
     * Jameica Alvarenga
     */

    fun main(){

        //Funçães:
    //Soma
        fun sum(n:Float, n1:Float){
            var soma=(n + n1)
            return println("Valor da soma foi: $soma" )
        }


        ////Subtração
        fun sub(n:Float, n1:Float){
            var soma=(n - n1)
            return println("Valor da soma foi: $sub" )
        }

        //Divisão
        fun divisao(n:Float, n1:Float){
            var soma=(n / n1)
            return println("Valor da soma foi: $divisao" )
        }

        //Multiplicação
        fun multi(n:Float, n1:Float){
            var soma=(n * n1)
            return println("Valor da soma foi: $multi" )
        }

        println("============================================================================================")
        println("CALCULADORA")
        println("============================================================================================")

        println("Escolha uma das opções abaixo:")
        println("1 - Soma \n2 - Subtração \n3 - Divisão \n4 - Multiplicação")
        var op = readLine()!!.toInt()

        println("Informe dois valores para efetuar o calculo")

        print("Primeiro Valor: ")
        var p1 = readLine()!!.toFloat()

        print("Segundo Valor: ")
        var p2 = readLine()!!.toFloat()

        if (p1 == null || p2 == null)
            println("Valor informado invalido. \nFavor digitar algum valor")

        var result = when (op){
            1 -> sum(p1,p2)
            2 -> sub(p1,p2)
            3 -> divisao(p1,p2)
            4 -> multi(p1,p2)
            else ->""
        }

        println(result)


    }