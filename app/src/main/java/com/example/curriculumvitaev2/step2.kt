package com.example.curriculumvitaev2

import android.content.Intent
import android.widget.SeekBar


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox

private var seekBarAndroid: SeekBar? = null
private var seekBarIos: SeekBar? = null
private var seekBarFlutter: SeekBar? = null
private var btnSubmit: Button? = null
private var arabic: CheckBox? = null
private var french: CheckBox? = null
private var english: CheckBox? = null
private var music: CheckBox? = null
private var sport: CheckBox? = null
private var games: CheckBox? = null

class step2 :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.step2)
        seekBarAndroid = findViewById<SeekBar>(R.id.seekBar_android)
        seekBarIos = findViewById<SeekBar>(R.id.seekBar_ios)
        seekBarFlutter= findViewById<SeekBar>(R.id.seekBar_flutter)
         arabic = findViewById<CheckBox>(R.id.checkBox_arabic)
         french = findViewById<CheckBox>(R.id.checkbox_french)
         english = findViewById<CheckBox>(R.id.checkBox_english)
         music = findViewById<CheckBox>(R.id.checkBox_music)
         sport = findViewById<CheckBox>(R.id.checkBox_sport)
         games = findViewById<CheckBox>(R.id.checkBox_game)
         btnSubmit= findViewById<Button>(R.id.SUBMIT)


        val intent = intent
        val name = intent.getStringExtra("Name")
        val age = intent.getStringExtra("Age")
        val mail = intent.getStringExtra("Email")
        val gender = intent.getStringExtra("Gender")
        var bundle :Bundle ?=intent.extras
        val imageURI= intent.getStringExtra("image")
        btnSubmit!!.setOnClickListener {



            val intent = Intent(this, cv_result::class.java)



            val language = when {
                arabic!!.isChecked && french!!.isChecked && english!!.isChecked -> "Arabic French English"
                arabic!!.isChecked && french!!.isChecked -> "Arabic French"
                arabic!!.isChecked && english!!.isChecked -> "Arabic English"
                french!!.isChecked && english!!.isChecked -> "French English"
                arabic!!.isChecked -> "Arabic"
                french!!.isChecked -> "French"
                english!!.isChecked -> "English"

                else -> "None"
            }


            val hobbies = when {
                music!!.isChecked && sport!!.isChecked && games!!.isChecked -> "Music Sport Games"
                  sport!!.isChecked && games!!.isChecked -> "Sport Games"
                sport!!.isChecked && music!!.isChecked -> "Sport Music"
                 games!!.isChecked && music!!.isChecked -> "Games Music"

                music!!.isChecked -> "Music"
                sport!!.isChecked -> "Sport"
                games!!.isChecked -> "Games"

                else -> "None"
            }

            println("--------------------------------------"+imageURI)
            intent.putExtra("Name", name)
            intent.putExtra("Age", age)
            intent.putExtra("Email", mail)
            intent.putExtra("Gender", gender)
            intent.putExtra("Android",seekBarAndroid!!.progress.toFloat())
            intent.putExtra("iOS", seekBarIos!!.progress.toFloat())
            intent.putExtra("Flutter", seekBarFlutter!!.progress.toFloat())
            intent.putExtra("Language", language)
            intent.putExtra("Hobbies", hobbies)
            intent.putExtra("image",imageURI)

            startActivity(intent)
            finish()
        }

    }
    }

