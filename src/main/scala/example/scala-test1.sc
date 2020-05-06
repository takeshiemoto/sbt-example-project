// 1000回出力する done
// カウントするのは条件にマッチしたときだけ

//def random(): List[Char] = {
//  new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
//}
//
//var i = 1
//while (i <= 1000) {
//  val r = random()
//  r match {
//    case List(a, b, c, d, e) if a == e =>
//      println(r)
//      i = i + 1
//    case _ =>
//  }
//}

for (i <- 1 to 1000) {
  val s = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList match {
    case List(a, b, c, d, _) => List(a, b, c, a).mkString
  }
  println(s)
}
