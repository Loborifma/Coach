package com.example.couch.report

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeSectionReport(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
){
    Column(modifier = modifier.padding(bottom = 16.dp, top = 8.dp)) {
        Text(
            text = stringResource(title),
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.body1,
            fontSize = 21.sp,
            modifier = Modifier
                .padding(bottom = 8.dp, start = 34.dp)
        )
        content()
    }
}