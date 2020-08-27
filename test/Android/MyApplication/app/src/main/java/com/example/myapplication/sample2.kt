package com.example.myapplication

// Lamda
// val squaare  = {number : Int -> number*number}
val squaare : (Int) -> (Int) = {number -> number*number}

val nameAge = {name :String, age : Int ->
    "my name is ${name} I'm ${age}"
}

fun main(){
    println(squaare(12))
    println(nameAge("sunwoo", 27))
    val a = "sunwoo : "
    val b = "koo : "
    println(a.pizza())
    println(extendString("woo",27))
    println(grade(98))

    val lamda = {num : Double -> num==4.1234}
    println(invokeLamda(lamda))

    // 람다리터럴
    println(invokeLamda({5.333>it}))

    // 함수의 마지막 파라미터가 람다식인 경우 소괄호 생략가능 it : 하나들어 가는 파라미터
    invokeLamda {it > 3.22}

    // data class
    val ticketA = Ticket("aAir", "sunwoo", "2020-20-20", 45)
    // class
    val ticketB = NTicket("aAir", "sunwoo", "2020-20-20", 45)

    // toString 오버라이딩
    println(ticketA)
    // 주소값 출력
    println(ticketB)

}

// 확장함수 클래스에 추가하고 싶을 때
val pizza : String.() -> String = {
    this + "Pizza is best"
}

fun extendString(name : String, age:Int) :String {
    val said : String.(Int) -> String = {"Im ${this} and ${it} years old"}
    return name.said(age)
}

// 람다의 return
val grade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "error"
    }
}

// 람다 표현 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.234)
}

// 익명 내부함수

// 데이터 클래스
// toString(), hashCode(), equals(), copy()를 자동으로 만들어줌
data class Ticket(val companyName : String, val name : String, var date :String, var seatNum: Int)

class NTicket(val companyName : String, val name : String, var date :String, var seatNum: Int)

