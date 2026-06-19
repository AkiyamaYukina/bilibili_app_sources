package com.bilibili.live.streaming.utils;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/utils/SyncLogKt.class */
public final class SyncLogKt {
    public static final <T> T sync(@NotNull Object obj, @NotNull Function0<? extends T> function0) {
        T t7;
        synchronized (obj) {
            try {
                t7 = (T) function0.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return t7;
    }
}
