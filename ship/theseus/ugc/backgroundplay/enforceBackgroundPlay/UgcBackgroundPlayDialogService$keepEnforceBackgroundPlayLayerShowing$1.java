package com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$keepEnforceBackgroundPlayLayerShowing$1.class */
final class UgcBackgroundPlayDialogService$keepEnforceBackgroundPlayLayerShowing$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final UgcBackgroundPlayDialogService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcBackgroundPlayDialogService$keepEnforceBackgroundPlayLayerShowing$1(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService, Continuation<? super UgcBackgroundPlayDialogService$keepEnforceBackgroundPlayLayerShowing$1> continuation) {
        super(continuation);
        this.this$0 = ugcBackgroundPlayDialogService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UgcBackgroundPlayDialogService.a(this.this$0, null, null, this);
    }
}
