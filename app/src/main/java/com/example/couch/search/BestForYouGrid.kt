package com.example.couch.search

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.couch.R
import com.example.couch.search.workout_grid.DrawableStringPair
import com.example.couch.search.workout_grid.WorkoutGrid

@Composable
fun BestForYouGrid(
    modifier: Modifier = Modifier
){
    WorkoutGrid(
        items = data,
        modifier = modifier)
}

private val data = listOf(
    DrawableStringPair(R.drawable.all_body, R.string.wiit_for_belly, R.string.beginner, "14"),
    DrawableStringPair(R.drawable.begginer_abs, R.string.fat_burning_no_jumps, R.string.continued, "15"),
    DrawableStringPair(R.drawable.ab1_inversions, R.string.wiit_for_chest, R.string.advanced, "13"),
    DrawableStringPair(R.drawable.lower_body_part, R.string.wiit_for_abs, R.string.continued, "16")
)