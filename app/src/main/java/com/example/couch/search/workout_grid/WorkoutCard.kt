package com.example.couch.search.workout_grid

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.couch.R
import com.example.couch.ui.theme.Grey50
import com.example.couch.ui.theme.White50

@Composable
fun WorkoutCard(
    modifier: Modifier = Modifier,
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    @StringRes level: Int,
    time: String
){

    val divider = "  •  "
    val anString = buildAnnotatedString {
        append(time)
        append(" ")
        append(stringResource(R.string.min))
        append(divider)
        append(stringResource(level))
    }

    Surface(
        modifier = modifier.width(320.dp),
        shape = MaterialTheme.shapes.small,
        elevation = 1.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Surface(
                shape = MaterialTheme.shapes.small,
                modifier = Modifier
                    .padding(end = 16.dp)
            ) {
                Image(
                    painter = painterResource(drawable),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(100.dp)
                        .height(140.dp)
                )
            }
            Column {
                Text(
                    text = stringResource(text),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = anString,
                    textAlign = TextAlign.Start,
                    color = Grey50,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}