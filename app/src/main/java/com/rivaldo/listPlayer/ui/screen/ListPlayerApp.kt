package com.rivaldo.listPlayer.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.rivaldo.listPlayer.listPlayer
import com.rivaldo.listPlayer.ui.navigation.ID_PLAYER
import com.rivaldo.listPlayer.ui.navigation.Screen
import com.rivaldo.listPlayer.ui.screen.about.AboutScreen
import com.rivaldo.listPlayer.ui.screen.detail.DetailScreen
import com.rivaldo.listPlayer.ui.screen.home.HomeScreen

@Composable
fun ListPlayerApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = Modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen(listPlayerItem = listPlayer, navigateToDetail = {
                navController.navigate(Screen.Detail.createRoute(it))
            }, navigateToAboutMe = {
                navController.navigate(Screen.About.route)
            })
        }
        composable(
            route = Screen.About.route
        ) {
            AboutScreen {
                navController.navigateUp()
            }
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument(ID_PLAYER) {type = NavType.IntType}),
        ) {
            val id = it.arguments?.getInt(ID_PLAYER) ?: -1
            DetailScreen(
                id = id,
                navigateBack = {
                    navController.navigateUp()
                }
            )

        }

    }

}

