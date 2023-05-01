package com.hanifa.project1

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.hanifa.project1.video.VideoActivity

class MainActivity : AppCompatActivity() {


    lateinit var ivPendahuluan: ImageView
    lateinit var ivMateri: ImageView
    lateinit var ivVideo: ImageView
    lateinit var ivLatsol: ImageView
    lateinit var ivQuiz: ImageView
    lateinit var ivRangkuman: ImageView
    lateinit var ivAbout: ImageView
    lateinit var ivPk: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setInitLayout()

        ivPendahuluan.setOnClickListener {
            val intent = Intent(this@MainActivity, PendahuluanActivity::class.java)
            startActivity(intent)
        }
        ivMateri.setOnClickListener {
            val intent = Intent(this@MainActivity, MateriActivity::class.java)
            startActivity(intent)
        }
        ivVideo.setOnClickListener {
            val intent = Intent(this@MainActivity, VideoActivity::class.java)
            startActivity(intent)
        }
        ivLatsol.setOnClickListener {
            val intent = Intent(this@MainActivity, LatsolActivity::class.java)
            startActivity(intent)
        }
        ivQuiz.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
        ivRangkuman.setOnClickListener {
            val intent = Intent(this, RangkumanActivity::class.java)
            startActivity(intent)
        }
        ivAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        ivPk.setOnClickListener {
            val intent = Intent(this, PkActivity::class.java)
            startActivity(intent)
        }







        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = ContextCompat.getColor(this, R.color.biru_muda)
        }


    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Apakah Anda yakin ingin menutup aplikasi?")
            .setCancelable(false)
            .setPositiveButton("Ya") { _, _ ->
                finish()
            }
            .setNegativeButton("Tidak", null)
            .show()
    }


    private fun setInitLayout() {
        ivPendahuluan = findViewById(R.id.ivPendahuluan)
        ivMateri = findViewById(R.id.ivMateri)
        ivVideo = findViewById(R.id.ivVideo)
        ivLatsol = findViewById(R.id.ivLatsol)
        ivQuiz = findViewById(R.id.ivQuiz)
        ivRangkuman = findViewById(R.id.ivRangkuman)
        ivAbout = findViewById(R.id.ivAbout)
        ivPk = findViewById(R.id.ivPk)
    }


}