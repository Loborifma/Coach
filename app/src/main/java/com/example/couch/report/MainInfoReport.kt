package com.example.couch.report

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.couch.R
import com.example.couch.ui.theme.Grey50
import com.example.couch.ui.theme.White50

@Composable
fun MainInfoReport(
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    colorSubtext: Color = White50,
    fontWeight: FontWeight? = null
){
    Column {
        Row(
            modifier = modifier,
        ) {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "0",
                    style = MaterialTheme.typography.h5,
                    color = color,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.training_main_info_train),
                    style = MaterialTheme.typography.body2,
                    fontSize = 12.sp,
                    color = colorSubtext,
                    fontWeight = fontWeight
                )
            }

            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "0",
                    style = MaterialTheme.typography.h5,
                    color = color,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.training_main_info_kkal),
                    style = MaterialTheme.typography.body2,
                    fontSize = 12.sp,
                    color = colorSubtext,
                    fontWeight = fontWeight
                )
            }

            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "0",
                    style = MaterialTheme.typography.h5,
                    color = color,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.training_main_info_minutes),
                    style = MaterialTheme.typography.body2,
                    fontSize = 12.sp,
                    color = colorSubtext,
                    fontWeight = fontWeight
                )
            }
        }
        Canvas(
            modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxSize()
        ){
            drawLine(
                start = Offset(x = 0f, y = 0f),
                end = Offset(x = size.width, y = 0f),
                color = Grey50,
                strokeWidth = 1f
            )
        }
    }
}