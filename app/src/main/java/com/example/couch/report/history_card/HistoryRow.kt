package com.example.couch.report.history_card

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.couch.R
import java.time.DayOfWeek

@Composable
fun HistoryRow(
    modifier: Modifier = Modifier
){
    Row(
//        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        data.forEach{
            HistoryCard(
                dayOfWeek = it.dayOfWeek,
                numberOfDay = it.numberOfDay,
                strokeOfCircle = it.strokeOfCircle
            )
        }
    }
}

val data = listOf(
    PairHistoryRow(R.string.sunday, "18", 20f),
    PairHistoryRow(R.string.monday, "12", 20f),
    PairHistoryRow(R.string.tuesday, "13", 20f),
    PairHistoryRow(R.string.wednesday, "14", 5f),
    PairHistoryRow(R.string.thursday, "15", 5f),
    PairHistoryRow(R.string.friday, "16", 5f),
    PairHistoryRow(R.string.saturday, "17", 5f),
)

data class PairHistoryRow(
    @StringRes val dayOfWeek: Int,
    val numberOfDay: String,
    val strokeOfCircle: Float
)