package com.hanifa.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.hanifa.project1.materi.Materi1Activity
import com.hanifa.project1.materi.Materi2Activity
import com.hanifa.project1.materi.Materi3Activity
import com.hanifa.project1.materi.Materi4Activity

class MateriActivity : AppCompatActivity() {
    lateinit var cvMateri_1 : CardView
    lateinit var cvMateri_2 : CardView
    lateinit var cvMateri_3 : CardView
    lateinit var cvMateri_4 : CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)
        setInitLayout()
        cvMateri_1.setOnClickListener{
            val intent = Intent(this,Materi1Activity::class.java)
            startActivity(intent)
        }
        cvMateri_2.setOnClickListener{
            val intent = Intent(this, Materi2Activity::class.java)
            startActivity(intent)
        }
        cvMateri_3.setOnClickListener{
            val intent = Intent(this, Materi3Activity::class.java)
            startActivity(intent)
        }
        cvMateri_4.setOnClickListener{
            val intent = Intent(this, Materi4Activity::class.java)
            startActivity(intent)
        }

    }

    private fun setInitLayout(){
        cvMateri_1 = findViewById(R.id.cvMateri_1)
        cvMateri_2 = findViewById(R.id.cvMateri_2)
        cvMateri_3 = findViewById(R.id.cvMateri_3)
        cvMateri_4 = findViewById(R.id.cvMateri_4)
    }
}