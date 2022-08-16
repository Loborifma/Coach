package com.example.couch.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.couch.R
import com.example.couch.items
import com.example.couch.ui.theme.Blue
import com.example.couch.ui.theme.White50

@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    navController: NavController
){
    BottomNavigation(
        modifier = modifier,
        backgroundColor = MaterialTheme.colors.background
    ){
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        items.forEach{
            BottomNavigationItem(
                icon = { Icon(imageVector = it.icon, contentDescription = null) },
                label = { Text(text = stringResource(it.resourceId))},
                selected = currentDestination?.hierarchy?.any {curDes -> curDes.route == it.route } == true,
                onClick = {
                    navController.navigate(it.route){
                        popUpTo(navController.graph.findStartDestination().id){
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}