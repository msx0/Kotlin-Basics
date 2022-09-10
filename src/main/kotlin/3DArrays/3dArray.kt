package `3DArrays`

fun main(){

    var myList2 = arrayOf(1,3,3,4) // Int
    var myList3 = arrayOf('a','b','c') // Cha
    var myList4 = arrayOf("IIU","FFFS","FFF") // String

    for (i in myList3 ){

        println(i)

        for (k in myList2){
            println(k)
        }

        for (d in  myList4){

            println(d)
        }
    }
}