package com.rjt.roomdb.Database

import androidx.annotation.RequiresPermission
import androidx.room.*
import com.rjt.roomdb.Model.Employee

@Dao
interface MyDao {

    @Insert
    fun addEmployee(employee: Employee)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateEmployee(employee: Employee)

    @Delete
    fun deleteEmployee(employee: Employee)


    @Query("select * from employee_table")
    fun readEmployee(): List<Employee>

    @Query("select * from employee_table where id = :id ")
    fun getEmployeeById(id: String): Employee

}