package com.qburst.compose.ledmatrix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.qburst.compose.ledmatrix.ui.theme.LEDMatrixDisplayTheme

val number00 = listOf(
    listOf(0, 1, 1, 1, 0),
    listOf(1, 0, 0, 0, 1),
    listOf(1, 0, 0, 1, 1),
    listOf(1, 0, 1, 0, 1),
    listOf(1, 1, 0, 0, 1),
    listOf(1, 0, 0, 0, 1),
    listOf(0, 1, 1, 1, 0),
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LEDMatrixDisplayTheme {

                LedMatrixDisplay()

            }
        }
    }
}

@Composable
fun LedMatrixDisplay() {

    Column {

        repeat(7) {

            Row {

                repeat(5) {

                    Box(
                        modifier = Modifier
                            .padding(1.dp)
                            .width(10.dp)
                            .height(10.dp)
                            .background(color = Color.Gray)

                    )
                }

            }

        }
    }

}