package com.marceloacuna.appsemana4.model

import com.marceloacuna.appsemana4.R

val recetas = listOf(
    Receta(
        id = 1,
        name = "Hamburguesa",
        descripcion = "El orden para armar una hamburguesa es primero el pan, salsa, cebolla, lechuga, tomate, queso, carne y pan.",
        R.drawable.burger
    ),
    Receta(
        id = 2,
        name = "Paste",
        descripcion = "Precalienta el horno a 180 °C (350 °F). Engrasa y enharina un molde para hornear grande (23×33 centímetros) o tres pequeños (20 centímetros de diámetro).\n" +
                "\n" +
                "Bate la mantequilla con el azúcar en un tazón grande, hasta que se esponje. Añade el extracto de vainilla, y mezcla bien. Agrega una por una las yemas de huevo, batiendo bien después de cada adición.\n" +
                "\n" +
                "Mezcla la harina con el polvo para hornear. Cierne poco a poco sobre el batido de mantequilla, alternando con la leche e incorporando muy bien. Sigue batiendo hasta que la masa empiece a formar burbujas de aire.\n" +
                "\n" +
                "Aparte, bate las claras de huevo con una pizca de sal hasta que formen picos firmes. Envuelve en la masa del pastel.\n" +
                "\n" +
                "Vierte la masa dentro del molde o moldes y hornea de 25 a 35 minutos, o hasta que pasen la prueba del palillo.",
        R.drawable.cake
    ),
    Receta(
        id = 3,
        name = "Papas fritas",
        descripcion = "Se preparan cortando patatas en tiras iguales, secándolas y friéndolas , normalmente en una freidora. Las patatas russet precortadas, escaldadas y congeladas se utilizan mucho y, a veces, se hornean en un horno normal o de convección; Las freidoras son pequeños hornos de convección comercializados para freír patatas.",
        R.drawable.fries
    )
)