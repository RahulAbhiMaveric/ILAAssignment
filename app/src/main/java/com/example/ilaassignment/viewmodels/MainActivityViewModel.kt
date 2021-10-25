package com.example.ilaassignment.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ilaassignment.R
import com.example.ilaassignment.data.ExampleItem

class MainActivityViewModel : ViewModel() {
    private val exampleList = arrayListOf<ExampleItem>()
    val list = MutableLiveData<List<ExampleItem>>()

    fun fillExampleList() {
        exampleList.clear()
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One", "Ten"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two", "Eleven"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three", "Twelve"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four", "Thirteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five", "Fourteen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six", "Fifteen"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven", "Sixteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight", "Seventeen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine", "Eighteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One", "Ten"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two", "Eleven"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three", "Twelve"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four", "Thirteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five", "Fourteen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six", "Fifteen"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven", "Sixteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight", "Seventeen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine", "Eighteen"))
        list.value = exampleList
    }
    fun fillExampleList1() {
        exampleList.clear()
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three", "Twelve"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four", "Thirteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five", "Fourteen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six", "Fifteen"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven", "Sixteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight", "Seventeen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine", "Eighteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One", "Ten"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two", "Eleven"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three", "Twelve"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four", "Thirteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five", "Fourteen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six", "Fifteen"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven", "Sixteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight", "Seventeen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine", "Eighteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One", "Ten"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two", "Eleven"))
        list.value = exampleList
    }
    fun fillExampleList2() {
        exampleList.clear()
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four", "Thirteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five", "Fourteen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three", "Twelve"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six", "Fifteen"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven", "Sixteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight", "Seventeen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine", "Eighteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One", "Ten"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two", "Eleven"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three", "Twelve"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four", "Thirteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five", "Fourteen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six", "Fifteen"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven", "Sixteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight", "Seventeen"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine", "Eighteen"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One", "Ten"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two", "Eleven"))
        list.value = exampleList
    }


}