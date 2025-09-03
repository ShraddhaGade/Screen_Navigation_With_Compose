package com.example.screen_navigation_with_compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(onLoginSuccess: (String) -> Unit) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp,
            Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var name by rememberSaveable { mutableStateOf("") }

        TextField(value = name,
            onValueChange = { name = it })

        Button(onClick ={ onLoginSuccess(name)}) {
            Text("Go To Home Screen")
        }

    }
}