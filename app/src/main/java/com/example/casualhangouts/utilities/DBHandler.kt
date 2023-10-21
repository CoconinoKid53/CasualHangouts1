package com.example.casualhangouts.utilities

import android.app.Application
import android.os.Environment
import com.example.casualhangouts.models.DatabaseModel
import com.opencsv.CSVWriter
import java.io.FileWriter

class DBHandler : Application() {
    @Override
    override fun onCreate() {
        super.onCreate()
        var connection: DatabaseModel= DatabaseModel();
        connection.connect()
        computeHash("echris10sen", "1" )
    }
    //  Variables
//    var csv: String = (Environment.getExternalStorageDirectory().absolutePath.plus(".Data/MyCsvFile.csv"))
    //  Methods
//    private fun csvWriterFun(hash: String) {
//        val writer: CSVWriter
//        writer = CSVWriter(FileWriter(csv))
//
//        val data: ArrayList<String> = ArrayList<String>()
//        data.add(String{"token", hash})
//    }


    private fun computeHash(userName: String, userId: String) {
        val hashString = userId.plus(userName)
        val p = 31
        val m: Double = 1e9 + 9
        var hashValue: Long = 0
        var pPow: Long = 1
        for (i in hashString){
            hashValue = (hashValue + (i - 'a' + 1) * pPow) % m.toLong()
            pPow = (pPow * p) % m.toLong()
        }
        println("This is the power: $pPow and this is the Hash: $hashValue")
        return
    }



//    Getters

//    Setters
}