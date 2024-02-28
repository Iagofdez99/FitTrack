package com.iagofdezperez.fittrack.screens.workoutCalendar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.Calendar

class WorkoutCalendarViewModel:ViewModel() {
    private val _date = MutableLiveData<Calendar>()

    init {
        _date.value = Calendar.getInstance()
    }

    val date: LiveData<Calendar> = _date

    fun incrementDate(days:Int){
        val calendar = _date.value ?: return
        val newCalendar = calendar.clone() as Calendar
        newCalendar.add(Calendar.DAY_OF_MONTH, days)
        _date.value = newCalendar
    }

    fun decrementDate(days:Int){
        val calendar = _date.value ?: return
        val newCalendar = calendar.clone() as Calendar
        newCalendar.add(Calendar.DAY_OF_MONTH, days)
        _date.value = newCalendar
    }

}