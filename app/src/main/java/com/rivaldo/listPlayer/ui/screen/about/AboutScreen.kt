package com.rivaldo.listPlayer.ui.screen.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rivaldo.listPlayer.ui.theme.ListPlayerTheme
import com.rivaldo.listPlayer.ui.theme.detailSubtitle
import com.rivaldo.listPlayer.ui.theme.detailTitle
import com.rivaldo.listandroid.R

@Composable
fun AboutScreen(navigateBack: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = "About Me")
            },
                navigationIcon = {
                    IconButton(onClick = { navigateBack() }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    }
                })
        },
        backgroundColor = MaterialTheme.colors.primary
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingValues), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .padding(8.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.furi),
                contentDescription = "Furi",
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Furi Ananda Satria Putra",
                style = detailTitle,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "furisatria068@gmail.com",
                style = detailSubtitle,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "Instagram :@furiputra_",
                style = detailSubtitle,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewAboutScreen() {
    ListPlayerTheme() {
        AboutScreen(navigateBack = {})
    }

}