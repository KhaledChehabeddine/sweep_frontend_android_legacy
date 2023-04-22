package com.example.sweep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.sweep.data.bottomNavbarItems
import com.example.sweep.navigation.BottomBar
import com.example.sweep.navigation.Content
import com.example.sweep.navigation.TopBar
import com.example.sweep.ui.theme.SweepTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      SweepTheme {
        Surface(
          color = MaterialTheme.colorScheme.primary,
          modifier = Modifier.fillMaxSize()
        ) {
          MainScreen()
        }
      }
    }
  }
}

// Scaffolds are used to easily create basic Material Design layouts, with a bottomBar, topBar and content section
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreen() {
  val navController = rememberNavController()
  val pagerState = rememberPagerState()
  val systemUiController = rememberSystemUiController()

  Scaffold(
    bottomBar = {
      BottomBar(
        items = bottomNavbarItems,
        navController = navController
      ) { bottomNavbarItem ->
        navController.navigate(route = bottomNavbarItem.route)
      }
    },
    topBar = {
      TopBar(
        navController = navController,
        pagerState = pagerState
      )
    }
  ) { paddingValues ->
    Content(
      navController = navController,
      paddingValues = paddingValues,
      pagerState = pagerState,
      systemUiController = systemUiController
    )
  }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
  SweepTheme {
    MainScreen()
  }
}
