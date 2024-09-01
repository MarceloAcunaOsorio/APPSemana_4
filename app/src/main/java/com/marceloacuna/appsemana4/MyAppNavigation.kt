package com.marceloacuna.appsemana4

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.marceloacuna.appsemana4.Pages.Home
import com.marceloacuna.appsemana4.Pages.Login
import com.marceloacuna.appsemana4.Pages.Registrar

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Login, builder = {

        composable(Routes.Login,){
            Login(modifier,navController, authViewModel)
        }
        composable(Routes.Register,){
            Registrar(modifier,navController, authViewModel)
        }

        composable(Routes.home,){
            Home(modifier,navController, authViewModel)
        }

    })
}