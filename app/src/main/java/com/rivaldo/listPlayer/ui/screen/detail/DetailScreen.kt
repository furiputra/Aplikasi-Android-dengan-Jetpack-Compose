package com.rivaldo.listPlayer.ui.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rivaldo.listPlayer.PlayerItem
import com.rivaldo.listPlayer.listPlayer
import com.rivaldo.listPlayer.ui.theme.ListPlayerTheme
import com.rivaldo.listPlayer.ui.theme.detailSubtitle
import com.rivaldo.listPlayer.ui.theme.detailTitle

@Composable
fun DetailScreen(
    id: Int,
    navigateBack: () -> Unit
) {
    val androidItem = remember {
        listPlayer.find { it.id == id } as PlayerItem
    }
    val scrollState = rememberScrollState()
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "Detail Screen")
        },
        navigationIcon = {
            IconButton(onClick = { navigateBack() }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
            }
        })
    }) { paddingValue ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValue)
            .verticalScroll(scrollState), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                modifier = Modifier
                    .width(250.dp)
                    .height(250.dp)
                    .padding(16.dp),
                painter = painterResource(id = androidItem.image),
                contentDescription = null
            )
            Text(text = androidItem.name, modifier = Modifier.padding(16.dp), style = detailTitle)
            Text(text = androidItem.Number, modifier = Modifier.padding(16.dp), style = detailSubtitle)
            Divider(modifier = Modifier.padding(8.dp))
            Text(text = androidItem.description, modifier = Modifier.padding(16.dp), style = detailSubtitle)
        }

    }

}

@Preview
@Composable
fun PreviewDetailScreen() {
    ListPlayerTheme() {
        DetailScreen(id = 1, navigateBack = {})
    }

}