package com.example.couch.training

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.couch.R
import com.example.couch.ui.theme.Grey50
import com.example.couch.ui.theme.White50

@Composable
fun MainInfoTraining(
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    colorSubtext: Color = White50,
    fontWeight: FontWeight? = null
){
    Row(
        modifier = modifier
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
}