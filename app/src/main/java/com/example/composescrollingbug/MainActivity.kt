package com.example.composescrollingbug

import android.os.Bundle
import android.view.View
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(Modifier.fillMaxSize()) {
                items(30) { index ->
                    Row {
                        AndroidView(
                            factory = { context ->
                                View(context).apply {
                                    setBackgroundColor(0xFFCC0000.toInt())
                                }
                            },
                            modifier = Modifier.size(48.dp)
                        )
                        Text(text = "Item $index")
                    }
                    Divider()
                }
            }
        }
    }
}
