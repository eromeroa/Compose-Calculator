package com.example.composecalculator.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.composecalculator.ui.theme.ComposeCalculatorTheme
import com.example.composecalculator.utils.determineButtonColor

@Composable
fun CalcButton(
    buttonSymbol: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val buttonColors = determineButtonColor(symbol = buttonSymbol)
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColors.first,
            contentColor = buttonColors.second
        )
    ) {
        Text(
            text = buttonSymbol,
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CalcButtonPreviewLight() {
    ComposeCalculatorTheme(darkTheme = false) {
        CalcButton("+", {})
    }
}

@Preview(showBackground = true)
@Composable
fun CalcButtonPreviewDark() {
    ComposeCalculatorTheme(darkTheme = true) {
        CalcButton("+", {})
    }
}