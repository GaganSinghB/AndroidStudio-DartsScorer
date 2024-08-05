package com.example.dartsscorer

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class PlayerData {
    var score01: Int = 501
    var score02: Int = 501
    var number: Int = 0
    var multiplier: Int = 1
    var chance: Boolean = false
    var kitneThrow: Int = 0
    var roundScore: Int = 0
}

class ScoreActivity : AppCompatActivity() {
    private var playerData = PlayerData()
    private var pressedTime: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_score)
        this.window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        start()
    }

    private fun start(){
        val player01Name: TextView = findViewById(R.id.player01Name)
        val player02Name: TextView = findViewById(R.id.player02Name)
        val player01Score: TextView = findViewById(R.id.player01Score)
        val player02Score: TextView = findViewById(R.id.player02Score)

        val intent = intent
        val p1 = intent.getStringExtra("Player01Name")
        val p2 = intent.getStringExtra("Player02Name")

        var changeScore: Boolean = false

        player01Name.text = p1.toString().capitalize()
        player02Name.text = p2.toString().capitalize()

        playerData.score01 = 501
        playerData.score02 = 501
        playerData.kitneThrow = 0
        playerData.roundScore = 0

        player01Score.text = playerData.score01.toString()
        player02Score.text = playerData.score02.toString()

        player01Score.setOnClickListener {
            if(!changeScore) {
                playerData.score01 = 301
                playerData.score02 = 301
                player01Score.text = playerData.score01.toString()
                player02Score.text = playerData.score02.toString()
            }
            else {
                playerData.score01 = 501
                playerData.score02 = 501
                player01Score.text = playerData.score01.toString()
                player02Score.text = playerData.score02.toString()
            }
            changeScore = !changeScore
        }

        player02Score.setOnClickListener {
            if(!changeScore) {
                playerData.score01 = 301
                playerData.score02 = 301
                player01Score.text = playerData.score01.toString()
                player02Score.text = playerData.score02.toString()
            }
            else {
                playerData.score01 = 501
                playerData.score02 = 501
                player01Score.text = playerData.score01.toString()
                player02Score.text = playerData.score02.toString()
            }
            changeScore = !changeScore
        }

        playerData.chance = false
        changePlayer()
        play()
    }

    private fun play() {
        val button1: TextView = findViewById(R.id.Button1)
        val button2: TextView = findViewById(R.id.Button2)
        val button3: TextView = findViewById(R.id.Button3)
        val button4: TextView = findViewById(R.id.Button4)
        val button5: TextView = findViewById(R.id.Button5)
        val button6: TextView = findViewById(R.id.Button6)
        val button7: TextView = findViewById(R.id.Button7)
        val button8: TextView = findViewById(R.id.Button8)
        val button9: TextView = findViewById(R.id.Button9)
        val button10: TextView = findViewById(R.id.Button10)
        val button11: TextView = findViewById(R.id.Button11)
        val button12: TextView = findViewById(R.id.Button12)
        val button13: TextView = findViewById(R.id.Button13)
        val button14: TextView = findViewById(R.id.Button14)
        val button15: TextView = findViewById(R.id.Button15)
        val button16: TextView = findViewById(R.id.Button16)
        val button17: TextView = findViewById(R.id.Button17)
        val button18: TextView = findViewById(R.id.Button18)
        val button19: TextView = findViewById(R.id.Button19)
        val button20: TextView = findViewById(R.id.Button20)
        val bullButton: TextView = findViewById(R.id.ButtonBull)
        val missButton: TextView = findViewById(R.id.ButtonMiss)
        val playAgain: Button = findViewById(R.id.playAgainButton)
        val quitButton: TextView = findViewById(R.id.quitButton)
        val numberLayout: TableLayout = findViewById(R.id.numberLayout)
        val endLayout: ConstraintLayout = findViewById(R.id.endLayout)

        playAgain.setOnClickListener {
            numberLayout.visibility = View.VISIBLE
            endLayout.visibility = View.GONE
            start()
        }

        quitButton.setOnClickListener {
            onBackPressed()
            onBackPressed()
        }

        button1.setOnClickListener {
            playerData.number = 1
            setMultiplier()
        }
        button2.setOnClickListener {
            playerData.number = 2
            setMultiplier()
        }
        button3.setOnClickListener {
            playerData.number = 3
            setMultiplier()
        }
        button4.setOnClickListener {
            playerData.number = 4
            setMultiplier()
        }
        button5.setOnClickListener {
            playerData.number = 5
            setMultiplier()
        }
        button6.setOnClickListener {
            playerData.number = 6
            setMultiplier()
        }
        button7.setOnClickListener {
            playerData.number = 7
            setMultiplier()
        }
        button8.setOnClickListener {
            playerData.number = 8
            setMultiplier()
        }
        button9.setOnClickListener {
            playerData.number = 9
            setMultiplier()
        }
        button10.setOnClickListener {
            playerData.number = 10
            setMultiplier()
        }
        button11.setOnClickListener {
            playerData.number = 11
            setMultiplier()
        }
        button12.setOnClickListener {
            playerData.number = 12
            setMultiplier()
        }
        button13.setOnClickListener {
            playerData.number = 13
            setMultiplier()
        }
        button14.setOnClickListener {
            playerData.number = 14
            setMultiplier()
        }
        button15.setOnClickListener {
            playerData.number = 15
            setMultiplier()
        }
        button16.setOnClickListener {
            playerData.number = 16
            setMultiplier()
        }
        button17.setOnClickListener {
            playerData.number = 17
            setMultiplier()
        }
        button18.setOnClickListener {
            playerData.number = 18
            setMultiplier()
        }
        button19.setOnClickListener {
            playerData.number = 19
            setMultiplier()
        }
        button20.setOnClickListener {
            playerData.number = 20
            setMultiplier()
        }
        bullButton.setOnClickListener {
            playerData.number = 50
            playerData.multiplier = 1
            updateScore()
        }
        missButton.setOnClickListener {
            playerData.number = 0
            updateScore()
        }
    }

    private fun setMultiplier() {
        val numberLayout: TableLayout = findViewById(R.id.numberLayout)
        val dtLayout: ConstraintLayout = findViewById(R.id.dtLayout)
        val singleButton: TextView = findViewById(R.id.singleButton)
        val doubleButton: TextView = findViewById(R.id.doubleButton)
        val tripleButton: TextView = findViewById(R.id.tripleButton)
        val player01Score: TextView = findViewById(R.id.player01Score)
        val player02Score: TextView = findViewById(R.id.player02Score)

        numberLayout.visibility = View.GONE
        dtLayout.visibility = View.VISIBLE

        player01Score.setOnClickListener {  }
        player02Score.setOnClickListener {  }

        singleButton.setOnClickListener {
            playerData.multiplier = 1
            updateScore()
        }

        doubleButton.setOnClickListener {
            playerData.multiplier = 2
            updateScore()
        }

        tripleButton.setOnClickListener {
            playerData.multiplier = 3
            updateScore()
        }
    }

    private fun updateScore() {
        val player01Score: TextView = findViewById(R.id.player01Score)
        val player02Score: TextView = findViewById(R.id.player02Score)
        val numberLayout: TableLayout = findViewById(R.id.numberLayout)
        val dtLayout: ConstraintLayout = findViewById(R.id.dtLayout)
        val endLayout: ConstraintLayout = findViewById(R.id.endLayout)
        val result: TextView = findViewById(R.id.result)

        numberLayout.visibility = View.VISIBLE
        dtLayout.visibility = View.GONE

        player02Score.setOnClickListener {  }
        player01Score.setOnClickListener {  }

        playerData.kitneThrow++

        if(!playerData.chance) {
            playerData.score01 -= (playerData.number * playerData.multiplier)
            playerData.roundScore += (playerData.number * playerData.multiplier)

            if(playerData.score01 < 0 || playerData.score01 == 1) {
                playerData.score01 += playerData.roundScore
                playerData.chance = !playerData.chance
                changePlayer()
                reset()
            }

            if((playerData.score01 == 0 && playerData.multiplier == 2) || (playerData.score01 == 0 && playerData.number == 50 && playerData.multiplier == 1)) {
                numberLayout.visibility = View.GONE
                endLayout.visibility = View.VISIBLE
                result.text = "Player01 WON!!!"
            }
            else if(playerData.score01 == 0) {
                playerData.score01 += playerData.roundScore
                playerData.chance = !playerData.chance
                changePlayer()
                reset()
            }

            player01Score.text = playerData.score01.toString()
        }
        else {
            playerData.score02 -= (playerData.number * playerData.multiplier)
            playerData.roundScore += (playerData.number * playerData.multiplier)

            if(playerData.score02 < 0 || playerData.score02 == 1) {
                playerData.score02 += playerData.roundScore
                playerData.chance = !playerData.chance
                changePlayer()
                reset()
            }

            if((playerData.score02 == 0 && playerData.multiplier == 2) || (playerData.score02 == 0 && playerData.number == 50 && playerData.multiplier == 1)) {
                numberLayout.visibility = View.GONE
                endLayout.visibility = View.VISIBLE
                result.text = "Player02 WON!!!"
            }
            else if(playerData.score02 == 0) {
                playerData.score02 += playerData.roundScore
                playerData.chance = !playerData.chance
                changePlayer()
                reset()
            }

            player02Score.text = playerData.score02.toString()
        }

        if(playerData.kitneThrow >= 3){
            playerData.chance = !playerData.chance
            changePlayer()
            reset()
        }

        updateDots()

        showAnimation()
        play()
    }

    private fun changePlayer() {
        val player01Name: TextView = findViewById(R.id.player01Name)
        val player02Name: TextView = findViewById(R.id.player02Name)
        val player01Score: TextView = findViewById(R.id.player01Score)
        val player02Score: TextView = findViewById(R.id.player02Score)

        updateDots()

        if(!playerData.chance){
            player01Name.setTextColor(Color.parseColor("#2FFF00"))
            player01Score.setTextColor(Color.parseColor("#2FFF00"))
            player02Name.setTextColor(Color.WHITE)
            player02Score.setTextColor(Color.WHITE)
        }
        else {
            player02Name.setTextColor(Color.parseColor("#2FFF00"))
            player02Score.setTextColor(Color.parseColor("#2FFF00"))
            player01Name.setTextColor(Color.WHITE)
            player01Score.setTextColor(Color.WHITE)

        }
    }

    private fun reset() {
        playerData.kitneThrow = 0
        playerData.roundScore = 0
    }

    private fun updateDots() {
        val player01Throws: TextView = findViewById(R.id.player01Throws)
        val player02Throws: TextView = findViewById(R.id.player02Throws)

        if(!playerData.chance) {
            if(playerData.kitneThrow == 0) {
                player01Throws.text = "."
                player02Throws.text = ""
            }
            if(playerData.kitneThrow == 1) {
                player01Throws.text = ".."
                player02Throws.text = ""
            }
            if(playerData.kitneThrow == 2) {
                player01Throws.text = "..."
                player02Throws.text = ""
            }
        }
        else {
            if(playerData.kitneThrow == 0) {
                player02Throws.text = "."
                player01Throws.text = ""
            }
            if(playerData.kitneThrow == 1) {
                player02Throws.text = ".."
                player01Throws.text = ""
            }
            if(playerData.kitneThrow == 2) {
                player02Throws.text = "..."
                player01Throws.text = ""
            }
        }
    }

    private fun showAnimation(){
        val overlay: ImageView = findViewById(R.id.overlay)

        when(playerData.number){
            0 -> {
                overlay.setImageDrawable(getDrawable(R.drawable.dartboard))
                overlay.animate().apply {
                    duration = 300
                    scaleXBy(-0.9f)
                    scaleYBy(-0.9f)
                    rotationXBy(360f)
                    rotationYBy(360f)
                }.withEndAction {
                    overlay.animate().apply {
                        duration = 300
                        scaleXBy(0.9f)
                        scaleYBy(0.9f)
                    }
                }
            }
            1 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.onesingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.onedouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.onetriple))
                }
                animate()
            }
            2 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.twosingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.twodouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.twotriple))
                }
                animate()
            }
            3 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.threesingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.threedouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.threetriple))
                }
                animate()
            }
            4 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.foursingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.fourdouble))

                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.fourtriple))
                }
                animate()
            }
            5 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.fivesingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.fivedouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.fivetriple))
                }
                animate()
            }
            6 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.sixsingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.sixdouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.sixtriple))
                }
                animate()
            }
            7 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.sevensingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.sevendouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.sevensingle))
                }
                animate()
            }
            8 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.eightsingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.eightdouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.eighttriple))
                }
                animate()
            }
            9 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.ninesingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.ninedouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.ninetriple))
                }
                animate()
            }
            10 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.tensingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.tendouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.tentriple))
                }
                animate()
            }
            11 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.elevensingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.elevendouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.eleventriple))
                }
                animate()
            }
            12 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.twelvesingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.twelvedouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.twelvetriple))
                }
                animate()
            }
            13 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.thirteensingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.thirteendouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.thirteentriple))
                }
                animate()
            }
            14 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.fourteensingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.fourteendouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.fourteentriple))
                }
                animate()
            }
            15 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.fifteensingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.fifteendouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.fifteentriple))
                }
                animate()
            }
            16 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.sixteensingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.sixteendouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.sixteentriple))
                }
                animate()
            }
            17 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.seventeensingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.seventeendouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.seventeentriple))
                }
                animate()
            }
            18 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.eighteensingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.eighteendouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.eighteentriple))
                }
                animate()
            }
            19 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.nineteensingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.ninteendouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.ninteentriple))
                }
                animate()
            }
            20 -> {
                if(playerData.multiplier == 1) {
                    overlay.setImageDrawable(getDrawable(R.drawable.twentysingle))
                }
                if(playerData.multiplier == 2) {
                    overlay.setImageDrawable(getDrawable(R.drawable.twentydouble))
                }
                if(playerData.multiplier == 3) {
                    overlay.setImageDrawable(getDrawable(R.drawable.twentytriple))
                }
                animate()
            }
            50 -> {
                overlay.setImageDrawable(getDrawable(R.drawable.bullseye))
                overlay.animate().apply {
                    duration = 200
                    scaleXBy(1f)
                    scaleYBy(1f)
                }.withEndAction {
                    overlay.animate().apply {
                        duration = 200
                        scaleXBy(-1f)
                        scaleYBy(-1f)
                    }
                }
            }
        }
    }

    private fun animate() {
        val overlay: ImageView = findViewById(R.id.overlay)
        overlay.animate().apply {
            duration = 200
            alpha(.5f)
            scaleXBy(.2f)
            scaleYBy(.2f)
        }.withEndAction {
            overlay.animate().apply {
                duration = 200
                alpha(1f)
                scaleXBy(-.2f)
                scaleYBy(-.2f)
            }
        }
    }

    override fun onBackPressed() {
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        }
        pressedTime = System.currentTimeMillis();
    }
}