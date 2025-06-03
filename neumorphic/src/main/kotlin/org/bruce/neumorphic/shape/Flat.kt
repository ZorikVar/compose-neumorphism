package org.bruce.neumorphic.shape

import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import org.bruce.neumorphic.NeuStyle
import org.bruce.neumorphic.drawBackgroundShadows

class Flat(override val cornerShape: CornerShape) : NeuShape(cornerShape) {
    override fun draw(drawScope: ContentDrawScope, style: NeuStyle) {
        drawScope.drawBackgroundShadows(this, style)
        drawScope.drawContent()
    }
}