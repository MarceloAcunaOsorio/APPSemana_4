package com.marceloacuna.appsemana4.Pages



import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.marceloacuna.appsemana4.AuthState
import com.marceloacuna.appsemana4.AuthViewModel
import com.marceloacuna.appsemana4.Routes


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home (modifier: Modifier = Modifier, navController: NavController, authViewModel: AuthViewModel) {

    val authState = authViewModel.authState.observeAsState()
    var showMenu by remember{ mutableStateOf(false) }
    var context = LocalContext.current

    LaunchedEffect(authState.value) {
        when(authState.value){
            is AuthState.Unauthenticated -> navController.navigate(Routes.Login)
            else -> Unit
        }
    }

    TopAppBar(
        title = { Text(text = "My App") },
        actions = {
            IconButton(onClick = {Toast.makeText(context,"Home",Toast.LENGTH_SHORT).show()}) {
                Icon(Icons.Default.Home,"")
            }

            IconButton(onClick = {showMenu = !showMenu}) {
                Icon(Icons.Default.Menu,"")
            }

            DropdownMenu(
                expanded = showMenu,
                onDismissRequest = {showMenu = false}
            ) {
                DropdownMenuItem(text = { Text(text = "Settings")}, onClick = {Toast.makeText(context,"Settings",Toast.LENGTH_SHORT).show()})

                DropdownMenuItem(text = { Text(text = "Logout")}, onClick = {authViewModel.cerrarSesion()})
            }
        }
    )
        


}






