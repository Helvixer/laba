package com.example.myapplication.utils

import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.GoTrue
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.storage.Storage

object SBobj {
    private var client = createSupabaseClient(
        supabaseUrl = "https://sqrerppgkdgwjqprutgz.supabase.co",

        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InNxcmVycHBna2Rnd2pxcHJ1dGd6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTU3MjM5NTAsImV4cCI6MjAxMTI5OTk1MH0.5THfzTq00a32NMZiC-Hqt0KNWlBNBQi1wRjxXZmsLKs"
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