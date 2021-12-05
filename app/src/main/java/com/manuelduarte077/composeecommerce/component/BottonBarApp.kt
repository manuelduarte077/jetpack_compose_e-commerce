package com.manuelduarte077.composeecommerce.component

import android.widget.RemoteViews
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manuelduarte077.composeecommerce.screen.Section

@Composable
fun BottonBarApp(
    items: List<Section>,
    currentSection: Section,
    onSectionSelected: (Section) -> Unit
) {
    BottomNavigation(
        modifier = Modifier.height(50.dp),
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.surface
    ) {
        items.forEach { section ->
            val selected = section == currentSection

            BottomNavigationItem(
                selected = selected,
                onClick = { onSectionSelected(section) },
                icon = {
                    Icon(
                        painter = painterResource(id = section.icon),
                        contentDescription = "Icono para el botton Navigation",
                        modifier = Modifier.size(24.dp)
                    )
                },
                selectedContentColor = MaterialTheme.colors.primary,
                unselectedContentColor = MaterialTheme.colors.onBackground
            )
        }
    }
}