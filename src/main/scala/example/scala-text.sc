// forの基本構文

// for (ジェネレーター) { 式 }
// ジェネレーターは何個でも増やせる
for (x <- 1 to 5; y <- 1 until 5) {
  println("x = " + x + " y = " + y)
}

// ループ変数の中から条件にあったものだけを絞り込むこともできる
for (x <- 1 to 5; y <- 1 until 5 if x != y) {
  println("x = " + x + " y = " + y)
}

/**
 * for構文はyieldキーワードを使うことで、コレクションの要素を加工して返すという
 * 全く異なる用途に使うことができます。
 * for-comprehension
 */
for (e <- List("A", "B", "C", "D", "E")) yield {
  "Pre" + e
}

// 練習問題
//for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000 if a * a == b * b + c * c) {
//  println(a, b, c)
//}

// Math
// Mathも値を返す
val taro = "Taro"

taro match {
  case "Taro" => "Male"
  case "Jiro" => "Male"
  case "Hanako" => "Female"
}

/**
 * switch default = _
 * ワイルドカードパターン
 */
val num = 1

num match {
  case 1 => "内川"
  case 2 => "カーター"
  case _ => "不在"
}

// フォールスルーはない
// 複数のパターンをまとめたい場合は下記の通り

"abc" match {
  case "abc" | "def" =>
    println("first")
    println("second")
}


val list = List("A", "B", "C")

// 先頭がAで3つの要素にマッチする
list match {
  case List("A", b, c) =>
    println("b = " + b)
    println("c = " + c)
  case _ =>
    println("nothing")
}

val list2 = List("A", "B", "C")

/**
 * 先頭がA
 * 要素数が3
 * Bが文字列のB以外の場合マッチする
 */
list2 match {
  case List("A", b, c) if b != "B" =>
    println("b=" + b)
    println("b=" + c)
  case _ =>
    println("nothing")
}


val list3 = List(List("A"), List("B", "C"))

// @はasパターンと呼ばれる
// @に続くパターンにマッチする式を@の前の変数（a)に束縛できる
// asパターンはパターンが複雑なときにパターンの一部を抜き出すのに便利
list3 match {
  case List(a@List("A"), x) => // List("A")マッチしたから中身をaに入れる
    println(a)
    println(x)
  case _ =>
    println("Nothing")
}

// 中置パターン
val list4 = List("A", "B", "C")
list4 match {
  case "A" :: b :: c :: _ =>
    println("B= " + b)
    println("c= " + c)
  case _ =>
    println("Nothing")
}

val list5 = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList

/*
* 最初と最後の文字が同じ英数字であるランダムな5文字の文字列を1000回出力してください
* */



//var i = 1
//var done = false
//while (!done) {
//
//  println(i)
//  i = i + 1
//}
