package com.example.casualhangouts

class CoolHangouts {


    fun main() {
        val myAddress = 236
        fun myFunction(int: Int) = print(myAddress)

        myFunction(myAddress)
        println(myAddress)

        val myStreet = "West st."
        fun myFunction (str: String) = print(myStreet)

        val myEvent = "BBQ"


        val myState = "Idaho"

        val myTime = "7:00pm"



        var greeting: String = "Welcome to CasualHangouts"

        val congratulations = arrayOf("236, West st., BBQ, Idaho, 7:00pm")
        for (c in congratulations) {
            print(c)
        }
    }
}
fun rule(args: Array<Boolean>) {
    val myRules = ("no cursing, no drinking, no immorality")
    fun myFunction(str: String) = print(myRules)
    if (false) {
        (" Ban Account")
    } else if(true) {

        ("Access Granted")
    }
}


fun friend () {
    var addfriend = "New Friend"
    fun myFunction(str: String) = print(addfriend)

    myFunction(addfriend)
    println(addfriend)
}