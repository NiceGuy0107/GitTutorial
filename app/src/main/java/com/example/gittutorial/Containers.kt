package com.example.gittutorial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun Containers() {
    Column {
        Box(modifier = Modifier.background(Color.Red).fillMaxWidth().weight(1f))
        Box(modifier = Modifier.background(Color.DarkGray).fillMaxWidth().weight(1f))
        Box(modifier = Modifier.background(Color.Blue).fillMaxWidth().weight(1f))
    }
}