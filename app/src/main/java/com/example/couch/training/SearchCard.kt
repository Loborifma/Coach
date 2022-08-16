package com.example.couch.training

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.couch.R
import com.example.couch.ui.theme.Grey
import com.example.couch.ui.theme.Grey50
import com.example.couch.ui.theme.White
import com.example.couch.ui.theme.White50

@Composable
fun SearchCard(
    modifier: Modifier = Modifier,
    onNavigate: () -> Unit
){
    val matrix = ColorMatrix()
    matrix.setToScale(
        redScale = 0.85F,
        blueScale = 1.5F,
        greenScale = 0.85F,
        alphaScale = 0.75F
    )

    Surface(
        modifier = modifier
            .width(325.dp)
            .height(85.dp)
            .padding(bottom = 8.dp),
        shape = MaterialTheme.shapes.medium
    ){
        Image(
            painter = painterResource(R.drawable.search_card),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.colorMatrix(matrix)
        )
        Column(
            modifier = Modifier
                    .padding(start = 14.dp, top = 14.dp)
        ) {
            Text(
                text = stringResource(R.string.bottom_navigation_title_search).uppercase(),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Row {
               Text(
                   text = stringResource(R.string.other_training),
                   modifier = Modifier.weight(1f),
                   color = White50
               )
               Button(
                   shape = MaterialTheme.shapes.large,
                   modifier = Modifier
                       .height(35.dp)
                       .width(95.dp)
                       .weight(0.5f, false),
                   colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                   onClick = onNavigate
               ) {
                    Text(
                        text = stringResource(R.string.go_over).uppercase(),
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Grey
                    )
               }
            }
        }
    }
}

