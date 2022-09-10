import java.util.StringJoiner

// Array List
// https://youtu.be/vY5wIdIOzno


fun main(){

var names = Array<String>(3){"a"}

    var colors = ArrayList<String>()

// index will be set automatic
    colors.add("Pink") // 0
    colors.add("Green") // 1
    colors.add("Black") // 2

        // colors.set // will change the value to another value
    //  colors.remove("Green") // Will delete the Green then black index will be 1 and pink 0
    // removeIt - will delete the value only
    println(colors[0]) // output : Pink [0]
    println(colors.get(2)) // another way to get the data


    // for loop with ArrayList
    for (count in colors){

        println(count)
    }
}