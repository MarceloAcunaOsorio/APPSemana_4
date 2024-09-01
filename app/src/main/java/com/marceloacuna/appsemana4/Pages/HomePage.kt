package com.marceloacuna.appsemana4.Pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.marceloacuna.appsemana4.AuthState
import com.marceloacuna.appsemana4.AuthViewModel
import com.marceloacuna.appsemana4.Routes


@Composable
fun Home (modifier: Modifier = Modifier, navController: NavController, authViewModel: AuthViewModel) {

    val authState = authViewModel.authState.observeAsState()

    LaunchedEffect(authState.value) {
        when(authState.value){
            is AuthState.Unauthenticated -> navController.navigate(Routes.Login)
            else -> Unit
        }
    }


    Column (
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Home", fontSize = 32.sp)
        
        TextButton(onClick = {authViewModel.cerrarSesion()}) {
            Text(text = "Cerrar Sesión")
        }
    }
}