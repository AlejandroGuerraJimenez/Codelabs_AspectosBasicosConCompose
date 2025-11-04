package com.example.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentationcard.ui.theme.PresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    PresentationCardTheme()
                }
            }
        }
    }
}

@Composable
fun PresentationCardTheme() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // ---- Sección Superior ----
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Profile Icon",
            tint = Color(0xFF3DDC84),
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Tu Nombre",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Text(
            text = "Tu cargo o profesión",
            fontSize = 18.sp,
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.height(40.dp))

        // ---- Datos de contacto centrados ----
        ContactInfo(icon = Icons.Default.Call, info = "+00 (00) 000 000")
        ContactInfo(icon = Icons.Default.Share, info = "@socialmediahandle")
        ContactInfo(icon = Icons.Default.Email, info = "email@domain.com")
    }
}

@Composable
fun ContactInfo(icon: ImageVector, info: String) {
    Row(
        modifier = Modifier
            .padding(vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3DDC84),
            modifier = Modifier
                .padding(end = 8.dp)
                .size(22.dp)
        )
        Text(
            text = info,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}
