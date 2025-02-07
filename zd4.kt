fun main(){
    println("Введите x:")
    try{
        var x = readLine()!!.toDouble()
        if(x>3)
        {
            val otv = (-3*x)+9
            println("Так как $x > 3, ответ: $otv")
        }
        else
        {
            val otv = (Math.pow(x, 3.0))/(Math.pow(x,2.0)+8)
            println("Так как $x <= 3, ответ: $otv")
        }
    }
    catch (e:Exception)
    {
        println("Введено некорректное значение")
    }
}