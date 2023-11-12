package com.example.pertemuan1

import android.graphics.Paint.Align
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan1.ui.theme.Pertemuan1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pertemuan1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Halo()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun Halo() {
    val context = LocalContext.current
    Column {
        Text(
            text = "Selamat Datang", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Blue
        )
        Text(
            text = "Datang", modifier = Modifier
                .background(Color.Cyan)
                .padding(10.dp)
                .fillMaxWidth()
        )
        Text(
            text = "To ensure that your app is accessible, supply a contentDescription for visual elements on screen. TalkBack reads out the content description, so you must ensure that the text is meaningful if read out loud and translated. In the above example, a stringResource() is used to load up the translated content description from the strings.xml file. If your visual element on screen is purely for visual decoration, set your contentDescription to null for the screen reader to ignore it.",
        )

        Spacer(modifier = Modifier.size(20.dp))

        Row {
            Image(painter = painterResource(id = R.drawable.dog1), contentDescription = "Dog")

            Spacer(modifier = Modifier.size(10.dp))

            Button(onClick = { Toast.makeText(context,"Haloo",Toast.LENGTH_SHORT).show() }) {
                Text(
                    text = "Click!"
                )
            }
        }
    }
}

