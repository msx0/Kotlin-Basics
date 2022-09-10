package Calculator

class Cal {

    fun sum(a: Int, b: Int): Int {

        return a + b

    }

    fun sub(a: Int, b: Int): Int {
        return a - b

    }

    fun mul(a: Int, b: Int): Int {

        return a * b

    }

    fun div(a: Int, b: Int): Int {

        if (b == 0)
            return 0
        else
            return a / b

    }

    fun mulArray(a: IntArray, b: IntArray): IntArray {


        var results = IntArray(a.size)
        for (i: Int in 0 until a.size) {

            results[i] = a[i] * b[i]

        }
        return results
    }

}