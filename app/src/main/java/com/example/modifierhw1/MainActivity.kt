package com.example.modifierhw1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val customModifier = Modifier
                .background(Color.Yellow)
                .border(width = 3.dp, color = Color.Red)
            Greeting(text = "Привет")
            Column( Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
                ) {
                Greeting(text = "Привет", modifier = customModifier)
            }
        }
    }

   
}

@Composable
fun Greeting(
    text: String,
    modifier: Modifier
){
    val defaultModifier = Modifier
        .padding(all = 16.dp)
        .border(width = 3.dp, color = Color.Red)
        .padding(all = 16.dp)
    Text(text = text, defaultModifier.then(modifier), color = Color.Black, fontSize = 28.sp)
   
}

@Composable
fun Greeting(
    text: String
){
    Text(text = text,
        color = Color.Black,
        fontSize = 28.sp,
        modifier = Modifier.padding(all = 16.dp),)
}

