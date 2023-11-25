package com.example.myapplication.utils

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.GoTrue
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.storage.Storage

object SBobj {
    private var client = createSupabaseClient(
        supabaseUrl = "https://iwovebmcintyfhxaikbv.supabase.co",

        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Iml3b3ZlYm1jaW50eWZoeGFpa2J2Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MDA5MTUyNTUsImV4cCI6MjAxNjQ5MTI1NX0.3gNfpYr6YEtsupulyOZE7sx4BzOujQmeQ6OHGngHegE"
    ) {
        install(GoTrue)
        install(Postgrest)
        install(Storage)
        //install other modules
    }

    fun getClient() : SupabaseClient {
        return client
    }

}