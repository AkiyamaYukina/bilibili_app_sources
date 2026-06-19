package com.bilibili.playset.api;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/e.class */
public final class e {
    public static final boolean a(@NotNull u uVar) {
        return uVar.n() == 2;
    }

    @Nullable
    public static final Object b(@NotNull u uVar, @NotNull SuspendLambda suspendLambda) {
        return BuildersKt.withContext(Dispatchers.getIO(), new FavoritesTranslateKt$translateArcTitle$2(uVar, null), suspendLambda);
    }
}
