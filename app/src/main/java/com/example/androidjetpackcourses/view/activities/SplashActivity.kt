package com.example.androidjetpackcourses.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.androidjetpackcourses.R
import com.example.androidjetpackcourses.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val splashAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_splash)
        binding.tvAppName.animation = splashAnimation
        splashAnimation.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {
            }

            override fun onAnimationEnd(animation: Animation?) {
                Handler(Looper.getMainLooper()).postDelayed({
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish()
                }, 1300)
            }

            override fun onAnimationRepeat(animation: Animation?) {
            }

        })
    }
}