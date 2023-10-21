package com.example.casualhangouts.models

import android.os.Handler
import android.os.Looper
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.sql.DriverManager
import java.util.Properties
import java.util.concurrent.Executors

class DatabaseModel {
//    Variables
    private var executor = Executors.newSingleThreadExecutor()
    val handler = Handler(Looper.getMainLooper())
    private val url: URL = URL("https://ca-83o9.onrender.com/posts")
//    var posts: MutableList = MutableList
    fun connect() {
        executor.execute {
            var data: String = ""
            var dataParsed: String = ""
            var singleParsed: String = ""


//            var url: URL = URL("https://pokeapi.co/api/v2/pokemon/ditto")
            println("Getting Ready")
            val httpURLConnection: HttpURLConnection = url.openConnection() as HttpURLConnection
            println(httpURLConnection.responseCode)
            println("Connection Established")
            val bufferedReader: BufferedReader = BufferedReader(InputStreamReader(url.openStream()))
            println("Creating a reader")
            val iterator = bufferedReader.lineSequence().iterator()
            var line:String = "";
            while(iterator.hasNext()) {
                line = iterator.next();
                println("This is the initial line'$line'")
                println("Im Reading")
                data += line;
                println("This is the data: $data")
            }
           bufferedReader.close()

//
            var JA: JSONArray = JSONObject(data).getJSONArray("posts")
            println(JA)
            println("This is the Data: $data")
        }
    }

    fun addPost() {

    }

    fun deletePost() {

    }

    fun getPost() {
        connect()
    }

    fun updatePost() {

    }

    //    postgres://casualhangout_db_user:Y1O4unryQgWOwTlUt3s68Nux0M5bLkUG@dpg-ckpj0lo1hnes73d9o4r0-a.oregon-postgres.render.com/casualhangout_db
//    val jdbcURL = "jdbc:postgresql://dpg-ckpj0lo1hnes73d9o4r0-a:5432/casualhangout_db"
//    val props: Properties = Properties()
//    props.setProperty("user", "casualhangout_db_user")
//    props.setProperty("password", "Y1O4unryQgWOwTlUt3s68Nux0M5bLkUG")
//    props.setProperty("ssl", "true")
//    get the connection
//    val url: String = "jdbc:postgres://casualhangout_db_user:Y1O4unryQgWOwTlUt3s68Nux0M5bLkUG@dpg-ckpj0lo1hnes73d9o4r0-a.oregon-postgres.render.com/casualhangout_db"
//    val connection = DriverManager.getConnection(url)

//    println(connection.isValid(0))
}