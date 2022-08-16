package com.example.couch.training

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.couch.R
import com.example.couch.ui.theme.Grey50

@Composable
fun TargetForWeek(
    modifier: Modifier = Modifier
){
    Surface(
        shape = MaterialTheme.shapes.small,
        color = MaterialTheme.colors.background,
        elevation = 16.dp,
        modifier = modifier
            .width(325.dp)
            .height(210.dp)
            .padding(vertical = 24.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                text = stringResource(R.string.target_for_week_title),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 16.dp, bottom = 16.dp, end = 150.dp)
            )
            Text(
                text = stringResource(R.string.target_for_week_description),
                color = Grey50,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .padding(horizontal = 24.dp)
            )
            Button(
                onClick = {},
                shape = MaterialTheme.shapes.large,
                modifier = Modifier
                    .width(200.dp)
            ) {
                Text(text = stringResource(R.string.target_for_week_button_text))
            }
        }
    }
}