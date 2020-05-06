class Cell[A](var value: A) {
  def put(newValue: A): Unit = {
    value = newValue
  }

  // return valueの略
  def get(): A = value
}


val cell = new Cell[Int](1)
cell.put(2)
cell.get()

/**
 * 複数の戻り値
 */
class Pair[A, B](val a: A, val b: B) {
  override def toString: String = "(" + a + "," + b + ")"
}

def divide(m: Int, n: Int): Pair[Int, Int] = new Pair[Int, Int](m / n, m % n)
divide(10, 7)

// ScalaではTuple1からTuple22まで用意されている
//val m = 7
//val n = 3
//new Tuple2[Int, Int](m / n, m % n)

// Tupleはインスタンス化は不要
val m = 7
val n = 3
(m / n, m % n)
