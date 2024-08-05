package com.example.dartsscorer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        val player01Name: EditText = findViewById(R.id.player01)
        val player02Name: EditText = findViewById(R.id.player02)
        val startButton: ImageView = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            val intent = Intent(this, ScoreActivity::class.java)
            startButton.animate().apply {
                duration = 50
                scaleXBy(-.1f)
                scaleYBy(-.1f)
            }.withEndAction {
                startButton.animate().apply {
                    duration = 50
                    scaleXBy(.1f)
                    scaleYBy(.1f)
                }
            }
            if(player01Name.text.toString() != "") {
                intent.putExtra("Player01Name", player01Name.text.toString())
            }
            else {
                intent.putExtra("Player01Name", "Player 01")
            }

            if(player02Name.text.toString() != "") {
                intent.putExtra("Player02Name", player02Name.text.toString())
            }
            else {
                intent.putExtra("Player02Name", "Player 02")
            }
            startActivity(intent)
        }
    }
}