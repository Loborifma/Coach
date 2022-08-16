package com.example.couch.search

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.couch.R
import com.example.couch.search.simple_card_grid.PairStringToIcon
import com.example.couch.search.simple_card_grid.SimpleCardGrid

@Composable
fun SimpleCardGridForBeginner(
    modifier: Modifier = Modifier
){
    SimpleCardGrid(
        modifier = modifier,
        items = data
    )
}

private val data = listOf(
    PairStringToIcon(
        text = R.string.only_4_exercise,
        icon = R.drawable.ic_baseline_filter_4_24,
        background = R.drawable.background_for_beginners
    ),
    PairStringToIcon(
        text = R.string.workout_for_leg_no_jump,
        icon = R.drawable.ic_baseline_airline_seat_legroom_reduced_24,
        background = R.drawable.background_for_beginners
    ),
    PairStringToIcon(
        text = R.string.workout_for_arms_no_push_ups,
        icon = R.drawable.ic_baseline_pool_24,
        background = R.drawable.background_for_beginners
    ),
    PairStringToIcon(
        text = R.string.workout_for_abs_no_twisting,
        icon = R.drawable.ic_baseline_fitness_center_24,
        background = R.drawable.background_for_beginners
    ),
    PairStringToIcon(
        text = R.string.wide_shoulders,
        icon = R.drawable.ic_baseline_code_24,
        background = R.drawable.background_for_beginners
    ),
)