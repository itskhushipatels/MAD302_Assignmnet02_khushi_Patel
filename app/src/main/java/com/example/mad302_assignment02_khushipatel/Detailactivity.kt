/**
 * Course: MAD302-01 - Android Development
 * Assignment: Assignment 2
 * Student Name: Khushi Patel
 * Student ID: A00198843
 * Date of Submission: 04/22/2026
 * Description: Detail screen showing full information for a selected product.
 *              Receives a Product object from MainActivity via Intent extras
 *              and uses null safety when unpacking it.
 */

package com.example.mad302_assignment02_khushipatel

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {

    companion object {
        /** Key used to pass the [Product] via Intent. */
        const val EXTRA_PRODUCT = "extra_product"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Show the back arrow in the ActionBar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Null-safe cast — getSerializableExtra returns null if extra is missing
        val product = intent.getSerializableExtra(EXTRA_PRODUCT) as? Product

        // Guard: if no product data arrived, show a message and close
        if (product == null) {
            Toast.makeText(this, "Product data unavailable.", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        // Find views
        val textName: TextView  = findViewById(R.id.textDetailName)
        val textPrice: TextView = findViewById(R.id.textDetailPrice)
        val textDesc: TextView  = findViewById(R.id.textDetailDescription)

        // Populate views with product data
        textName.text  = product.name
        textPrice.text = "$${String.format(java.util.Locale.getDefault(), "%.2f", product.price)}"
        textDesc.text  = product.description

        // Set ActionBar title to product name
        supportActionBar?.title = product.name
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}