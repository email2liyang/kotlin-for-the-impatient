package com.datanerd.kotlin.ch01

fun echo(name: String) {
    println("$name")
}

object Greating {
    fun saySth(msg: String) {
        println("$msg")
    }
}

fun main(args: Array<String>) {
    Greating.saySth("hello")
}