package com.bilibili.studio.videoeditor.extension;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/CoroutineScopeExtKt.class */
public final class CoroutineScopeExtKt {
    @NotNull
    public static final <T> Flow<T> a(@NotNull CoroutineScope coroutineScope, int i7, @NotNull List<? extends Function1<? super Continuation<? super T>, ? extends Object>> list) {
        return FlowKt.flow(new CoroutineScopeExtKt$runAsyncBlock$1(list, i7, coroutineScope, null));
    }
}
