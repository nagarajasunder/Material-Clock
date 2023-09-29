package com.geekydroid.materialclock.ui.timer.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.geekydroid.materialclock.R
import com.geekydroid.materialclock.ui.theme.timerInputRemovalColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimerInputButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: (String) -> Unit,
    color: Color = Color.Yellow,
    @DrawableRes iconRes: Int? = null
) {
   FloatingActionButton(
       modifier = modifier,
       shape = CircleShape,
       containerColor = color,
       onClick = {
           onClick(text)
       }
   ) {
       if (iconRes != null) {
           Icon(
               modifier = Modifier,
               painter = painterResource(id = iconRes),
               contentDescription = stringResource(id = R.string.backspace),
               tint = Color.Black
           )
       } else {
           Text(
               text = text,
               textAlign = TextAlign.Center,
               style = MaterialTheme.typography.headlineSmall
           )
       }
   }
}

@Preview(showBackground = true)
@Composable
fun TimerButtonPreview() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        TimerInputButton(
            modifier = Modifier.size(100.dp),
            iconRes = R.drawable.backspace,
            color = timerInputRemovalColor,
            text = "X", onClick = {

            })
        TimerInputButton(
            modifier = Modifier.size(100.dp),
            iconRes = R.drawable.backspace,
            color = timerInputRemovalColor,
            text = "X", onClick = {

            })
        TimerInputButton(
            modifier = Modifier.size(100.dp),
            iconRes = R.drawable.backspace,
            color = timerInputRemovalColor,
            text = "X", onClick = {

            })
    }
}