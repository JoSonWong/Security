package com.duoxida.security.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.duoxida.security.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tvVideo -> {
                Toast.makeText(applicationContext, "Video", Toast.LENGTH_SHORT).show()
            }
            R.id.tvImage -> {
                Toast.makeText(applicationContext, "Image", Toast.LENGTH_SHORT).show()
            }
            R.id.tvAudio -> {
                Toast.makeText(applicationContext, "Audio", Toast.LENGTH_SHORT).show()
            }
            R.id.tvDocument -> {
                Toast.makeText(applicationContext, "Doc", Toast.LENGTH_SHORT).show()
            }
            else -> null
        }
    }
}
