package edu.svsu.biogen2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View) {
        val myIntent = Intent(this, DisplayNew::class.java)
        myIntent.putExtra("FIRST", txtFirst.getText().toString())
        myIntent.putExtra("LAST", txtLast.getText().toString())
        myIntent.putExtra("YEAR", txtYear.getText().toString())
        val selectedId: Int = radioGroup5.getCheckedRadioButtonId()
        val radioButton = findViewById(selectedId) as RadioButton
        myIntent.putExtra("DEGREE", radioButton.getText())
        myIntent.putExtra("MAJOR", dropdown.getSelectedItem().toString())
        myIntent.putExtra("SCHOOL", txtSchool.getText().toString())
        myIntent.putExtra("HOBBIES", txtHobbies.getText().toString())
        startActivity(myIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main)
        btnCreate.setOnClickListener(this)
    }

}
