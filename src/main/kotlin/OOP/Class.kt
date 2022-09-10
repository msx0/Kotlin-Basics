package OOP
// Make a object from class "Car"
// https://www.youtube.com/watch?v=ITTPpouhKX0&list=PLb6ZzJ93PVworJwMuGgBrp08Ijiu1Dnre&index=15&ab_channel=AhmedAzz
fun main(args : Array<String>) {

    var obj1 = Car() // object one
    var obj2 = Car() // Object two



    obj1.name = "BMW"
    obj1.model = 2019
    obj1.speed = 260

    obj2.name = "Volkswagen"
    obj2.model = 2005
    obj2.speed = 240


    // Object one
    println(obj1.name)
    println(obj1.model)
    println(obj1.speed)

    // Object two
    println(obj2.name)
    println(obj2.model)
    println(obj2.speed)
}