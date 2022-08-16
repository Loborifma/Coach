package com.example.couch.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun WhiteActionBar(
    modifier: Modifier = Modifier,
    @StringRes title: Int,
    icon: ImageVector = Icons.Default.Add,
    @StringRes description: Int? = null,
    showIcon: Float,
    backgroundColor: Color = Color.White
){
    TopAppBar(
        title = {
            Row(modifier = modifier.padding(horizontal = 8.dp)) {
                Text(
                    text = stringResource(title),
                    modifier = Modifier.weight(1f)
                )
                Icon(
                    imageVector = icon,
                    tint = Color.Transparent.copy(
                        alpha = showIcon
                    ),
                    contentDescription = description?.let { stringResource(it) }
                )
            }
        },
        backgroundColor = backgroundColor
    )
}