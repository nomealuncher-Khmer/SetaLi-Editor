package io.github.artcraftandroid.capcraft.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * SETALI OCEAN PREMIUM THEME
 * Deep ocean, aqua and turquoise color palette.
 */
object Palette {

    // Main Ocean Background
    val Black = Color(0xFF071B2D)

    // Editor Chrome
    val Chrome = Color(0xFF0A2238)

    // Panels and Sheets
    val Panel = Color(0xFF102B43)

    // Cards
    val Card = Color(0xFF163751)
    val CardPressed = Color(0xFF204765)

    // Dividers
    val Divider = Color(0xFF24465D)

    // Ocean Accent
    val Accent = Color(0xFF20D6D2)
    val OnAccent = Color(0xFF06232D)

    // Editor Preview
    val EditorTop = Color(0xFF0B2035)

    // Timeline
    val Timeline = Color(0xFF102B43)

    // Bottom Dock
    val DockSelected = Color(0xFF19445C)
    val DockBack = Color(0xFF28546A)
    val DockText = Color(0xFFD5F4F5)

    // Resolution Chip
    val Chip = Color(0xFF1C3B52)

    // Hint Rows
    val HintRow = Color(0xFF163751)
    val HintIcon = Color(0xFF62B9C5)

    // Text
    val Text = Color(0xFFFFFFFF)
    val TextSecondary = Color(0xFFB2D0DC)
    val TextTertiary = Color(0xFF7799AC)

    // Disabled
    val Disabled = Color(0xFF527080)

    // Timeline Clip Colors
    val TextClip = Color(0xFF35A9E8)
    val CaptionClip = Color(0xFF55C9E8)
    val EffectClip = Color(0xFF9278F5)
    val FilterClip = Color(0xFFE17BC5)
    val StickerClip = Color(0xFFFFC857)
    val AudioClip = Color(0xFF176B70)

    // Audio Beat and Wave
    val Beat = Color(0xFF8DF5E8)
    val AudioWave = Color(0xFF20D6D2)

    // Overlay
    val OverlayClip = Color(0xFF24465D)

    // Danger
    val Danger = Color(0xFFFF647C)
}

object Type {

    val Title = TextStyle(
        color = Palette.Text,
        fontSize = 17.sp,
        fontWeight = FontWeight.SemiBold
    )

    val Body = TextStyle(
        color = Palette.Text,
        fontSize = 14.sp
    )

    val BodyStrong = TextStyle(
        color = Palette.Text,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium
    )

    val Small = TextStyle(
        color = Palette.TextSecondary,
        fontSize = 12.sp
    )

    val Tiny = TextStyle(
        color = Palette.TextSecondary,
        fontSize = 10.sp
    )

    val DockLabel = TextStyle(
        color = Palette.Text,
        fontSize = 10.sp
    )
}

@Composable
fun CapCraftTheme(content: @Composable () -> Unit) {

    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = Palette.Accent,
            onPrimary = Palette.OnAccent,

            secondary = Color(0xFF62C8E8),
            onSecondary = Color(0xFF06232D),

            tertiary = Color(0xFF8DF5E8),
            onTertiary = Color(0xFF06232D),

            background = Palette.Black,
            onBackground = Palette.Text,

            surface = Palette.Panel,
            onSurface = Palette.Text,

            surfaceVariant = Palette.Card,
            onSurfaceVariant = Palette.TextSecondary,

            outline = Palette.Divider,

            error = Palette.Danger,
            onError = Color.White
        ),
        content = content
    )
}
