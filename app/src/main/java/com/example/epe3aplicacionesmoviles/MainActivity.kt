package com.example.epe3aplicacionesmoviles

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.epe3aplicacionesmoviles.ui.theme.Epe3AplicacionesMovilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SensorMenu()
        }
    }

    @Composable
    fun SensorMenu() {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                startActivity(Intent(this@MainActivity, AccelerometerActivity::class.java))
            }) { Text("Acelerómetro") }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {
                startActivity(Intent(this@MainActivity, RotationActivity::class.java))
            }) { Text("Rotación") }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {
                startActivity(Intent(this@MainActivity, ProximityActivity::class.java))
            }) { Text("Proximidad") }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {
                startActivity(Intent(this@MainActivity, TemperatureActivity::class.java))
            }) { Text("Temperatura") }
        }
    }
}