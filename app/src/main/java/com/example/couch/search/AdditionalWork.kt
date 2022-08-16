package com.example.couch.search

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.couch.R
import com.example.couch.search.simple_card_grid.SimpleCard
import com.example.couch.ui.theme.MyShapes

@Composable
fun AdditionalWork(
    modifier: Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .padding(bottom = 8.dp)
        ) {
            Surface(
                shape = MyShapes.medium,
                modifier = Modifier
                    .padding(end = 8.dp)
            ) {
                SimpleCard(
                    text = R.string.additional_work_chest,
                    icon = R.drawable.ic_baseline_pool_24,
                    background = R.drawable.additional_work_background,
                    textHeight = Modifier,
                    modifier = modifier
                        .height(120.dp)
                        .width(160.dp)
                )
            }
            Surface(
                shape = MyShapes.medium
            ) {
                SimpleCard(
                    text = R.string.additional_work_arms_shoulders,
                    icon = R.drawable.ic_baseline_fitness_center_24,
                    textHeight = Modifier,
                    background = R.drawable.additional_work_background,
                    modifier = modifier
                        .height(120.dp)
                        .width(160.dp)
                )
            }
        }
        Row{
            Surface(
                shape = MyShapes.medium,
                modifier = Modifier
                    .padding(end = 8.dp)
            ) {
                SimpleCard(
                    text = R.string.additional_work_butt_and_legs,
                    icon = R.drawable.ic_baseline_airline_seat_legroom_reduced_24,
                    textHeight = Modifier,
                    background = R.drawable.additional_work_background,
                    modifier = modifier
                        .height(120.dp)
                        .width(160.dp)
                )
            }
            Surface(
                shape = MyShapes.medium
            ) {
                SimpleCard(
                    text = R.string.additional_works_abs,
                    icon = R.drawable.ic_baseline_pool_24,
                    textHeight = Modifier,
                    background = R.drawable.additional_work_background,
                    modifier = modifier
                        .height(120.dp)
                        .width(160.dp)
                )
            }
        }
    }
}