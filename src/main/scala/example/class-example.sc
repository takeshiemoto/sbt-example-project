/**
 * Class定義
 */
//class Point(_x: Int, _y: Int) {
//  val x = _x
//  val y = _y
//}


/**
 * 短縮記法
 */
//class Point (val x: Int, val v: Int)

/**
 * class <クラス名> (<プライマリコンストラクタ>) {
 * // some code..
 * }
 *
 * - 1クラス1つのコンストラクタしか利用しない
 * - 文法上は複数のコンストラクタを定義可能（殆ど使わない）
 * - 複数のオブジェクト生成方法を提供する場合はObjectのapplyメソッドを定義することが多い
 *
 * - プライマリコンストラクタにvar|valをつけるとそのフィールドは公開される
 * - スコープはClass内全体
 */
class Point(val x: Int, val y: Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, p.y)
  }

  override def toString: String = "(" + x + "," + y + y + ")"
}

/**
 * アクセッサ
 * - private そのクラス内
 * - protected 派生クラス
 * - private[this] 同じオブジェクト
 * - protected[パッケージ名] 同一パッケージ
 * - なしはpublic扱い
 */

/**
 * メソッド定義
 * - 返り値の型は推論してくれるが明記する（読みやすさ）
 **/

/**
 * 単一引数
 */

class Cart(var items: List[String] = List()) {
  def add(item: String): Unit = {
    items :+= item
  }
}

val myCart = new Cart()
myCart.add("Scala Book")

/**
 * 複数の引数リスト
 **/
class Adder {
  def add(x: Int)(y: Int): Int = x + y
}

// 引数の渡し方
val adder = new Adder()
adder.add(2)(3)

// 部分的に引数を渡す
val fun = adder.add(2) _ //<- 最初の引数に2を渡す
fun(3) // <- 2番目の引数に3を渡す

// 単一の引数でも部分的に渡す事が可能
class Adder1 {
  def add(x: Int, y: Int): Int = x + y
}

val adder1 = new Adder1()
val fun1: Int => Int = adder1.add(1, _)
fun1(2)

/**
 * フィールド定義
 * - valは変更不能
 * - varは変更可能
 * - private[this]へのアクセスは若干早い（JVM絡み）
 */


/**
 * 抽象メンバー
 * - メソッド・フィールドの中身がない
 * - 抽象メソッドを1つ以上持つ場合は抽象クラスとして宣言する必要あり
 */
abstract class XY {
  def x: Int

  def y: Int
}

/**
 * 継承
 * - スーパクラスの実装をサブクラスで再利用
 * - スーパクラスのインターフェースを継承することで共通化
 * - 多重継承はできない（Javaと一緒）
 * - オーバーライドはoverrideキーワードを書く
 */
class APrinter() {
  def print(): Unit = {
    println("A")
  }
}

class BPrinter() extends APrinter {
  override def print(): Unit = {
    println("B")
  }
}

new APrinter().print() // A
new BPrinter().print() // B

class Point3D(val x: Int, val y: Int, val z: Int) {}

val p = new Point3D(10, 20, 30)
println(p.x)
println(p.y)
println(p.z)
