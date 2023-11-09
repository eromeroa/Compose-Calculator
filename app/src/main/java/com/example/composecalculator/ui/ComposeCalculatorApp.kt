package com.example.composecalculator.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composecalculator.ui.components.SimpleKeypad
import com.example.composecalculator.ui.theme.ComposeCalculatorTheme

@Composable
fun ComposeCalculatorApp() {
    SimpleKeypad()
}

@Composable
@Preview
fun ComposeCalculatorAppPreview() {
    ComposeCalculatorTheme {
        ComposeCalculatorApp()
    }
}