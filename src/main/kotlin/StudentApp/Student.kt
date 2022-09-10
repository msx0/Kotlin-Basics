package StudentApp

class Student {

    var name : String = ""
    var age : Int = 0
    var totalScore : Int = 0
    var numOfQuizes : Int = 0

    fun introduce(){

        println("Hello my Name is: ${this.name}")
        println("Hello my age is: ${this.age}")
    }


    fun addQuizes (score : Int){
        this.totalScore += score
        this.numOfQuizes++
    }

    fun getToScore() : Int
    {

        return  this.totalScore

    }

    fun getAverge () : Int {

       return this.totalScore / this.numOfQuizes



    }
}