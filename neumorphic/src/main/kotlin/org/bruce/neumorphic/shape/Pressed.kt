package org.bruce.neumorphic.shape

import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import org.bruce.neumorphic.*

class Pressed(override val cornerShape: CornerShape) : NeuShape(cornerShape) {
    override fun draw(drawScope: ContentDrawScope, style: NeuStyle) {
        drawScope.drawContent()
        drawScope.drawForegroundShadows(this, style)
    }
}
