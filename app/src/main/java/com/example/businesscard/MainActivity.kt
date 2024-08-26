package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Card(
                        name = "Cadence Reynolds",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Card(name: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(
            color = Color.Black
        )

    ) {
        NameInfo(modifier.align(alignment = Alignment.CenterHorizontally), Color.White)
        Spacer(Modifier.height(30.dp))
        Contact(modifier.align(alignment = Alignment.CenterHorizontally), Color.White)
    }
}

@Composable
fun NameInfo(modifier: Modifier, textColor: Color) {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = modifier
                .height(120.dp)
                .background(
                    color = Color.Black
                )
        )
        Text(
            text = "Cadence Reynolds",
            fontSize = 20.sp,
            modifier = modifier,
            color = textColor
        )
        Text(
            text = "Ameture Coder and writer",
            modifier = modifier,
            color = textColor
        )
    }
}

@Composable
fun Contact(modifier: Modifier, textColor: Color) {
    Column() {
        Text(
            text = "765-490-8902",
            modifier = modifier,
            color = textColor
        )
        Text(
            text = "@IDon'tUseSocialMedia",
            modifier = modifier,
            color = textColor
        )
        Text(
            text = "randomshit@gmail.com",
            modifier = modifier,
            color = textColor

        )
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    BusinessCardTheme {
        Card("Android")
    }
}