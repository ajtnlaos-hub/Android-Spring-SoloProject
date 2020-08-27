package com.example.myapplication

// 파일 이름과 같지않아도됨
class ClassPractice{

}

// constructor 생략가능
// open : 코틀린에서 클래스는 기본적으로 파일 클래스이기 때문에 같은 파일내에 있다고 해서  그냥 접근할 수 없음 오픈을 해줘야함
 open class Person constructor(val name : String = "default"){

    /* 자바인 경우
    *  class Person{
    * public Person(String name){}
    * public Person(String name, int age){}
    * */

    // 부 생성자 this 주 생성자의 위임을 받음
    constructor(name : String, age : Int) : this(name){

    }

    // 클래스 생성시 할 동작 정의, 객체생성시 가장먼저 실행됨
   init{
      println("new person")
   }

    fun eatCake(){
        println("Yummy")
    }

    open fun sing(){
        println("lalalala")
    }
}

// 클래스 상속 하나만 상속받을 수 있음
class Korea : Person(){

    // 오버라이딩 : 메소드도 open 해줘야함
    override fun sing(){
        super.sing()
        println("라라라")
    }
}


fun main() {
    val person = Person("sunwoo")
    val human = Person() //생성자의 디폴트값으로 생성됨
    person.eatCake()
    println("my name is ${person.name}")
    println("he is ${human.name}")

    // 상속 받았기 때문에 sing 메소드 사용가능
    val korea = Korea()
    korea.sing()
}
