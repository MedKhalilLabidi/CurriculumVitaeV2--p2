package com.example.curriculumvitaev2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)

        val intent = intent
        val FullName = intent.getStringExtra("Name")
        val getAge = intent.getStringExtra("Age")
        val mail = intent.getStringExtra("Email")
        val getgender = intent.getStringExtra("Gender")
        val getandroid = intent.getStringExtra("Android")
        val getios = intent.getStringExtra("iOS")
        val getflutter = intent.getStringExtra("Flutter")
        val getlanguage = intent.getStringExtra("Language")
        val gethobbies = intent.getStringExtra("Hobbies")

        val name = findViewById<TextView>(R.id.Name)
        val email = findViewById<TextView>(R.id.Email)
        val age = findViewById<TextView>(R.id.age)
        val gender = findViewById<TextView>(R.id.gender)
        val android = findViewById<TextView>(R.id.android)
        val ios = findViewById<TextView>(R.id.IOS)
        val flutter = findViewById<TextView>(R.id.Flutter)
        val language = findViewById<TextView>(R.id.Languages)
        val hobbies = findViewById<TextView>(R.id.hobbies)

        name.text = "Name:$FullName"
        email.text = "Email:$mail"
        age.text = "Age:$getAge"
        gender.text = "Gender:$getgender"
        android.text = "AndroidSkill:$getandroid"
        ios.text = "IosSkill:$getios"
        flutter.text = "FlutterSkill:$getflutter"
        language.text = "Languages:$getlanguage"
        hobbies.text = "Hobbies:$gethobbies"

    }
}