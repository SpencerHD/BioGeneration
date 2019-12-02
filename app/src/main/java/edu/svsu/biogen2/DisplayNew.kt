package edu.svsu.biogen2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_display_new.*


class DisplayNew : AppCompatActivity() {

    private var degree = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_new)
        val myIntent = Intent()
        val firstName = intent.extras!!.getString("FIRST").toString()
        val lastName = intent.extras!!.getString("LAST").toString()
        val year = intent.extras!!.getString("YEAR").toString()
        val degree = intent.extras!!.getString("DEGREE").toString()
        val major = intent.extras!!.getString("MAJOR").toString()
        val school = intent.extras!!.getString("SCHOOL").toString()
        val activities = intent.extras!!.getString("HOBBIES").toString()
        if (txtContents != null) {
                txtContents.setText(firstName + " " + lastName + " graduated in " + year + " with a " + degree + " with a concentration in " + major + " from " + school + ". Their favorite activities are " + activities + ".")
        }
    }


}
