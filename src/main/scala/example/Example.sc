// 変数
var myName: String = "Paul"
println(myName)
myName = "George"
println(myName)

// 定数
val age = 1
val name: String = "John" // アンダースコアで初期値省略
val MAX_RANGE: Int = 100

// for文
/** for (i = 1; i <= 5; i++) */
for (x <- 1 to 10) {
  println(x)
}

/** for (i = 1; i < 5; i++) */
for (x <- 1 until 5) {
  println(x)
}

/** コレクションループ */
var members: Array[String] = Array("John", "Paul", "George", "Ringo")
for (x <- members) {
  println(x)
}

// if文
if (name == "John") {
  println("Johnです")
} else {
  println("Johnではないです")
}

val a = 10
if (a == 10) {
  println("10だ")
} else {
  println("10じゃない")
}

if (a == 10) println("10だい") else println("10じゃない")

/**
 * IFも値を返す
 * よって三項演算子的な使い方ができる
 */
val b = 10
val c = if (a == 10) 20 else 30
println(if(c == 20) "20だ" else "20じゃない")

// Class new必要

// Object シングルトン保証・new不要

// Import / Export

// Map
var users = Map(1 -> "John", 2 -> "Paul", 3 -> "George", 4 -> "Ringo")
println(users)

/**
 * trait(トレイト)
 * 抽象メソッドを持つインターフェース
 * トレイトを継承するには extends キーワードを使います。
 * その際に、 override キーワードを利用しすべての抽象メンバーを実装します。
 */

trait DateOfBath {
  def checkBath(): Boolean
}

class Foo() extends DateOfBath {
  override def checkBath(): Boolean = true
}


val interest = 3950000 * 0.23
val hour = 8 / 12.toFloat
val result = interest * hour
println(Math.floor(result))

