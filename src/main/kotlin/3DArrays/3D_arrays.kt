package `3DArrays`

// https://www.youtube.com/watch?v=uTR41nZCMAA&list=PLb6ZzJ93PVworJwMuGgBrp08Ijiu1Dnre&index=49&ab_channel=AhmedAzz

fun main(){

    // Int 3d array
    var a  = arrayOf (3,6,5 , 8)
    var b  = arrayOf (2,6,1 , 8)
    var c  = arrayOf (1,2,6 , 9)


    // String 3d Array
    var k = arrayOf("Hello","Welcome","Salam")
    var f = arrayOf("LOLOLO","FDSAS","Salam")
    var list = arrayOf(a,b,c)

    // 0 =  index 0 [ =var a ]
    // 2 = 5[2] from A [0]
    // print(list[0][2])

    // For with 3d array

    // https://youtu.be/prC-0XAqFB0

    for (i in list){

        for (j in i){
            print(j)
        }

        println()
    }

}