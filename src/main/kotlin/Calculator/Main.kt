package Calculator

fun main() {

  var op = Cal()

  var results = op.sum(4, 7)
  println(results)

  var results2 = op.sub(4, 7)
  println(results2)

  var results3 = op.mul(4, 7)
  println(results3)

  var results4 = op.div(12, 6)
  println(results4)

  println("__________________________________________________________________________________")

  var ar1 = intArrayOf(1, 2, 3)
  var ar2 = intArrayOf(2, 4, 6)

  var r = op.mulArray(ar1, ar2)

  for (i: Int in 0 until r.size) {
    println(r[i])

  }

}