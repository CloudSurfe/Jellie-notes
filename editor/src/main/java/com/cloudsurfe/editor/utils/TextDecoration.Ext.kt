package com.cloudsurfe.editor.utils

import androidx.compose.ui.text.style.TextDecoration

public operator fun TextDecoration.minus(decoration: TextDecoration): TextDecoration =
    if (this == decoration)
        TextDecoration.None
    else if (decoration in this)
        if (decoration.mask == TextDecoration.LineThrough.mask) TextDecoration.Underline
        else TextDecoration.LineThrough
    else
        TextDecoration.None

internal fun TextDecoration.getCommonDecoration(
    other: TextDecoration?,
    strict: Boolean = true
): TextDecoration? =
    if (other == null)
        null
    else if (strict)
        if (this != other) null
        else this
    else if (this in other)
        this
    else if (other in this)
        other
    else
        null