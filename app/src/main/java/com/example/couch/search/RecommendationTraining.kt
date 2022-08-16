package com.example.couch.search

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.couch.R
import com.example.couch.components.Constants
import com.example.couch.ui.theme.Grey50

@Composable
fun RecommendationTraining(
    modifier: Modifier = Modifier,
    scale: Float,
    height: Int,
    topPadding: Int = 0,
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    @StringRes subtext: Int
) {
    val matrix = ColorMatrix()
    matrix.setToScale(
        redScale = scale,
        blueScale = scale,
        greenScale = scale,
        alphaScale = 1F
    )

    Surface(
        elevation = 1.dp,
        modifier = modifier
            .width(Constants.CARD_WIDTH.dp)
            .height(height.dp)
            .padding(bottom = Constants.PADDING_BETWEEN_SEARCH_ELEMENTS.dp)
            .padding(top = topPadding.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.colorMatrix(matrix)
        )
        Column(
            modifier = Modifier
                .padding(start = 14.dp, bottom = 24.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = stringResource(text),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = stringResource(subtext),
                color = Color.White
            )
        }
    }
}