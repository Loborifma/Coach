package com.example.couch.search.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.couch.R
import com.example.couch.components.Constants
import com.example.couch.components.WhiteActionBar
import com.example.couch.search.*
import com.example.couch.ui.theme.White
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun SearchScreen(
    modifier: Modifier = Modifier
){

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(White)

    Scaffold(
        topBar = {
            WhiteActionBar(
                title = R.string.top_app_bar_search_title,
                icon = Icons.Default.Refresh,
                description = R.string.top_app_bar_search_icon,
                showIcon = Constants.ALPHA_TRUE,
                backgroundColor = White
            )
        }
    ) {
        Column(
            modifier = modifier
                .padding(it)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(top = 16.dp, bottom = 75.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            RecommendationTraining(
                scale = 0.5F,
                height = 205,
                drawable = R.drawable.tabata,
                text = R.string.tabata,
                subtext = R.string.tabata_subtext
            )
            HomeSectionSearch(title = R.string.best_for_you) {
                BestForYouGrid()
            }
            RecommendationTraining(
                scale = 0.8F,
                height = 180,
                drawable = R.drawable.after_workout,
                text = R.string.workout_for_today_text,
                subtext = R.string.workout_for_today_subtext
            )
            HomeSectionSearch(title = R.string.workout_for_beginners) {
                SimpleCardGridForBeginner()
            }
            HomeSectionSearch(title = R.string.quick_workout) {
                QuickWorkout()
            }
            HomeSectionSearch(title = R.string.placeholder_for_program) {
                SimpleCardProgram()
            }
            HomeSectionSearch(title = R.string.workout_with_tools) {
                WorkoutWithTools()
            }
            HomeSectionSearch(title = R.string.sleep) {
                BeforeSleepWorkout()
            }
            HomeSectionSearch(title = R.string.additional_work) {
                AdditionalWork()
            }
        }
    }
}