package team.study.presentation.ui.navermovie.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EventNote
import androidx.compose.material.icons.filled.FormatPaint
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import team.study.presentation.R

sealed class NaverMovieDestination(
    val title: Int,
    val icon: ImageVector,
    val route: String,
) {
    object LogDestination :
        NaverMovieDestination(
            R.string.log,
            Icons.Filled.EventNote,
            Routes.LogRoute.route,
        )

    object SearchDestination :
        NaverMovieDestination(
            R.string.search,
            Icons.Filled.Search,
            Routes.SearchRoute.route,
        )

    object ThemeDestination :
        NaverMovieDestination(
            R.string.theme,
            Icons.Filled.FormatPaint,
            Routes.ThemeRoute.route,
        )
}

sealed class Routes(val route: String) {
    object LogRoute : Routes("log")
    object SearchRoute : Routes("search")
    object ThemeRoute : Routes("theme")
}

val naverMovieScreens = listOf(
    NaverMovieDestination.LogDestination,
    NaverMovieDestination.SearchDestination,
    NaverMovieDestination.ThemeDestination,
)
