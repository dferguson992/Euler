/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

import kotlin.system.measureTimeMillis

fun getMultiplesOf(n: Int, multiplicand: Int): MutableCollection<Int> {
    var i = multiplicand;
    val list: MutableList<Int> = mutableListOf()
    while (n > i) {
        list.add(i)
        i += multiplicand
    }
    return list
}

fun main(upperBound: Int): Int {
    val multiplesOfThree: MutableCollection<Int> = getMultiplesOf(upperBound, 3)
    val multiplesOfFive: MutableCollection<Int> = getMultiplesOf(upperBound, 5)
    multiplesOfFive.sum() + multiplesOfThree.sum()
    return multiplesOfThree.union(multiplesOfFive)
        .toSet()
        .sum()
}

var result = 0
println("""Upper Bound ${args[0].toInt()} took ${measureTimeMillis {
    (run {
        result = main(args[0].toInt())
    })
}} milliseconds to run and yielded result $result""")