package StudentApp

fun main(){

    var ahmed = Student()
    var ali = Student()



    ahmed.name = readLine()!!.toString()
    println("Quiz 1 :   ")
    ahmed.addQuizes(readLine()!!.toInt())
    println("Quiz 2 :   ")
    ahmed.addQuizes(readLine()!!.toInt())
    println("Quiz 3 :   ")
    ahmed.addQuizes(readLine()!!.toInt())
    println("Quiz 4 :   ")
    ahmed.addQuizes(readLine()!!.toInt())

   var total =  ahmed.getToScore()
    println("Total =   $total")

    var averge = ahmed.getAverge()
    println("Averge score:  $averge")

}