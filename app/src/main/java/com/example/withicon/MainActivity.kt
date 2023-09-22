package com.example.withicon

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    var player = "p1"

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val back = findViewById<ImageView>(R.id.back)
     var b1 = findViewById<Button>(R.id.b1)
      var b2 = findViewById<Button>(R.id.b2)
     var b3 = findViewById<Button>(R.id.b3)
    var b4 = findViewById<Button>(R.id.b4)
    var b5 = findViewById<Button>(R.id.b5)
    var b6 = findViewById<Button>(R.id.b6)
    var b7 = findViewById<Button>(R.id.b7)
    var b8 = findViewById<Button>(R.id.b8)
    var b9 = findViewById<Button>(R.id.b9)
    var rrr =findViewById<Button>(R.id.btnReset)


        back.setOnClickListener {
            onBackPressed()
        }
        b1.setOnClickListener {
            buttonClick(b1)
        }
        b2.setOnClickListener {
            buttonClick(b2)
        }
        b3.setOnClickListener {
            buttonClick(b3)
        }
        b4.setOnClickListener {
            buttonClick(b4)
        }
        b5.setOnClickListener {
            buttonClick(b5)
        }
        b6.setOnClickListener {
            buttonClick(b6)
        }
        b7.setOnClickListener {
            buttonClick(b7)
        }
        b8.setOnClickListener {
            buttonClick(b8)
        }
        b9.setOnClickListener {
            buttonClick(b9)
        }
    rrr.setOnClickListener{
        reset()
    }


    }

    private fun reset() {
        var b1 = findViewById<Button>(R.id.b1)
        var b2 = findViewById<Button>(R.id.b2)
        var b3 = findViewById<Button>(R.id.b3)
        var b4 = findViewById<Button>(R.id.b4)
        var b5 = findViewById<Button>(R.id.b5)
        var b6 = findViewById<Button>(R.id.b6)
        var b7 = findViewById<Button>(R.id.b7)
        var b8 = findViewById<Button>(R.id.b8)
        var b9 = findViewById<Button>(R.id.b9)
        b1.text=""
        b2.text=""
        b3.text=""
        b4.text=""
        b5.text=""
        b6.text=""
        b7.text=""
        b8.text=""
        b9.text=""
        b1.isEnabled=true
        b2.isEnabled=true
        b3.isEnabled=true
        b4.isEnabled=true
        b5.isEnabled=true
        b6.isEnabled=true
        b7.isEnabled=true
        b8.isEnabled=true
        b9.isEnabled=true
    }

    private fun buttonClick(btn: Button) {
        if (btn.text == "") {
            if (player == "p1") {
                player = "p2"
                btn.text = "X"
            } else {
                player = "p1"
                btn.text = "O"
            }
        }



win()
        }
    private fun win() {
        var b1 = findViewById<Button>(R.id.b1)
        var b2 = findViewById<Button>(R.id.b2)
        var b3 = findViewById<Button>(R.id.b3)
        var b4 = findViewById<Button>(R.id.b4)
        var b5 = findViewById<Button>(R.id.b5)
        var b6 = findViewById<Button>(R.id.b6)
        var b7 = findViewById<Button>(R.id.b7)
        var b8 = findViewById<Button>(R.id.b8)
        var b9 = findViewById<Button>(R.id.b9)

        if ((b1.text == "X" && b2.text == "X" && b3.text == "X")|| (b4.text == "X" && b5.text == "X" && b6.text == "X")||
            (b7.text == "X" && b8.text == "X" && b9.text == "X") ||  (b1.text == "X" && b4.text == "X" && b7.text == "X")
            ||(b2.text == "X" && b5.text == "X" && b8.text == "X")|| (b3.text == "X" && b6.text == "X" && b9.text == "X")
                || (b1.text == "X" && b5.text == "X" && b9.text == "X")||  (b3.text == "X" && b5.text == "X" && b7.text == "X")) {
            Toast.makeText(this, "X is winner", Toast.LENGTH_SHORT).show()
            disbleButtons()



        }

        // O is winning code
        if ((b1.text == "O" && b2.text == "O" && b3.text == "O")|| (b4.text == "O" && b5.text == "O" && b6.text == "O")||
            (b7.text == "O" && b8.text == "O" && b9.text == "O") ||  (b1.text == "O" && b4.text == "O" && b7.text == "O")
            ||(b2.text == "O" && b5.text == "O" && b8.text == "O")|| (b3.text == "O" && b6.text == "O" && b9.text == "O")
            || (b1.text == "O" && b5.text == "O" && b9.text == "O")||  (b3.text == "O" && b5.text == "O" && b7.text == "O")) {
            Toast.makeText(this, "O is winner", Toast.LENGTH_SHORT).show()
            disbleButtons()

        }
    }

    private fun disbleButtons() {

        var b1 = findViewById<Button>(R.id.b1)
        var b2 = findViewById<Button>(R.id.b2)
        var b3 = findViewById<Button>(R.id.b3)
        var b4 = findViewById<Button>(R.id.b4)
        var b5 = findViewById<Button>(R.id.b5)
        var b6 = findViewById<Button>(R.id.b6)
        var b7 = findViewById<Button>(R.id.b7)
        var b8 = findViewById<Button>(R.id.b8)
        var b9 = findViewById<Button>(R.id.b9)
        b1.isEnabled=false
        b2.isEnabled=false
        b3.isEnabled=false
        b4.isEnabled=false
        b5.isEnabled=false
        b6.isEnabled=false
        b7.isEnabled=false
        b8.isEnabled=false
        b9.isEnabled=false



    }



}
