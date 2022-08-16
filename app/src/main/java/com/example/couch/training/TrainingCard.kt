package com.example.couch.training

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.couch.R

@Composable
fun TrainingCard(
    modifier: Modifier = Modifier,
    @StringRes title: Int,
    @StringRes subtitle: Int = R.string.empty_string,
    @DrawableRes drawable: Int,
    alphaBeginner: Float = 0f,
    alphaContinued: Float = 0f,
    alphaAdvanced: Float = 0f,
){
    val matrix = ColorMatrix()
    matrix.setToScale(
        redScale = 0.33F,
        blueScale = 0.33F,
        greenScale = 0.33F,
        alphaScale = 1F
    )

    Surface(
        modifier = modifier
            .width(325.dp)
            .height(105.dp)
            .padding(bottom = 8.dp),
        shape = MaterialTheme.shapes.medium
    ){
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.colorMatrix(matrix)
        )
        Column(
            modifier = Modifier
                    .padding(start = 14.dp, top = 24.dp)
        ) {
            Text(
                text = stringResource(title).uppercase(),
                fontWeight = FontWeight.Bold,
                color = Color.White,

            )
            Text(
                text = stringResource(subtitle),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Row(modifier = Modifier.padding(top = 8.dp)) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp),
                    tint = Color.White.copy(
                        alpha = alphaBeginner
                    ),
                )
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp),
                    tint = Color.White.copy(
                        alpha = alphaContinued
                    ),
                )
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null,
                    modifier = Modifier
                        .size(16.dp),
                    tint = Color.White.copy(
                        alpha = alphaAdvanced
                    ),
                )
            }

        }

    }
}