package com.example.couch.report.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.couch.R
import com.example.couch.components.Constants
import com.example.couch.components.WhiteActionBar
import com.example.couch.report.HomeSectionReport
import com.example.couch.report.MainInfoReport
import com.example.couch.report.history_card.HistoryRow
import com.example.couch.report.history_card.HistorySection
import com.example.couch.training.MainInfoTraining
import com.example.couch.ui.theme.DarkBlue
import com.example.couch.ui.theme.Grey50

@Composable
fun ReportScreen(modifier: Modifier = Modifier){
    Scaffold(
        topBar = {
            WhiteActionBar(
                title = R.string.bottom_navigation_title_info,
                showIcon = Constants.ALPHA_FALSE
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
            MainInfoReport(
                color = DarkBlue,
                colorSubtext = Grey50,
                fontWeight = FontWeight.Bold
            )
            HistorySection(
                title = R.string.report_title_history,
                subtitle = R.string.report_subtitle_more
            ) {
                HistoryRow()
            }
            HomeSectionReport(
                title = R.string.report_title_weight,
                subtitle = R.string.report_subtitle_add
            ) {

            }
        }
    }
}