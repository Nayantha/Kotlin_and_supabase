package com.nayanthayasiru.kotlin_and_supabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val client = createSupabaseClient(
            supabaseUrl = "https://xyzcompany.supabase.co",
            supabaseKey = "public-anon-key"
        ) {
            install(GoTrue)
            install(Postgrest)
            //install other modules
        }
    }
}