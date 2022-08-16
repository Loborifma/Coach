package com.example.couch.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.couch.R
import com.example.couch.components.Constants
import com.example.couch.ui.theme.Blue
import com.example.couch.ui.theme.Invisible
import com.example.couch.ui.theme.MyShapes
import com.example.couch.ui.theme.Teal200

@Composable
fun WorkoutWithTools(
    modifier: Modifier = Modifier
){

    val matrix = ColorMatrix()
    matrix.setToScale(
        redScale = 0.5F,
        blueScale = 0.5F,
        greenScale = 0.5F,
        alphaScale = 1F
    )

    Surface(
        modifier = modifier
            .height(90.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Surface(
                shape = MyShapes.small
            ) {
                Image(
                    painter = painterResource(R.drawable.workout_with_tools),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    colorFilter = ColorFilter.colorMatrix(matrix),
                    modifier = Modifier.width(Constants.CARD_WIDTH.dp)
                )
            }
        }
        Column(
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(end = 64.dp)
                .fillMaxWidth()
        ) {
            FloatingActionButton(
                modifier = Modifier.size(36.dp),
                backgroundColor = Blue,
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_baseline_chevron_right_24),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
    }
}