package com.example.couch

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

//interface Destination {
//    val icon: ImageVector
//    val route: String
//}
//
//object Training : Destination{
//    override val icon = Icons.Filled.Menu
//    override val route = "Training"
//}
//
//object Search : Destination{
//    override val icon = Icons.Filled.Search
//    override val route = "Search"
//}

//val coachTabRowScreens = listOf(Training, Search)

sealed class Screen(val route: String, @StringRes val resourceId: Int, @DrawableRes val icon: Int){
    object Training : Screen("Training", R.string.bottom_navigation_title_train, R.drawable.ic_baseline_home_24)
    object Search : Screen("Search", R.string.bottom_navigation_title_search, R.drawable.ic_baseline_search_24)
    object Report : Screen("Report", R.string.bottom_navigation_title_info, R.drawable.ic_baseline_equalizer_24)
}

val items = listOf(
    Screen.Training,
    Screen.Search,
    Screen.Report
)