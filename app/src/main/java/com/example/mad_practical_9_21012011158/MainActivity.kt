package com.example.mad_practical_9_21012011158

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmAnimation: AnimationDrawable
    lateinit var heartAnimation: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageAlarm : ImageView = findViewById(R.id.image_alarm)
        imageAlarm.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmAnimation=imageAlarm.background as AnimationDrawable

        val imageheart : ImageView = findViewById(R.id.image_heart)
        imageheart.setBackgroundResource(R.drawable.heart_animation_list)
        heartAnimation=imageheart.background as AnimationDrawable


    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus)
        {
            alarmAnimation.start()
        }
        else
        {
            alarmAnimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }
}