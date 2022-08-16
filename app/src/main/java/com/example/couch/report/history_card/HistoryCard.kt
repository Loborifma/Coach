package com.example.couch.report.history_card

import androidx.annotation.StringRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.couch.ui.theme.Grey50
import java.time.DayOfWeek

@Composable
fun HistoryCard(
    modifier: Modifier = Modifier,
    @StringRes dayOfWeek: Int,
    numberOfDay: String,
    strokeOfCircle: Float = 5f
){
    Column(
        modifier = modifier
            .width(48.dp)
            .heightIn(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(dayOfWeek),
            color = Grey50,
            modifier = Modifier
                .padding(bottom = 24.dp)
        )
        Canvas(modifier = Modifier){
            drawCircle(
                color = Grey50,
                radius = 30f,
                center = Offset(x = size.width / 2, y = size.height / 2),
                style = Stroke(strokeOfCircle)
            )
        }
        Text(
            text = numberOfDay,
            fontWeight = FontWeight.W400,
            modifier = Modifier
                .padding(top = 18.dp)
        )
    }
}