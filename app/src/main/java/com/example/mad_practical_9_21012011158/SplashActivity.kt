package com.example.mad_practical_9_21012011158

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity(),Animation.AnimationListener {

    lateinit var logoImage: ImageView
    lateinit var logoAnimation: Animation
    lateinit var imageAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        logoImage=findViewById(R.id.logo_image)
        logoImage.setBackgroundResource(R.drawable.logo_animation_list)


//        imageAnimation = logoImage.background as AnimationDrawable
//        logoImage.setBackgroundResource((R.drawable.uvpce_logo))
        logoImage.background as AnimationDrawable
        logoAnimation=AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        logoAnimation.setAnimationListener(this)


        fun onWindowFocusChanged(hasFocus: Boolean) {
            if (hasFocus)
            {
                logoAnimation.start()
//                logoImage.startAnimation(logoAnimation)
            }
            else
            {
                imageAnimation.stop()
            }
            super.onWindowFocusChanged(hasFocus)
        }
    }

    override fun onAnimationStart(animation: Animation?) {

    }

    override fun onAnimationEnd(animation: Animation?) {

        Intent(this,SplashActivity::class.java).apply { startActivity(this) }

    }

    override fun onAnimationRepeat(animation: Animation?) {
    }

}