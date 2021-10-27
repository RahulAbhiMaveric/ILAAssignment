package com.example.ilaassignment.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ilaassignment.R
import com.example.ilaassignment.data.ExampleItem

/**
 * MainActivityViewModel inherit @see ViewModel
 */
class MainActivityViewModel : ViewModel() {
    private val exampleList = arrayListOf<ExampleItem>()
    val list = MutableLiveData<List<ExampleItem>>()

    /**
     * method fillExampleList
     * add list item for ui
     */
    fun fillExampleList() {
        exampleList.clear()
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine"))
        list.value = exampleList
    }

    /**
     * method fillExampleList1
     * add list item for ui
     */
    fun fillExampleList1() {
        exampleList.clear()
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two"))
        list.value = exampleList
    }

    /**
     * method fillExampleList2
     * add list item for ui
     */
    fun fillExampleList2() {
        exampleList.clear()
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Three"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Four"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Five"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Six"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Seven"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "Eight"))
        exampleList.add(ExampleItem(R.drawable.ic_sun, "Nine"))
        exampleList.add(ExampleItem(R.drawable.ic_audio, "One"))
        exampleList.add(ExampleItem(R.drawable.ic_launcher_foreground, "Two"))
        list.value = exampleList
    }


}