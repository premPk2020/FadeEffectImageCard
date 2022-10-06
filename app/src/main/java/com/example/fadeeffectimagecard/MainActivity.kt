package com.example.fadeeffectimagecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.fadeeffectimagecard.ui.theme.FadeEffectImageCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FadeEffectImageCardTheme {

            }
        }
    }
}
