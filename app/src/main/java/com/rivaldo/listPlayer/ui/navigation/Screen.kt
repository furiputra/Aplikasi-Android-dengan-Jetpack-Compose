package com.rivaldo.listPlayer.ui.navigation

val HOME = "home"
val DETAIL = "detail"
val ABOUT = "about"
val ID_PLAYER = "id_player"
sealed class Screen(val route: String) {
    object Home: Screen(HOME)
    object Detail: Screen(DETAIL+"/{$ID_PLAYER}") {
        fun createRoute(id: Int) = DETAIL+"/$id"
    }

    object About: Screen(ABOUT)
}
