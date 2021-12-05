package com.manuelduarte077.composeecommerce.fragment

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.manuelduarte077.composeecommerce.R
import com.manuelduarte077.composeecommerce.component.TextPadding

@Composable
fun CompaniesFragment(
    navController: NavController
) {
    LazyColumn {
        item {
            Text(text = "Ahora, Bilwi Puerto Cabezas #1234")
            TextPadding(valuePadding = 10)
            Slides()
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Slides() {
    val images = listOf(
        R.drawable.alitas,
        R.drawable.chillis,
        R.drawable.chinas,
        R.drawable.mariscos,
        R.drawable.burgerking
    )

    val pagerState = rememberPagerState()

    HorizontalPager(
        state = pagerState,
        count = images.size,
        modifier = Modifier.height(150.dp)
    ) {
        page ->
        Image(
            painter = painterResource(id = images[page]), contentDescription = "",
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
    }
}