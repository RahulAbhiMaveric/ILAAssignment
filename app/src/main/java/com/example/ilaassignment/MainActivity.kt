package com.example.ilaassignment

import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TableLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.ilaassignment.adapter.ExampleAdapter
import com.example.ilaassignment.adapter.ViewPagerAdapter
import com.example.ilaassignment.data.ExampleItem
import com.example.ilaassignment.viewmodels.MainActivityViewModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

/**
 *class MainActivity
 */
class MainActivity : AppCompatActivity() {
    private lateinit var mViewPager: ViewPager2

    private lateinit var recyclerAdapter: ExampleAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private lateinit var tabLayout: TabLayout
    private lateinit var mainViewModel: MainActivityViewModel
    private val imageList: IntArray =
        intArrayOf(R.drawable.books, R.drawable.books2, R.drawable.books2017)

    /**
     * overridden method onCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        mViewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tab_layout)
        val viewPagerAdapter = ViewPagerAdapter(imageList)
        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.search_view)
        mViewPager.adapter = viewPagerAdapter
        mainViewModel.fillExampleList()
        recyclerView.layoutManager = LinearLayoutManager(this)

        TabLayoutMediator(tabLayout, mViewPager) { tab, position ->

        }.attach()
        onClickListener()
        searchView.imeOptions = EditorInfo.IME_ACTION_DONE
        observeList()
    }

    /**
     * method onClickListener
     * handle click
     */
    private fun onClickListener() {
        val searchEditText =
            searchView.findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
        searchEditText.setTextColor(ContextCompat.getColor(applicationContext, R.color.black))
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                recyclerAdapter.filter.filter(newText)
                return false
            }

        })

        mViewPager.registerOnPageChangeCallback(object : OnPageChangeCallback() {

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Log.e("Selected_Page", position.toString())
                when (position) {
                    0 -> {
                        mainViewModel.fillExampleList()
                    }
                    1 -> {
                        mainViewModel.fillExampleList1()
                    }
                    2 -> {
                        mainViewModel.fillExampleList2()
                    }
                }
            }

        })

    }

    /**
     * method observeList
     * observe the changes in list and update ui accordingly
     */
    private fun observeList() {
        mainViewModel.list.observe(this, {
            recyclerAdapter = ExampleAdapter(it as MutableList<ExampleItem>)
            recyclerView.adapter = recyclerAdapter
        })
    }


}