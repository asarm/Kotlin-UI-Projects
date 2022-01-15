package com.example.onboardingscreens.onboarding.screens

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation
import com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions
import com.example.onboardingscreens.R
import com.google.android.material.imageview.ShapeableImageView
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()
        window.statusBarColor = Color.TRANSPARENT

        updateView()
    }

    private fun updateView() {
        Glide.with(this).asBitmap().load(R.mipmap.example).transition(BitmapTransitionOptions.withCrossFade())
            .skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(shapeableImageView)
    }
}
