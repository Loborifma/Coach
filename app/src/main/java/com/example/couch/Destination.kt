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

sealed class Screen(val route: String, @StringRes val resourceId: Int, val icon: ImageVector){
    object Training : Screen("Training", R.string.bottom_navigation_title_train, Icons.Default.Home)
    object Search : Screen("Search", R.string.bottom_navigation_title_search, Icons.Default.Search)
}

val items = listOf(
    Screen.Training,
    Screen.Search
)