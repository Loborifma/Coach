package com.example.couch.report

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.couch.components.Constants
import com.example.couch.ui.theme.DarkBlue

@Composable
fun HomeSectionReport(
    @StringRes title: Int,
    @StringRes subtitle: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
){
    Column(
        modifier = modifier
            .width(Constants.CARD_WIDTH.dp)
            .padding(bottom = 16.dp, top = 8.dp)
    ) {
        Row {
            Text(
                text = stringResource(title),
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.body1,
                fontSize = 21.sp,
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .weight(1f)
            )
            Text(
                text = stringResource(subtitle).uppercase(),
                fontSize = 21.sp,
                fontWeight = FontWeight.W300,
                textAlign = TextAlign.End,
                color = DarkBlue,
                modifier = Modifier
                    .weight(1f)
            )
        }
        content()
    }
}