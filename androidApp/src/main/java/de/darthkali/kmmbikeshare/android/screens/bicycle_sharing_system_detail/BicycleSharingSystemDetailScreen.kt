package de.darthkali.kmmbikeshare.android.screens.bicycle_sharing_system_detail

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import de.darthkali.kmmbikeshare.presentation.recipe_list.BicycleSharingSystemDetailState
import de.darthkali.kmmbikeshare.android.navigation.TopBar
import de.darthkali.kmmbikeshare.android.theme.AppTheme
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@ExperimentalMaterialApi
@ExperimentalComposeUiApi
@ExperimentalFoundationApi
@Composable
fun BicycleSharingSystemDetailScreen(
    bicycleSharingSystemDetailState: BicycleSharingSystemDetailState,
    onClickBack: (String) -> Unit,
) {

    AppTheme(
//        displayProgressBar = bicycleSharingSystemDetailState.isLoading,
    ) {
        Scaffold(
            topBar = {
                TopBar(
                    title = bicycleSharingSystemDetailState.brand ?: "",
                    navigationIcon = Icons.Filled.ArrowBack,
                    navigationIconClickAction = {
                        onClickBack(bicycleSharingSystemDetailState.country!!)
                    },
                )
            },
        ) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {

                Column {
                    Row() {
                        Text(text = "brand: ")
                        Text(text = bicycleSharingSystemDetailState.brand ?: "")
                    }
                    Row() {
                        Text(text = "city: ")
                        Text(text = bicycleSharingSystemDetailState.city ?: "")
                    }
                    Row() {
                        Text(text = "country: ")
                        Text(text = bicycleSharingSystemDetailState.country ?: "")
                    }
                    Row() {
                        Text(text = "site: ")
                        Text(text = bicycleSharingSystemDetailState.site ?: "")
                    }
                    Row() {
                        Text(text = "electric: ")
                        Text(text = bicycleSharingSystemDetailState.electric ?: "")
                    }
                    Row() {
                        Text(text = "currently_active: ")
                        Text(text = bicycleSharingSystemDetailState.currently_active ?: "")
                    }

                }
            }
        }
    }
}


