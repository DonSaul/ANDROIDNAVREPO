package com.example.navegacion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Pantalla3(ControlNav: NavHostController) {

    Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
        
        Text(text = "Inicio Bienvenido", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(65.dp))
        Button(onClick = {

            ControlNav.navigate("Pantalla1"){
                popUpTo("Pantalla1"){inclusive= true}

            }




        }) {
            Text(text = "Moverme a la pantalla A")
            
        }

    }


}
