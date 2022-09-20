package com.example.couch.report.graph

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Graph(
    modifier: Modifier = Modifier,
    points: List<Point>
){

//    val state = rememberSaveable( saver = GraphState.Sa ) {
//
//    }

    Canvas(
        modifier = modifier
            .fillMaxSize(),
        onDraw = {
            val graphWidth = size.width - 128.dp.value
            val graphHeight = size.height - 64.dp.value


        }
    )
}