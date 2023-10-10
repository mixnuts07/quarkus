package my.demo
import java.util.*

fun main(args: Array<String>) {
	println(letDoubleNumbers)
    println(runLength) // 13
    println(withSum) // 15
    println(applyList) // [Apple, Banana, Cherry]
    println(alsoNumbers) // [1, 2, 3, 4]
}

// コンテキスト内 ... 特定のオブジェクトや環境の範囲やスコープ内での操作や動作

// let:
// オブジェクトをラムダ内で使用するときに新しい変数名を与えることができます。
// ラムダの結果を返します。
val numbers = listOf(1,2,3,4,5)
val letDoubleNumbers = numbers.let { it.map { num -> num * 2 } }
// run:
// オブジェクトのコンテキスト内で何らかの操作を実行するのに役立ちます。
// ラムダの結果を返します。
val runString = "hello, Kotlin"
val runLength = runString.run { length }
// with:
// 非拡張関数としてのみ存在し、オブジェクトのコンテキスト内で何らかの操作を実行するのに役立ちます。
// ラムダの結果を返します。
val withNumbers = mutableListOf(1,2,3)
val withSum = with(withNumbers) {
    add(4)
    add(5)
    sum()
}
// apply:
// オブジェクトのコンテキスト内で何らかの操作を行い、そのオブジェクト自体を返すのに役立ちます。
val applyList = mutableListOf<String>().apply {
    add("Apple")
    add("Banana")
    add("Cherry")
}
// also:
// オブジェクトをラムダ内で使用するときに新しい変数名を与えることができます。
// オブジェクト自体を返します。
val alsoNumbers = mutableListOf(1,2,3).also { it.add(4) }