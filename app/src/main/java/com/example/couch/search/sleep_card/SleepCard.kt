package com.example.couch.search.sleep_card

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.couch.ui.theme.MyShapes

@Composable
fun SleepCard(
    modifier: Modifier = Modifier,
    @DrawableRes drawable: Int,
    @StringRes title: Int
){
    Surface(
        modifier = modifier
            .width(160.dp)
    ) {
        Column {
            Surface(
                shape = MyShapes.medium,
                elevation = 3.dp,
                modifier = Modifier
                    .weight(2f)
            ) {
                Image(
                    painter = painterResource(drawable),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )
            }
            Text(
                text = stringResource(title),
                fontWeight = FontWeight.W500,
                fontSize = 17.sp,
                modifier = Modifier
                    .weight(1f)
            )
        }
    }
}