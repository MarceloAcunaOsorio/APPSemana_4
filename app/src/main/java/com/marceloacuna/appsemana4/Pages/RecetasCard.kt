package com.marceloacuna.appsemana4.Pages

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.marceloacuna.appsemana4.model.recetas
import com.marceloacuna.appsemana4.ui.theme.APPSemana4Theme


@Composable
fun RecetasCard (name:String, descripcion:String,images:Int){

    Card (
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(painter = painterResource(id = images),
                contentDescription = null,
                modifier = Modifier.size(130.dp).padding(8.dp),
                contentScale = ContentScale.Fit
            )
            Column(
                Modifier.padding(8.dp)
            ) {
                Text(text = name,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    color = MaterialTheme.colors.onSurface
                )
                Text(text = descripcion,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    color = MaterialTheme.colors.onSurface
                )
            }

        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")

@Composable
fun ResetCardPreview(){
    APPSemana4Theme{
        RecetasCard(name = recetas[2].name, descripcion = recetas[2].descripcion, images = recetas[2].imageRes)
    }
}






