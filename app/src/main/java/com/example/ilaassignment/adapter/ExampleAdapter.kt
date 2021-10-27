package com.example.ilaassignment.adapter

import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import com.example.ilaassignment.R
import com.example.ilaassignment.data.ExampleItem
import java.util.ArrayList

/**
 * adapter class for list items an implemnetation of filter logic
 * using interface Filterable @see Filterable
 */
class ExampleAdapter constructor(exampleList: MutableList<ExampleItem>) :
    RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>(), Filterable {
    private val exampleList: List<ExampleItem>
    private lateinit var exampleListFull: List<ExampleItem>

    /**
     * custom ViewHolder class which inherit RecyclerView.ViewHolder
     * to customize ui according to needs
     */
    inner class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.image_view)
        var textView1: TextView = itemView.findViewById(R.id.text_view1)

    }

    /**
     * overridden method onCreateViewHolder
     * inflate itemList layout for adapter and return custom viewholder
     * @see ExampleViewHolder
     * @return ExampleViewHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(
            R.layout.example_item,
            parent, false
        )
        return ExampleViewHolder(v)
    }

    /**
     *overridden method onBindViewHolder
     * set item from exampleList @see exampleList to layout example_item
     */
    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
    }

    /**
     * overridden method getItemCount
     * @return size of list
     */
    override fun getItemCount(): Int {
        return exampleList.size
    }

    /**
     * overridden method getFilter
     * @return filtered list item based on search query
     */
    override fun getFilter(): Filter {
        return exampleFilter
    }

    /**
     * callback method for filter logics
     */
    private val exampleFilter: Filter = object : Filter() {
        /**
         * overridden method performFiltering
         * @param constraint takes each charector from input
         * @return filter results to getFilter methods
         */
        override fun performFiltering(constraint: CharSequence): FilterResults {
            val filteredList: MutableList<ExampleItem> = ArrayList()
            if (constraint.isEmpty()) {
                filteredList.addAll(exampleListFull)
            } else {
                val filterPattern = constraint.toString().toLowerCase().trim { it <= ' ' }
                for (item in exampleListFull) {
                    if (item.text1.toLowerCase().contains(filterPattern)) {
                        filteredList.add(item)
                    }
                }
            }
            val results = FilterResults()
            results.values = filteredList
            return results
        }

        /**
         * overridden method publishResults
         * clear @see exampleList and reset with filtered value
         * @param constraint input paramenter and filtered results
         */
        override fun publishResults(constraint: CharSequence, results: FilterResults) {
            exampleList.clear()
            exampleList.addAll(results.values as List<ExampleItem>)
            notifyDataSetChanged()
        }
    }

    /**
     * initialize ExampleAdapter
     */
    init {
        this.exampleList = exampleList
        exampleListFull = ArrayList(exampleList)
    }
}