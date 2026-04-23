/**
 * Course: MAD302-01 - Android Development
 * Assignment: Assignment 2
 * Student Name: Khushi Patel
 * Student ID: A00198843
 * Date of Submission: 04/22/2026
 * Description: Main screen of the app. Displays a scrollable list of products
 *              using RecyclerView. Tapping a product navigates to DetailActivity
 *              and passes the selected product via Intent.
 */

package com.example.mad302_assignment02_khushipatel

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load product data from the repository
        val products = ProductRepository.getProducts()

        recyclerView = findViewById(R.id.recyclerViewProducts)

        // Vertical list layout
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Set adapter with lambda click handler
        recyclerView.adapter = ProductAdapter(products) { selectedProduct ->
            navigateToDetail(selectedProduct)
        }
    }

    private fun navigateToDetail(product: Product) {
        val intent = Intent(this, DetailActivity::class.java).apply {
            // Attach the product as a Serializable extra
            putExtra(DetailActivity.EXTRA_PRODUCT, product)
        }
        startActivity(intent)
    }
}