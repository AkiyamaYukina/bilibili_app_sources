package com.bilibili.pegasus.common;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/f.class */
public final class f {
    @Nullable
    public static final Object a(@NotNull String str, @NotNull Kn0.c cVar, @NotNull SuspendLambda suspendLambda) {
        return BuildersKt.withContext(Dispatchers.getIO(), new OverseaKt$translateArcTitle$2(cVar, str, null), suspendLambda);
    }
}
