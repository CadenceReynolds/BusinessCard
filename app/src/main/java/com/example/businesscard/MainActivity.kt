package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
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
        Spacer(Modifier.height(40.dp))
        NameInfo(modifier.align(alignment = Alignment.CenterHorizontally), Color.White, name)
        Spacer(Modifier.height(80.dp))
        Contact(modifier.align(alignment = Alignment.CenterHorizontally), Color.White)
    }
}

@Composable
fun NameInfo(modifier: Modifier, textColor: Color, name: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = modifier
                .height(45.dp)
                .background(
                    color = Color.Black
                )
        )


        Text(
            text = name,
            fontSize = 12.sp,
            modifier = modifier,
            color = textColor,
        )
        Text(
            text = "Amateur Coder and writer",
            fontSize = 8.sp,
            modifier = modifier,
            color = Color.Green
        )
    }
}

@Composable
fun Contact(modifier: Modifier, textColor: Color) {
    Column() {
        Row {
            Icon(
                Icons.Rounded.Call,
                contentDescription = null,
                tint = Color.White
            )
            Spacer(Modifier.width(5.dp))
            Text(
                text = "765-490-8902",
                modifier = modifier,
                color = textColor,
                fontSize = 10.sp,
            )
        }
        Spacer(Modifier.height(5.dp))
        Row {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color.White,
            )
            Spacer(Modifier.width(5.dp))
            Text(
                text = "@IDon'tUseSocialMedia",
                modifier = modifier,
                color = textColor,
                fontSize = 10.sp,
            )
        }
        Spacer(Modifier.height(5.dp))
        Row {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color.White,
            )
            Spacer(Modifier.width(5.dp))
            Text(
                text = "randomshit@gmail.com",
                modifier = modifier,
                color = textColor,
                fontSize = 10.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    BusinessCardTheme {
        Card("Cadence Reynolds")
    }
}