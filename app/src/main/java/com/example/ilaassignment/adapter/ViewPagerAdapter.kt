package com.example.ilaassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.ilaassignment.R

/**
 * class ViewPagerAdapter for horizontal sliding implementation
 */
class ViewPagerAdapter(private val images: IntArray) :
    RecyclerView.Adapter<ViewPagerAdapter.CustomViewHolder>() {
    /**
     * custom class CustomViewHolder which inherits RecyclerView.ViewHolder
     * to implements horizontal sliding with images
     */
    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var imageView: ImageView = itemView.findViewById(R.id.imageViewPlaceHolder)

        fun setImage(img: Int) {
            imageView.setImageResource(img)
        }
    }

    /**
     * overridden method onCreateViewHolder
     * @return CustomViewHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.image_placeholder, parent, false)
        )
    }

    /**
     * overridden method onBindViewHolder
     * sets image to imageview
     */
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.setImage(images[position])
    }

    /**
     * overridden method getItemCount
     * @return size of list
     */
    override fun getItemCount(): Int {
        return images.size
    }
}