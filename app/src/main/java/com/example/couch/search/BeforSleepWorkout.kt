package com.example.couch.search

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.couch.R
import com.example.couch.search.sleep_card.PairForSleepCard
import com.example.couch.search.sleep_card.SleepCardGrid

@Composable
fun BeforeSleepWorkout(
    modifier: Modifier = Modifier
){
    SleepCardGrid(
        modifier = modifier,
        items = data
    )
}

private val data = listOf(
    PairForSleepCard(
        drawable = R.drawable.stretch_all_body,
        title = R.string.stretch_all_body
    ),
    PairForSleepCard(
        drawable = R.drawable.relax_for_shoulders,
        title = R.string.relax_for_shoulders
    ),
    PairForSleepCard(
        drawable = R.drawable.morning_stretch,
        title = R.string.morning_stretch
    ),
    PairForSleepCard(
        drawable = R.drawable.stretch_before_sleep,
        title = R.string.stretch_before_sleep
    ),
    PairForSleepCard(
        drawable = R.drawable.stretch_for_neck_and_shoulders,
        title = R.string.stretch_for_neck_and_shoulders
    ),
    PairForSleepCard(
        drawable = R.drawable.stretch_to_remove_pain_in_kneel,
        title = R.string.stretch_to_remove_pain_in_kneel
    ),
    PairForSleepCard(
        drawable = R.drawable.stretching_for_upper_body_part,
        title = R.string.stretching_for_upper_body_part
    ),
    PairForSleepCard(
        drawable = R.drawable.stretch_for_lower_part_body,
        title = R.string.stretch_for_lower_part_body
    )
)