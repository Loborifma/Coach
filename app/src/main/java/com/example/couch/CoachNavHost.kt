package com.example.couch

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.couch.report.screen.ReportScreen
import com.example.couch.search.screen.SearchScreen
import com.example.couch.training.screen.TrainingScreen

@Composable
fun CoachNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(
        navController = navController,
        startDestination = Screen.Training.route,
        modifier = modifier
    ){
        composable(route = Screen.Training.route){
            TrainingScreen(
                onNavigateToSearch = { navController.navigate(Screen.Search.route) }
            )
        }
        composable(route = Screen.Search.route){
            SearchScreen()
        }
        composable(route = Screen.Report.route){
            ReportScreen()
        }
    }
}