fun main() {
    val car =  Car()
    val car2 = Car("red")
    val car3 = Car("red", 45000)
    val car4 = Car("red", 45000, "Lada")
    car.privet()

}
 class Car(){
    constructor(color:String, ) : this()
    constructor(color:String, price: Int, ) : this()
    constructor(color:String, price: Int, brand:String) : this()

    fun privet() {
        println("Привет")
    }

}
