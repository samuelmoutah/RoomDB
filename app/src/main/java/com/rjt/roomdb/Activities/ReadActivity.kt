
package com.rjt.roomdb.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.rjt.roomdb.Database.MyAppDatabase
import com.rjt.roomdb.Model.Employee
import com.rjt.roomdb.R

class ReadActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read)

        init()
    }

    private fun init() {
        var mydb = Room.databaseBuilder(this, MyAppDatabase::class.java, "empDB")
            .allowMainThreadQueries().build()

            var employeeList = mydb.myDao().readEmployee()


    }
}
