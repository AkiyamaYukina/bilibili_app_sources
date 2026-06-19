package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/RestrictionPlaylistUIComponentKt$autoScroll$1.class */
final class RestrictionPlaylistUIComponentKt$autoScroll$1 extends ContinuationImpl {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    Object result;

    public RestrictionPlaylistUIComponentKt$autoScroll$1(Continuation<? super RestrictionPlaylistUIComponentKt$autoScroll$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return U.b(null, 0.0f, 0L, null, this);
    }
}
