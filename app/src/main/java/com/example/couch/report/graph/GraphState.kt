package com.example.couch.report.graph

import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

class GraphState {
    private val listOfPoints = listOf(
        Point(weight = 75f, time = 14, high = 75f, low = 70f),
        Point(weight = 80f, time = 19, high = 80f, low = 75f),
        Point(weight = 73f, time = 21, high = 80f, low = 73f),
        Point(weight = 70f, time = 24, high = 80f, low = 70f),
        Point(weight = 75f, time = 26, high = 80f, low = 70f),
    )

    private var visiblePointsCount by mutableStateOf(10)

    private var viewWidth = 0f
    private var viewHeight = 0f

    private val maxWeight by derivedStateOf { visiblePoints.maxOfOrNull { it.high } ?: 0f }
    private val minWeight by derivedStateOf { visiblePoints.maxOfOrNull { it.low } ?: 0f }

    val visiblePoints by derivedStateOf {
        if (listOfPoints.isNotEmpty()){
            listOfPoints.subList(
                0,
                visiblePointsCount
            )
        }else{
            emptyList()
        }
    }

    fun setViewSize(width: Float, height: Float){
        viewWidth = width
        viewHeight = height
    }

    fun xOffset(point: Point){
        viewWidth * visiblePoints.indexOf(point).toFloat() / visiblePointsCount.toFloat()
    }

    fun yOffset(value: Float){
        viewHeight * (maxWeight - value) / (maxWeight - minWeight)
    }
}