package com.example.couch.training.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.couch.R
import com.example.couch.components.Constants
import com.example.couch.training.*
import com.example.couch.ui.theme.Blue
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun TrainingScreen(
    modifier: Modifier = Modifier,
    onNavigateToSearch: () -> Unit
){

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(Blue)

    Scaffold(
        topBar = {
            BlueActionBar(
                title = R.string.top_app_bar_training_title,
                icon = Icons.Default.ShoppingCart,
                description = R.string.top_app_bar_training_icon
            )
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(it)
                .height(210.dp),
            color = Blue
        ) {}
        Column(
            modifier = modifier
                .verticalScroll(rememberScrollState())
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 75.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainInfoTraining()
            TargetForWeek()
            HomeSectionTraining(title = R.string.program_7x4) {
                TrainingCard(
                    title = R.string.all_body_program_7x4,
                    drawable = R.drawable.all_body,
                    subtitle = R.string.program_7x4
                )
                TrainingCard(
                    title = R.string.lower_body_program_7x4,
                    drawable = R.drawable.lower_body_part,
                    subtitle = R.string.program_7x4
                )
            }
            HomeSectionTraining(title = R.string.beginner) {
                TrainingCard(
                    title = R.string.beginner_abs,
                    drawable = R.drawable.begginer_abs,
                    alphaBeginner = Constants.ALPHA_TRUE
                )
                TrainingCard(
                    title = R.string.beginner_chest,
                    drawable = R.drawable.begginer_chest,
                    alphaBeginner = Constants.ALPHA_TRUE
                )
                TrainingCard(
                    title = R.string.beginner_shoulders,
                    drawable = R.drawable.begginer_shoulders,
                    alphaBeginner = Constants.ALPHA_TRUE
                )
            }
            HomeSectionTraining(title = R.string.continued) {
                TrainingCard(
                    title = R.string.continued_abs,
                    drawable = R.drawable.begginer_abs,
                    alphaBeginner = Constants.ALPHA_TRUE,
                    alphaContinued = Constants.ALPHA_TRUE
                )
                TrainingCard(
                    title = R.string.continued_chest,
                    drawable = R.drawable.begginer_chest,
                    alphaBeginner = Constants.ALPHA_TRUE,
                    alphaContinued = Constants.ALPHA_TRUE
                )
                TrainingCard(
                    title = R.string.continued_shoulders,
                    drawable = R.drawable.begginer_shoulders,
                    alphaBeginner = Constants.ALPHA_TRUE,
                    alphaContinued = Constants.ALPHA_TRUE
                )
            }
            HomeSectionTraining(title = R.string.advanced) {
                TrainingCard(
                    title = R.string.advanced_abs,
                    drawable = R.drawable.begginer_abs,
                    alphaBeginner = Constants.ALPHA_TRUE,
                    alphaContinued = Constants.ALPHA_TRUE,
                    alphaAdvanced = Constants.ALPHA_TRUE
                )
                TrainingCard(
                    title = R.string.advanced_chest,
                    drawable = R.drawable.begginer_chest,
                    alphaBeginner = Constants.ALPHA_TRUE,
                    alphaContinued = Constants.ALPHA_TRUE,
                    alphaAdvanced = Constants.ALPHA_TRUE
                )
                TrainingCard(
                    title = R.string.advanced_shoulders,
                    drawable = R.drawable.begginer_shoulders,
                    alphaBeginner = Constants.ALPHA_TRUE,
                    alphaContinued = Constants.ALPHA_TRUE,
                    alphaAdvanced = Constants.ALPHA_TRUE
                )
                SearchCard(onNavigate = onNavigateToSearch)
            }
        }
    }
}
