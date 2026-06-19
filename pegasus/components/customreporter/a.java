package com.bilibili.pegasus.components.customreporter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/a.class */
@StabilityInferred(parameters = 1)
public final class a implements com.bilibili.pegasus.d {
    @Nullable
    public final Object a(@NotNull Action action, @NotNull Continuation<? super Action> continuation) {
        j.a(EventType.ACTION, MapsKt.mapOf(TuplesKt.to("action_name", action.getClass().getSimpleName())));
        return action;
    }
}
