package Arrays
// https://www.youtube.com/watch?v=CZDeNLgpEUs&list=PLb6ZzJ93PVworJwMuGgBrp08Ijiu1Dnre&index=45&ab_channel=AhmedAzz


fun main(){

    var myList = Array<Int>(4){0}

    myList[0] = 41
    myList[1] = 45
    myList[2] = 45
    myList[3] = 43

    var total : Int = 0
    for (i : Int in 0 until myList.size){

        total = total + myList[i]

    }

    println ("Total = $total ")
}