package com.example.hello

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(v : View) {
        Toast.makeText(getApplicationContext(), "버튼이 눌렸어요", Toast.LENGTH_LONG).show();
    }

//    fun onButton2Click(v : View) {
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
//        startActivity(intent)
//    }
}