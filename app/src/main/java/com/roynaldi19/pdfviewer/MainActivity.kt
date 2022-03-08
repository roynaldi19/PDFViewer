package com.roynaldi19.pdfviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView
import com.roynaldi19.pdfviewer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.pdfview.fromAsset("arts.pdf")
            .enableSwipe(true)
            .swipeHorizontal(true)
            .enableDoubletap(true)
            .load()
    }
}