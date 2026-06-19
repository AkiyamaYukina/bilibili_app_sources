package com.bilibili.ship.theseus.ogv.operation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import com.bilibili.compose.theme.BiliTheme;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/e.class */
public final class e {
    public static Modifier a(Modifier modifier, List list, RoundedCornerShape roundedCornerShape) {
        OgvColorDirection ogvColorDirection = OgvColorDirection.Vertical;
        return BackgroundKt.background$default(modifier, list.size() > 1 ? Brush.Companion.m2571horizontalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(((Color) list.get(0)).m2639unboximpl()), Color.m2619boximpl(((Color) list.get(1)).m2639unboximpl())}), 0.0f, 0.0f, 0, 14, (Object) null) : list.size() == 1 ? new SolidColor(((Color) CollectionsKt.first(list)).m2639unboximpl(), null) : new SolidColor(Color.Companion.m2664getTransparent0d7_KjU(), null), roundedCornerShape, 0.0f, 4, null);
    }

    @Composable
    public static final long b(@Nullable Composer composer, @NotNull String str) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1720870687, 0, -1, "com.bilibili.ship.theseus.ogv.operation.parseColorName (OperationContainerComposeExt.kt:44)");
        }
        long j7 = BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getColorByName-vNxB06k(str);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j7;
    }
}
