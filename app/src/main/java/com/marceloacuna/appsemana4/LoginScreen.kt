package com.marceloacuna.appsemana4

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
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

      //salto de linea
      Spacer(modifier = Modifier.height(4.dp))
      
      Text(text = "Ingrese con su cuenta")

      //salto de linea
      Spacer(modifier = Modifier.height(16.dp))

      //Input para ingresar el email
      OutlinedTextField(value = "", onValueChange = {}, label = {Text(text = "Email")})

      //salto de linea
      Spacer(modifier = Modifier.height(16.dp))

      //Input para ingresar el Contraseña
      OutlinedTextField(value = "", onValueChange = {}, label = {Text(text = "Contraseña")})
      
      //salto de linea
      Spacer(modifier = Modifier.height(16.dp))
      
      Button(onClick = {}) {
         Text(text = "Login")
      }

      //salto de linea
      Spacer(modifier = Modifier.height(32.dp))
      
      //recuperar contraseña
      Text(text = "Recuperar Contraseña?", modifier = Modifier.clickable {

      })

      //salto de linea
      Spacer(modifier = Modifier.height(32.dp))
      
      Text(text = "o iniciar seción con")


      Row (
         modifier = Modifier.fillMaxWidth().padding(30.dp),
         horizontalArrangement = Arrangement.SpaceEvenly
      )

      {

         //imagen de registro -> google
         Image(painter = painterResource(id = R.drawable.logo_google1), contentDescription = "google Image",
            modifier = Modifier
               .size(50.dp)
               .clickable { /*se agrega codigo al hacer click*/ })


         //imagen de registro -> facebook
         Image(painter = painterResource(id = R.drawable.logo_facebook), contentDescription = "facebook Image",
            modifier = Modifier
               .size(45.dp)
               .clickable { /*se agrega codigo al hacer click*/ })


         //imagen de registro -> twiter
         Image(painter = painterResource(id = R.drawable.logo_twiter1), contentDescription = "twiter Image",
            modifier = Modifier
               .size(50.dp)
               .clickable { /*se agrega codigo al hacer click*/ })

      }
   }
}





