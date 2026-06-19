package com.bilibili.ogv.operation2;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/a.class */
public interface a {
    @Nullable
    Object a(@NotNull Continuation<? super Unit> continuation);

    @Composable
    void b(@Nullable Composer composer, @NotNull Modifier modifier);
}
