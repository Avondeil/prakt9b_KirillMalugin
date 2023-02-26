package Order
import Tovaroved.*
open class Order(val name1:String, val price1:Double,var money:Double, var count:Int, var User:String):Tovaroved(name1, price1){
    open fun AddTovar()
    {
        print("Сколько единиц товара ($name) будете брать? ")
        count=readLine()!!.toInt()
    }
    open fun NameUser()
    {
       print("Введите свое имя: ")
        User=readLine()!!.toString()
    }
    open fun moneyuser()
    {
        print("Сколько у вас денег?: ")
        money=readLine()!!.toDouble()
    }
    open fun InfoTovar()
    {
                println("Имя покупателя: ${User}\nТовар: $name1, количество: ${count}")
    }
}