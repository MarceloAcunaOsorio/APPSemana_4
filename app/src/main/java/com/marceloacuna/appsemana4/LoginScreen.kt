package com.marceloacuna.appsemana4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//se crea imagend de inicio de aplicacion
@Composable
fun LoginScreen() {

   Column(
      modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally
   )

   {
      //imagen de pantalla de inicio
      Image(painter = painterResource(id = R.drawable.logotienda), contentDescription = "Login Image",
         modifier = Modifier.size(200.dp))

      //texto de pantalla de inicio y su estilo
      Text(text = "Bienvenido My App", fontSize = 28.sp, fontWeight = FontWeight.Bold)
   }
}






