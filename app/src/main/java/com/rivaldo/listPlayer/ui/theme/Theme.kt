package com.rivaldo.listPlayer.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = RedPrimary,
    primaryVariant = RedPrimaryLight,
    secondary = OrangeSecondary,
    background = RedPrimaryLight,
    surface = Color.Black,
)

private val LightColorPalette = lightColors(
    primary = RedPrimary,
    primaryVariant = RedPrimaryLight,
    secondary = OrangeSecondary,
    background = RedPrimaryLight,
    surface = WhitePrimaryDark,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun ListPlayerTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}