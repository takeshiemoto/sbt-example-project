// 関数のカリー化
val add = (x: Int, y: Int) => x + y

val addCurried = (x: Int) => ((y: Int) => x + y)
add(100, 200)
addCurried(100)(200)
