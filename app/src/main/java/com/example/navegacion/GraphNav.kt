package com.example.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navegacion(){

    val ControlNav = rememberNavController()
    NavHost(navController = ControlNav, startDestination = "Pantalla1" ){

        composable(route="Pantalla1"){

            Pantalla1(ControlNav)
        }

        composable(route="Pantalla2"){

            Pantalla2(ControlNav)
        }

        composable(route="Pantalla3"){

            Pantalla3(ControlNav)
        }


    }


}

@Preview
@Composable
fun PreviewComposable(){

    Navegacion()

}