package com.example.animations

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = Color.TRANSPARENT

        val ttb = AnimationUtils.loadAnimation(this, R.anim.top_to_bottom)
        val stb = AnimationUtils.loadAnimation(this, R.anim.scale_to_big)
        val stb2 = AnimationUtils.loadAnimation(this, R.anim.scale_to_big2)
        val btt = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top)

        val title = findViewById<TextView>(R.id.header)
        val desc = findViewById<TextView>(R.id.description)
        val image = findViewById<ImageView>(R.id.imageView)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        val button1 = findViewById<Button>(R.id.button1)

        title.startAnimation(ttb)
        desc.startAnimation(ttb)
        image.startAnimation(stb)
        button1.startAnimation(stb2)
        linearLayout.startAnimation(btt)
    }
}