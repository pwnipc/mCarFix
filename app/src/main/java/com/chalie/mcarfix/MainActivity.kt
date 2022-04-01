package com.chalie.mcarfix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.chalie.mcarfix.R
import com.chalie.sharedmodule.Greeting

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Shared Module", "Hello from shared module: " + (Greeting().greeting()))
        Toast.makeText(this, "Hello From MainActivity",Toast.LENGTH_LONG).show();
    }
}