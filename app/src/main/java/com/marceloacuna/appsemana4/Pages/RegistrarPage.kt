package com.marceloacuna.appsemana4.Pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.marceloacuna.appsemana4.AuthViewModel
import com.marceloacuna.appsemana4.R
import com.marceloacuna.appsemana4.Routes

@Composable
fun Registrar(modifier: Modifier = Modifier,navController: NavController,authViewModel: AuthViewModel){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        //imagen de pantalla de inicio
        Image(painter = painterResource(id = R.drawable.ramen), contentDescription = "Login Image",
            modifier = Modifier.size(200.dp))

        //texto de pantalla de inicio y su estilo
        Text(text = "Registro de Usuario", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        //salto de linea
        Spacer(modifier = Modifier.height(4.dp))

        //Input para ingresar el Nombre
        OutlinedTextField(value = "", onValueChange = {}, label = {Text(text = "Nombre Completo")},shape = RoundedCornerShape(50))

        //salto de linea
        Spacer(modifier = Modifier.height(4.dp))

        //Input para ingresar el Email
        OutlinedTextField(value = "", onValueChange = {}, label = {Text(text = "Email")},shape = RoundedCornerShape(50))

        //salto de linea
        Spacer(modifier = Modifier.height(4.dp))

        //Input para ingresar el Password
        OutlinedTextField(value = "", onValueChange = {}, label = {Text(text = "Contraseña")},shape = RoundedCornerShape(50))

        //salto de linea
        Spacer(modifier = Modifier.height(4.dp))

        //Input para ingresar el Confirmar Password
        OutlinedTextField(value = "", onValueChange = {}, label = {Text(text = "Confirmar Contraseña")},shape = RoundedCornerShape(50))

        //salto de linea
        Spacer(modifier = Modifier.height(4.dp))

        //Input para ingresar Fecha de Nacimiento
        OutlinedTextField(value = "", onValueChange = {}, label = {Text(text = "Fecha de Nacimiento")},shape = RoundedCornerShape(50))

        //salto de linea
        Spacer(modifier = Modifier.height(4.dp))

        //Input para ingresar direccion
        OutlinedTextField(value = "", onValueChange = {}, label = {Text(text = "Dirección")},shape = RoundedCornerShape(50))

        //salto de linea
        Spacer(modifier = Modifier.height(16.dp))

        //boton Registrar
        Button(onClick = {}) {
            Text(text = "Registrarse",
                modifier = Modifier.height(20.dp).width(100.dp),
                textAlign = TextAlign.Center
            )
        }

        //salto de linea
        Spacer(modifier = Modifier.height(16.dp))

        //volver al login
        Text(text = "Volver al Login", modifier = Modifier.clickable {
            navController.navigate(Routes.Login)
        })

    }
}