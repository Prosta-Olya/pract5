fun main()
{
    println("Введите возраст:")
    try
    {
        var age = readLine()!!.toInt()
        when(age)
        {
            in 0..2 -> println("младенец")
            in 3..6 -> println("ребенок")
            in 7..12 -> println("школьник")
            in 13..17 -> println("подросток")
            in 18..25 -> println("юность")
            in 26..35 -> println("молодость")
            in 36..60 -> println("зрелость")
            in 61..110 -> println("старость")
            else -> println("Введено некорректное значение")
        }
    }
    catch (e:Exception)
    {
        println("Введено некорректное значение")
    }
}