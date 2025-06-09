package org.bruce.neumorphic.shape

import androidx.compose.ui.unit.Dp

sealed class CornerShape

data object Oval : CornerShape()

class RoundedCorner(val radius: Dp) : CornerShape()
