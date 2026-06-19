package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/y.class */
public interface y extends x {
    @Composable
    void b(@NotNull AnnotatedString annotatedString, @NotNull Modifier modifier, @Nullable TextStyle textStyle, @Nullable Function1 function1, int i7, boolean z6, int i8, int i9, @NotNull Map map, @Nullable ColorProducer colorProducer, @Nullable Composer composer, int i10, int i11);

    @Composable
    @Nullable
    Brush c(@Nullable Composer composer, int i7);

    @NotNull
    TextVo getData();
}
