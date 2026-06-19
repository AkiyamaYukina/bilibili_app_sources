package com.bilibili.upper.widget;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.upper.widget.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/k.class */
@StabilityInferred(parameters = 1)
public final class C6696k implements CoroutineScope {
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain());
    }
}
