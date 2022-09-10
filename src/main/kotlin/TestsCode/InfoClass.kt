package TestsCode
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Arrays
import java.util.StringJoiner



class InfoClass {

    val inputstring : String = readLine()!!.toString()
    val dateTime = LocalDateTime.now()
    val x = 0



    fun arrayDays (){

        var daysArray = Array(7){""}
        daysArray[0] = "Monday"
        daysArray[1] = "Tuesday"
        daysArray[2] = "Wednesday"
        daysArray[3] = "Thursday"
        daysArray[4] = "Friday"
        daysArray[5] = "Saturday"
        daysArray[6] = "Sunday"

        for (i : Int in 0 until daysArray.size){

            println(daysArray[i])
        }
    }




    fun toDo(){

        // using When case

        when(inputstring){

            "Date" -> println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)))
                   "date"->   println(dateTime.format(DateTimeFormatter.ofPattern("M/d/y H:m:ss")))


               "Days"  -> println(this.arrayDays())


        }
    }


}

fun output(msgText : String){

    println(msgText)!!.toString()
    println("——————————————————————————————————————————————————————————————————")
}


