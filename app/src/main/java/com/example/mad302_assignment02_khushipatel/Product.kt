/**
 * Course: MAD302-01 - Android Development
 * Assignment: Assignment 2
 * Student Name: Khushi Patel
 * Student ID: A00198843
 * Date of Submission: 04/22/2026
 * Description: Data model representing a single product in the store.
 *              Implements Serializable so it can be passed between Activities via Intent.
 */

package com.example.mad302_assignment02_khushipatel

import java.io.Serializable

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String
) : Serializable