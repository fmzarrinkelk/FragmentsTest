package com.example.fragmentstest

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = this.supportFragmentManager.findFragmentById(R.id.frame_layout_1)
        if (fragment1 == null) {
            val fragment = Fragment1()
            this.supportFragmentManager
                .beginTransaction()
                .add(R.id.frame_layout_1, fragment)
                .commit()
        }
        if (this.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            val fragment2 = this.supportFragmentManager.findFragmentById(R.id.frame_layout_2)
            if (fragment2 == null) {
                val fragment = Fragment2()
                this.supportFragmentManager
                    .beginTransaction()
                    .add(R.id.frame_layout_2, fragment)
                    .commit()
            }

        }
    }
}