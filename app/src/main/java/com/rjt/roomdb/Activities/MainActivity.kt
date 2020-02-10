package com.rjt.roomdb.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rjt.roomdb.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        button_insert.setOnClickListener(this)
        button_read.setOnClickListener(this)
//        button_update.setOnClickListener(this)
//        button_delete.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.button_insert -> {
                startActivity(Intent(this, InsertActivity::class.java))
            }
            R.id.button_update -> {
                startActivity(Intent(this, UpdateActivity::class.java))
            }
            R.id.button_delete -> {
                startActivity(Intent(this, DeleteActivity::class.java))
            }
            R.id.button_read -> {
                startActivity(Intent(this, ReadActivity::class.java))
            }
        }
    }
}
