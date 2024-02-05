package com.example.mod7demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    private var cpt = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        Log.i(TAG, "onCreate: ")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.tvCounter).text = (++cpt).toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState: ")
        outState.putInt("cpt", cpt)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.i(TAG, "onRestoreInstanceState: ")
        super.onRestoreInstanceState(savedInstanceState)
        cpt = savedInstanceState.getInt("cpt")
        findViewById<TextView>(R.id.tvCounter).text = cpt.toString()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: ")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: ")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart: ")
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: ")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: ")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: ")
    }
    
    
    
    
    
    
}