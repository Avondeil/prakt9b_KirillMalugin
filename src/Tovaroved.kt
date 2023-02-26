package Tovaroved
open class Tovaroved (var name:String, var price:Double) {
    open fun Input()
    {
        print("\nВведите наименование товара: ")
        name=readLine()!!.toString()
        print("Введите цену за $name: ")
        price= readLine()!!.toDouble()
    }
    open fun Info()
    {
        if (price>0)
        print("Наименование товара: $name, цена: $price")
        else print("Цена за товар не может быть отрицательной");
    }

}