package Admin
import Order.*
open class Admin(val name2:String, val price2:Double, var money2:Double, var count2:Int, var User2:String):Order(name2,price2,money2,count2, User2) {
    open fun Scan()
    {
        if ((price2*count2)<=money2)
        {
        println("Покупатель $User2 произвел оплату за товар ($name2)")
        }
        else {
            println("Покупатель $User2 не произвел оплату по какой-то причине, хотите занести его в черный список?\n 1. Да\n 2. Нет")
            var yes=readLine()!!.toInt()
            if (yes==1) println("Покупатель $User2 занесен в черный список!")
            else if (yes==2) println("Процесс занесения в черный список отложен")
            else println("Ввод некорректного числа!")
        }
    }

}