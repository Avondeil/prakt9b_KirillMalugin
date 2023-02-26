import Order.Order
import Tovaroved.Tovaroved
import Admin.Admin
fun main()
{
    try {
        var Tovar: Tovaroved = Tovaroved("Телефон", 3000.0)
        Tovar.Info()
        Tovar.Input()
        print("Введите имя: ")
        var name= readLine()!!.toString()
        var Order: Order = Order(Tovar.name, Tovar.price, 3000.0, 1, name)
        Order.InfoTovar()
        Order.NameUser()
        Order.moneyuser()
        Order.AddTovar()
        Order.InfoTovar()
        if (Order.count>0) {
            if (Order.money>=0)
            {
                var Admin: Admin = Admin(Order.name1, Order.price1, Order.money, Order.count, Order.User)
                Admin.Scan()
            } else println("Деньги не могут уходить в отрицательное значение")
        }   else println("Количество не может уходить в отрицательное значение")
    }
    catch (e:Exception)
    {
        println("Некорректный ввод данных!")
    }
}