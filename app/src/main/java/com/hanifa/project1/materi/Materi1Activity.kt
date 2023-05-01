package com.hanifa.project1.materi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.hanifa.project1.R
import java.io.InputStream

class Materi1Activity : AppCompatActivity() {
    lateinit var tvWordContent : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi1)
        setInitLayout()
        val wordContent = readWordFile(this)
        tvWordContent.text = wordContent

    }
    private fun setInitLayout(){
        tvWordContent = findViewById(R.id.tvMateri_1)
    }

    fun readWordFile(context: Context): String {
        val inputStream: InputStream = context.assets.open("materi 1.txt")
        val buffer = ByteArray(inputStream.available())
        inputStream.read(buffer)
        inputStream.close()
        return String(buffer)
    }
}