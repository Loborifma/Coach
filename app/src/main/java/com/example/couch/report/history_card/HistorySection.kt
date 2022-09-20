package com.example.couch.report.history_card

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.couch.R
import com.example.couch.ui.theme.DarkBlue

@Composable
fun HistorySection(
    @StringRes title: Int,
    @StringRes subtitle: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
){
    Column(modifier = modifier.padding(bottom = 16.dp, top = 12.dp)) {
        Row {
            Text(
                text = stringResource(title),
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.body1,
                fontSize = 21.sp,
                modifier = Modifier
                    .padding(bottom = 24.dp, start = 12.dp)
            )
            Text(
                text = stringResource(subtitle).uppercase(),
                fontSize = 21.sp,
                fontWeight = FontWeight.W300,
                color = DarkBlue,
                modifier = Modifier
                    .padding(start = 181.dp)
            )
        }
        content()
        Text(
            text = stringResource(R.string.report_subtitle_notes).uppercase(),
            fontSize = 18.sp,
            fontWeight = FontWeight.W300,
            color = DarkBlue,
            modifier = Modifier
                .padding(start = 140.dp, top = 12.dp)
        )
    }
}