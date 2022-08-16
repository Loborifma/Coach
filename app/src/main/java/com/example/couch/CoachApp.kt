package com.example.couch

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.couch.components.NavigationBar
import com.example.couch.report.screen.ReportScreen
import com.example.couch.training.screen.TrainingScreen
import com.example.couch.ui.theme.CouchTheme

@Composable
fun CoachApp(modifier: Modifier = Modifier){
    CouchTheme {
        val navController = rememberNavController()
        Scaffold(
            bottomBar = {
                NavigationBar(
                    navController = navController,
                    modifier = modifier
                )
            }
        ) {
            CoachNavHost(
                navController = navController,
                modifier = Modifier.padding(it)
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreen(){
    ReportScreen()
//    TrainingScreen(onNavigateToSearch = {})
//    SearchScreen()
}