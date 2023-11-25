package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import org.json.JSONArray
import java.text.DateFormat
import java.time.format.DateTimeFormatter
import java.util.ArrayList
import java.util.Date
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    var smsItems : ArrayList<SmsClass> = ArrayList<SmsClass>()
    var sms_array : JSONArray = JSONArray()
    var sms : RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sms = findViewById(R.id.sms_list)
        sms!!.layoutManager = LayoutManager(this, LayoutManager.)
        val dateParse : String = "2022-01-06 00:00:01"
        val form = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val localDate_ = java.time.LocalDateTime.parse(dateParse, form)

    }
}