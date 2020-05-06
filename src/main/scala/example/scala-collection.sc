val arr = Array[Int](1, 2, 3, 4, 5)

arr(0) = 7

arr
arr(0)
arr.length

1 to 5
1 until 5
(1 until 5).toList

// List --> 普遍
val lst = List(1, 2, 3, 4, 5)
lst(0)

val a1 = 1 :: Nil
val a2 = 2 :: a1
val a3 = 3 :: a2
val a4 = 4 :: a3

/** Listの結合 */
List(1,2) ++ List(3,4)
