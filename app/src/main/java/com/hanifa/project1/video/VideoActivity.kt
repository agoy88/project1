package com.hanifa.project1.video

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.hanifa.project1.R

class VideoActivity : AppCompatActivity() {
    lateinit var videoView1: VideoView
    lateinit var videoView2: VideoView
    lateinit var videoView3: VideoView
    lateinit var mediaController1: MediaController
    lateinit var mediaController2: MediaController
    lateinit var mediaController3: MediaController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        setInitLayout()
        val video1Uri = Uri.parse(
            "android.resource://"
                    + packageName + "/" + R.raw.video1
        )
        val video2Uri = Uri.parse(
            "android.resource://"
                    + packageName + "/" + R.raw.video2
        )
        val video3Uri = Uri.parse(
            "android.resource://"
                    + packageName + "/" + R.raw.video3
        )

        videoPlayback(videoView1, video1Uri, mediaController1)
        videoPlayback(videoView2, video2Uri, mediaController2)
        videoPlayback(videoView3, video3Uri, mediaController3)


    }


    override fun onStop() {
        videoView1.stopPlayback()
        super.onStop()
    }

    private fun videoPlayback(videoView: VideoView, file: Uri, mediaController: MediaController) {
        mediaController.setAnchorView(videoView)
        videoView.setVideoURI(file)
        videoView.setMediaController(mediaController)
        videoView.requestFocus()
        videoView.stopPlayback()

    }


    private fun setInitLayout() {
        videoView1 = findViewById(R.id.video1)
        videoView2 = findViewById(R.id.video2)
        videoView3 = findViewById(R.id.video3)
        mediaController1 = MediaController(this)
        mediaController2 = MediaController(this)
        mediaController3 = MediaController(this)
    }
}