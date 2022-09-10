package IF.ELSE.IFELSE

class A {

    var value : Int = 0

    fun max (a : Int , b : Int){

        if (a > b ){

            this.value = a
            println(this.value)
        }

        else {

            this.value = b
            println(this.value)
        }
    }
}