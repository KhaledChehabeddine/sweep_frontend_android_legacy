
package com.example.sweep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.sweep.screens.*
import com.example.sweep.ui.theme.SweepTheme
import com.example.sweep.data.bottomNavbarItems
import com.example.sweep.utilities.navigation.Navigation
import com.example.sweep.utilities.TopBar
import com.example.sweep.utilities.navigation.BottomNavigationBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SweepTheme {
                Surface(
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.fillMaxSize(),
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                items = bottomNavbarItems,
                navController = navController
            ) {
                navController.navigate(it.route)
            }
        },
//        containerColor = MaterialTheme.colorScheme.background,
        topBar = {
            TopBar()
        },
        content = { paddingValues ->
            Navigation(
                paddingValues = paddingValues,
                navController = navController
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    SweepTheme {
        MainScreen()
    }
}