package org.bruce.neumorphic.shape

import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import org.bruce.neumorphic.NeuStyle

abstract class NeuShape(open val cornerShape: CornerShape) {
    abstract fun draw(drawScope: ContentDrawScope, style: NeuStyle)
}
