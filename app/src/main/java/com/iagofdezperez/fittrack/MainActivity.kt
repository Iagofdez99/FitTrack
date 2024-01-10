package com.iagofdezperez.fittrack

import android.os.Bundle
import android.text.Layout
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iagofdezperez.fittrack.ui.theme.FitTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitTrackTheme {
                ScaffoldApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldApp(){
    val context = LocalContext.current
    //var presses by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("FitTrack Home")
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
                Row(modifier = Modifier.fillMaxSize(),
                    Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,) {

                    Button(onClick = {
                        Toast.makeText(context,"Has presionado el inicio", Toast.LENGTH_SHORT).show()
                    }, Modifier.padding(10.dp)) {
                        Text(text = "Inicio")
                    }

                    Button(onClick = {
                        Toast.makeText(context,"Has presionado Ejercicios", Toast.LENGTH_SHORT).show()
                    }, Modifier.padding(10.dp)) {
                        Text(text = "Ejercicios")
                    }

                    Button(onClick = {
                        Toast.makeText(context,"Has presionado el Calendario", Toast.LENGTH_SHORT).show()
                    }, Modifier.padding(10.dp)) {
                        Text(text = "Calendario")
                    }
                }
            }
        },
        /*
        floatingActionButton = {
            FloatingActionButton(onClick = { presses++ }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
        */
    ){ innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text =
                """
                    Estos son los primeros pasos para crear la App FitTrack
                """.trimIndent(),
            )

            Row (Modifier.align(Alignment.CenterHorizontally)) {
                Image(
                    painter = painterResource(R.drawable.imagen1) ,
                    contentDescription = "Imagen de prueba"
                )
            }
            

        }

    }
}

@Composable
fun ListaEjercicios(ejercicios: List<String>){

    Column(){
        ejercicios.joinToString()
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FitTrackTheme {
        //Greeting("Android")
        ScaffoldApp()

    }
}
