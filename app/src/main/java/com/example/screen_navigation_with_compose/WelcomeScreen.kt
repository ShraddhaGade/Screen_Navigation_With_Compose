package com.example.screen_navigation_with_compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import kotlinx.coroutines.delay

@Composable
fun WelcomeScreen(onTimeout: () -> Unit) {
    LaunchedEffect(key1 = true) {
        delay(2000L) // Delay for 5000 milliseconds (5 seconds)
        onTimeout() // Call the lambda to navigate
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Welcome", textAlign = TextAlign.Center)
    }

}