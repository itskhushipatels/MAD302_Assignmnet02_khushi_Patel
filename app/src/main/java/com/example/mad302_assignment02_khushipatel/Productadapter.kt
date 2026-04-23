/**
 * Course: MAD302-01 - Android Development
 * Assignment: Assignment 2
 * Student Name: Khushi Patel
 * Student ID: A00198843
 * Date of Submission: 04/22/2026
 * Description: RecyclerView Adapter for displaying a list of products.
 *              Uses ViewHolder pattern and lambda-based click handling.
 */

package com.example.mad302_assignment02_khushipatel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(
    private val products: List<Product>,
    private val onItemClicked: (Product) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textName: TextView  = itemView.findViewById(R.id.textProductName)
        val textPrice: TextView = itemView.findViewById(R.id.textProductPrice)
        val textDesc: TextView  = itemView.findViewById(R.id.textProductDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        // Inflate item_product.xml for each row
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(view)
    }


    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]

        // Set text fields from product data
        holder.textName.text  = product.name
        // Format price to always show 2 decimal places
        holder.textPrice.text = "$${String.format(java.util.Locale.getDefault(), "%.2f", product.price)}"
        holder.textDesc.text  = product.description

        // Lambda click handler — passes the tapped product back to MainActivity
        holder.itemView.setOnClickListener { onItemClicked(product) }
    }

    override fun getItemCount(): Int = products.size
}