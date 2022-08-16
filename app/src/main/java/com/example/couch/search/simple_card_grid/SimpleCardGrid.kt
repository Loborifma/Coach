package com.example.couch.search.simple_card_grid

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleCardGrid(
    modifier: Modifier = Modifier,
    items: List<PairStringToIcon>
){
    LazyRow(
        contentPadding = PaddingValues(horizontal = 34.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
            .height(180.dp)
    ){
        items(items){
            SimpleCard(
                text = it.text,
                icon = it.icon,
                background = it.background
            )
        }
    }
}

data class PairStringToIcon(
    @StringRes val text: Int,
    @DrawableRes val icon: Int,
    @DrawableRes val background: Int
)