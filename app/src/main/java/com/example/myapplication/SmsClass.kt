package com.example.myapplication

import kotlinx.datetime.DatePeriod
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import java.util.Date

@Serializable
data class SmsClass(val id : Int, val name : String, val msg : String, val time : String)