package com.example.screen_navigation_with_compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun LoginScreen(onLoginSuccess: (String) -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        var name by rememberSaveable { mutableStateOf("") }


        TextField(value = name,
            onValueChange = { name = it },
            modifier = Modifier.align(Alignment.TopCenter))

        Button(onClick ={ onLoginSuccess(name)}) {
            Text("Go To Home Screen")
        }

    }
}