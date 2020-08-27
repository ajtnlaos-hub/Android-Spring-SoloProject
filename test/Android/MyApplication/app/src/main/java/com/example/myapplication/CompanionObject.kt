package com.example.myapplication

class Book private constructor(val id: Int , val name : String ){

    companion object BookFactory : IdProvider {

        override fun getid(): Int {
            return 444
        }

        val myBook = "fofofofofo"

        fun create() = Book(0, myBook)
    }
}

interface IdProvider {
    fun getid() : Int
}

fun main(){
    // Companion 생략가능 val book = Book.Companion.create()
    val book = Book.create()
    val bookId = Book.BookFactory.getid()
    println("${book.id} ${book.name}")
}
