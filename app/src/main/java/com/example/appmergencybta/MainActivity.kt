package com.example.appmergencybta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appmergencybta.ui.theme.AppMergencyBtaTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            app()
        }
    }
}


@Preview
@Composable
fun app() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        item {
            Image(
                modifier = Modifier,
                //.fillMaxWidth(),
                // .height(450.dp),
                painter = painterResource(id = R.drawable.mebog), contentDescription = "MEBOG"
            )
            Text(
                text = "MEBOG",
                fontSize = 60.sp,
                color = Color.Green,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(30.dp)
            ) {
                //Text(text = "Ingresar",modifier = Modifier.fillMaxWidth().padding(10.dp), fontSize = 30.sp, color = Color.Black)
                Text(
                    text = "Códigos de tipificación",
                    modifier = Modifier
                       .fillMaxWidth()
                        .padding(10.dp),
                    fontSize = 35.sp,
                    color = Color.Black
                )
                Text(
                    text = "Geolocalización",
                    modifier = Modifier
                        //.fillMaxWidth()
                        .padding(10.dp),
                    fontSize = 35.sp,
                    color = Color.Black
                )
                Text(
                    text = "Servicio al ciudadano",
                    modifier = Modifier
                        //.fillMaxWidth()
                        .padding(10.dp),
                    fontSize = 35.sp,
                    color = Color.Black
                )
            }

        }
    }

}


