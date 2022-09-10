package Arrays
// https://www.youtube.com/watch?v=Fz2SjvYWIv8&list=PLb6ZzJ93PVworJwMuGgBrp08Ijiu1Dnre&index=44&ab_channel=AhmedAzz


fun main(){

    var Ar1 = Array<Int>(4){0}

    Ar1[0] = 2
    Ar1[1] = 4
    Ar1[2] = 5
    Ar1[3] = 9

    var l = Ar1.size // The array size
    // Print all the array with the for loop
    for(i : Int in 0 until l)
    {
      println(  Ar1[i])
    }
}