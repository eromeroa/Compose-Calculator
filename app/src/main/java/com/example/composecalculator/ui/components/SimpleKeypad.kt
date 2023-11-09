package com.example.composecalculator.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composecalculator.R
import com.example.composecalculator.ui.theme.ComposeCalculatorTheme

@Composable
fun SimpleKeypad() {
    Column (modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_medium))
    ){
        val rowModifier = Modifier
            .padding(
                bottom = dimensionResource(R.dimen.padding_medium),
                start = dimensionResource(R.dimen.padding_medium),
                end = dimensionResource(R.dimen.padding_medium)
            )
            .fillMaxWidth()

        Row (
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
            modifier = rowModifier
        ){
            CalcButton(
                buttonSymbol = "AC",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "⌫",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "%",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f, true)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "÷",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f, true)
                    .weight(1f)
            )
        }
        Row (
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
            modifier = rowModifier
        ){
            CalcButton(
                buttonSymbol = "7",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "8",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "9",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f, true)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "×",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f, true)
                    .weight(1f)
            )
        }
        Row (
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
            modifier = rowModifier
        ){
            CalcButton(
                buttonSymbol = "4",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "5",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "6",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f, true)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "-",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f, true)
                    .weight(1f)
            )
        }
        Row (
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
            modifier = rowModifier
        ){
            CalcButton(
                buttonSymbol = "1",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "2",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "3",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f, true)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "+",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f, true)
                    .weight(1f)
            )
        }
        Row (
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
            modifier = rowModifier
        ){
            CalcButton(
                buttonSymbol = "±",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "0",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = ".",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f, true)
                    .weight(1f)
            )
            CalcButton(
                buttonSymbol = "=",
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .aspectRatio(1f, true)
                    .weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun KeypadPreviewLight() {
    ComposeCalculatorTheme(darkTheme = false) {
        SimpleKeypad()
    }
}

@Preview(showBackground = true)
@Composable
fun KeypadPreviewDark() {
    ComposeCalculatorTheme(darkTheme = true) {
        SimpleKeypad()
    }
}