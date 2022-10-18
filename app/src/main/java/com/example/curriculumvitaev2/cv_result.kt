package com.example.curriculumvitaev2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.appcompat.widget.Toolbar
import java.net.URI

class cv_result: AppCompatActivity(){

    private lateinit var btnSkills: Button
    private lateinit var btnHobbies: Button
    private lateinit var btnLanguages: Button
    private lateinit var btnCareer: Button


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.cv_result)

        supportActionBar?.hide()
        btnSkills = findViewById(R.id.btnSkills)

        btnHobbies = findViewById(R.id.btnHobbies)
        btnLanguages = findViewById(R.id.btnLanguages)

        var bundle :Bundle ?=intent.extras
        var fullname = bundle!!.getString("Name")
        var email = bundle!!.getString("Email")
        var android = bundle!!.getFloat("Android")
        var ios = bundle!!.getFloat("iOS")
        var flutter = bundle!!.getFloat("Flutter")
        var Language= bundle!!.getString("Language")
        var hobbies= bundle!!.getString("Hobbies")
        var imageUri = Uri.parse(bundle!!.getString("image"))
        val imageView:ImageView = findViewById(R.id.pf2)
        imageView.setImageURI(imageUri)
        val tname : TextView = findViewById(R.id.tname)
        tname.setText( fullname)

        val temail : TextView = findViewById(R.id.temail)
        temail.setText(email)

        val toolbar: Toolbar = findViewById(R.id.app_bar)
        setSupportActionBar(toolbar)
        val fragmentskills=skillsfragment.newInstance(android/100,ios/100,flutter/100)
       val fragmentlanguage=languagefragment.newInstance(Language.toString(),"")
        val fragmenthobbies=hobbiesfragment.newInstance(hobbies.toString(),"")
        toolbar.setNavigationOnClickListener(){
            finish()

        }
        btnSkills.setOnClickListener{
            changeFragment(fragmentskills,"Skills")
        }
        btnHobbies.setOnClickListener{
            changeFragment(fragmenthobbies, "Hobbies")
        }
        btnLanguages.setOnClickListener{
            changeFragment(fragmentlanguage, "Languages")
        }
        supportFragmentManager.beginTransaction().add(R.id.fragment_container,fragmentskills).commit()
        btnCareer = findViewById(R.id.btnCareer)

        btnCareer.setOnClickListener {
            val intent = Intent(this,carrerActivity::class.java)
            startActivity(intent)
        }

    }
    private fun changeFragment(fragment: Fragment, name: String) {


        if (name.isEmpty())

            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()

        else

            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(name).commit()

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){


            R.id.info -> changeFragment(infofragment(), "info")

        }
        return super.onOptionsItemSelected(item)
    }}
