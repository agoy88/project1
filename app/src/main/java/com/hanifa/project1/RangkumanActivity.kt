package com.hanifa.project1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.InputStream

class RangkumanActivity : AppCompatActivity() {
    lateinit var tvWordContent : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rangkuman)
        setInitLayout()
        val wordContent = readWordFile(this)
        tvWordContent.text = wordContent

    }
    private fun setInitLayout(){
        tvWordContent = findViewById(R.id.tvRangkuman)
    }

    fun readWordFile(context: Context): String {
        val inputStream: InputStream = context.assets.open("rangkuman.txt")
        val buffer = ByteArray(inputStream.available())
        inputStream.read(buffer)
        inputStream.close()
        return String(buffer)
    }
}