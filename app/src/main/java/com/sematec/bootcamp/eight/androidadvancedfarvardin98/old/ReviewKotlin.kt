package com.sematec.bootcamp.eight.androidadvancedfarvardin98.old

class ReviewKotlin {


    lateinit var c: String
    var s = "Pouya"  //mutable
    val a = 110      //immutable


    fun testFun() {
        s = "Qoli"
    }

    fun testFun2(): Int {
        return 10
    }

    fun testFun3() = 20


    fun calculateAge(birthYear: Int): Int {
        return 2019 - birthYear
    }

    fun calculateAge2(birthYear: Int) = 2019 - birthYear


}