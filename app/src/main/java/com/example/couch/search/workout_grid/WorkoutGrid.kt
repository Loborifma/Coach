package com.example.couch.search.workout_grid

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WorkoutGrid(
    modifier: Modifier = Modifier,
    items: List<DrawableStringPair>
){
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 34.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
            .height(180.dp)
    ){
        items(items){
            WorkoutCard(
                drawable = it.drawable,
                text = it.text,
                level = it.level,
                time = it.time
            )
        }
    }
}

data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int,
    @StringRes val level: Int,
    val time: String
)