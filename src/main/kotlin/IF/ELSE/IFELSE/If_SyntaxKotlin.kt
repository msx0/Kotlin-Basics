package IF.ELSE.IFELSE

class If_SyntaxKotlin {

    var value : Int = 0

    fun max (a : Int , b :Int){

        this.value = if(a > b){

            a
        } else {

            b
        }

        println(this.value)
    }
}