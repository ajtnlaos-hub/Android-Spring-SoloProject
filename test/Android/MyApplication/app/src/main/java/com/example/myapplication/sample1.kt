package com.example.myapplication

// 메인 함수
fun main(){
    helloWorld()
    println(add(10,20))
}

//함수 정의(void) Unit 생략가능
fun helloWorld() : Unit {
    println("helloWorld")
}

// 파라미터와 리턴값이 있는 함수
fun add(a : Int, b: Int) : Int {
    return a+b
}
// 변수 val과 var의 차이, 타입자동지정(초기화를 해주어야함)
fun hi(){
    val a : Int = 10
    var b : Int = 9
    b = 100
    var string = "자동 타입 지정"

}
// String Template
fun stringTemplate(){
    val name = "sunwoo"
    println("my name is $name ")
}
// 조건식
fun maxBy(a: Int, b : Int) : Int{
    if(a>b) return a
    return b
}
fun maxBy2(a : Int, b : Int ) = if(a>b) a else b

fun checkNum(num : Int){
    // else 생략가능
    when(num){
        0 -> println("num is 0")
        1 -> println("num is 1")
        2,3 -> println("num is 2 or 3")
        else -> println("i don't know")
    }
    // else가 반드시 있어야함
    var b = when(num){
        1 -> 1
        2 -> 2
        else -> 3
    }
    when(num){
        in 90..100 -> println("good")
        in 10..50 -> println("bad")
        else -> println("so so")
    }
}
// array / list
fun array()
{
    // val로 선언하는 이유 참조값은 바뀌지 않기 때문에
    val array = arrayOf(1,2,3)
    val list = listOf<Int>(1,2,3)
    val array2 = arrayOf(1, "d", 'a' ) // any 타입
    val list2 = listOf(1,"d", 1)

    array[0] = 3 //값 변경 가능
    val result = list.get(0) // 값 가져오만 가능, 인터페이스임, 변경가능한 리스트가 있음

    val arrayList  = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}
// 반복문
fun forAndWhile(){
    val student = arrayListOf("sunwoo", "koo", "poo")
    for (name in student){
        println(name)
    }
    for ((index, name) in student.withIndex()){
        println("${index+1}번째 학생 ${name}")
    }
    var sum = 0
    // 1부터 10까지 2스택씩 가라
    // 10 downTo 1 10부터
    // 1 until 100 1~99 100을 포함하지 않음
    for (i in 1..10 step 2) {
        sum += i
    }
    println(sum)

    var idx = 0
    while(idx < 10){
        println( "${idx++}")
    }
}

// NULL
fun nullCheck(){
    // var name : String = null 컴파일시 잡아줌
    var name = "sunwoo"
    var notNull : String? = null
    var nameInUpperCase = name.toUpperCase()
    // ?가있으면 Null이면 null반환 null이 아니면 함수실행
    var notNullInUpperCase = notNull?.toUpperCase()

    // ?: 엘비스(프레슬리) 연산자 Null일 경우에 디폴트값 지정
    val lastName : String? = null
    val fullName = name + (lastName?:"No lastName")

    // !!연산자 Null이 아님을 확신하는것, 사용을 지양함
    fun iNull(str : String?){
        val eNotNull : String = str!!
    }
    // let함수 자신의 리시브객체를 람다식 내부로 옮겨줌
    val email: String? = "ajtnlaxxxx@xxxxxx.com"
    email?.let{
        println("my email is ${it}")
    }
}
