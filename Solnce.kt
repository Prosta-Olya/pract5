fun main(){
    println("Введите два числа: ")
    try{
    var num1 = readLine()!!.toDouble()
    var num2 = readLine()!!.toDouble()
    if(num1>num2)
    {
        var rez = num1+1
        println("Число $num1 больше $num2, ответ: $rez")
    }
    else if(num2>num1)
    {
        var rez = num2+1
        println("Число $num2 больше $num1, ответ: $rez")
    }
    else
    {
        var num1 = Math.pow(num1, 3.0)
        println("Числа равны, ответ: $num1")
    }
    }
    catch (e:Exception)
    {
        println("Ошибка, введены некорректные значения")
    }
}