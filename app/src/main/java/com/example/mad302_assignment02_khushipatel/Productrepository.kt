/**
 * Course: MAD302-01 - Android Development
 * Assignment: Assignment 2
 * Student Name: Khushi Patel
 * Student ID: A00198843
 * Date of Submission: 04/22/2026
 * Description: Repository object that provides sample product data
 *              for the RecyclerView list screen.
 */

package com.example.mad302_assignment02_khushipatel

object ProductRepository {

    fun getProducts(): List<Product> {
        return listOf(
            Product(
                id = 1,
                name = "Wireless Headphones",
                price = 89.99,
                description = "Premium over-ear wireless headphones with active noise cancellation. " +
                        "Up to 30 hours of battery life and a comfortable padded headband for all-day wear."
            ),
            Product(
                id = 2,
                name = "Mechanical Keyboard",
                price = 129.99,
                description = "Compact TKL mechanical keyboard with Cherry MX Blue switches. " +
                        "RGB backlight, aluminium frame, and USB-C connectivity."
            ),
            Product(
                id = 3,
                name = "Portable Charger",
                price = 39.99,
                description = "20,000 mAh power bank with dual USB-A and USB-C ports. " +
                        "Supports 18W fast charging and fits easily in any bag."
            ),
            Product(
                id = 4,
                name = "Smart Watch",
                price = 199.99,
                description = "Feature-packed smartwatch with heart-rate monitoring, GPS, " +
                        "sleep tracking, and 7-day battery life. Water resistant to 50m."
            ),
            Product(
                id = 5,
                name = "Laptop Stand",
                price = 49.99,
                description = "Adjustable aluminium laptop stand compatible with 10 to 17 inch laptops. " +
                        "Foldable design for portability and ergonomic viewing angles."
            ),
            Product(
                id = 6,
                name = "USB-C Hub",
                price = 34.99,
                description = "7-in-1 USB-C hub with 4K HDMI, 3x USB 3.0, SD card reader, " +
                        "and 100W pass-through charging. Plug-and-play, no drivers needed."
            ),
            Product(
                id = 7,
                name = "Webcam 1080p",
                price = 69.99,
                description = "Full HD 1080p webcam with built-in stereo microphone and auto-focus. " +
                        "Wide 90 degree field of view, works with all major video-calling apps."
            ),
            Product(
                id = 8,
                name = "LED Desk Lamp",
                price = 29.99,
                description = "Touch-controlled LED desk lamp with 5 colour temperatures and " +
                        "10 brightness levels. USB charging port built into the base."
            )
        )
    }
}