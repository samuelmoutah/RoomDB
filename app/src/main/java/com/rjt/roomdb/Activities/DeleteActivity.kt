package com.rjt.roomdb.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import com.rjt.roomdb.Database.MyAppDatabase
import com.rjt.roomdb.Model.Employee
import com.rjt.roomdb.R
import kotlinx.android.synthetic.main.activity_delete.*

class DeleteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete)

        init()
    }

    private fun init() {
        button_delete.setOnClickListener {

            var id = edit_text_delete_id.text.toString()
            var name = edit_text_delete_name.text.toString()
            var email = edit_text_delete_email.text.toString()

            var employee = Employee(id, name, email)

            var mydb = Room.databaseBuilder(this, MyAppDatabase::class.java, "empDB")
                .allowMainThreadQueries().build()

            mydb.myDao().deleteEmployee(employee)
            Toast.makeText(this,"Inserted", Toast.LENGTH_SHORT).show()



        }
    }
}
