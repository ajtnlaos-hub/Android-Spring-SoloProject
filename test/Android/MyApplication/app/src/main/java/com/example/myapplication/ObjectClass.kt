package com.example.myapplication

object CarFactory{
    val cars = mutableListOf<Car>()

    fun makeCar(name : String): Car{
        val car = Car(name)
        cars.add(car)
        return car
    }
}

data class Car(val name : String)

fun main(){
    val car = CarFactory.makeCar("sonata")
    val car2 = CarFactory.makeCar("tico")
    println(car)
    println(car2)
    println(CarFactory.cars)
}