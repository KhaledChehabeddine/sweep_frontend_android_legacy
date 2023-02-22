package com.example.sweep.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sweep.screens.*
import com.example.sweep.screens.history.HistoryScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Content(
    navController: NavHostController,
    paddingValues: PaddingValues = PaddingValues(),
    pagerState: PagerState = rememberPagerState()
) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable(route = "home") {
            HomeScreen(paddingValues = paddingValues)
        }
        composable(route = "search") {
            SearchScreen(paddingValues = paddingValues)
        }
        composable(route = "sweep") {
            SweepScreen(paddingValues = paddingValues)
        }
        composable(route = "history") {
            HistoryScreen(
                paddingValues = paddingValues,
                pagerState = pagerState
            )
        }
        composable(route = "account") {
            AccountScreen(paddingValues = paddingValues)
        }
    }
}