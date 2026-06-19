package com.bilibili.ship.theseus.ogv.web;

import com.bilibili.ship.theseus.ogv.web.OgvEpWebJsbRegistrationService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/OgvEpWebJsbRegistrationService$OgvJsBridge$seek$1.class */
public final class OgvEpWebJsbRegistrationService$OgvJsBridge$seek$1 extends ContinuationImpl {
    int label;
    Object result;
    final OgvEpWebJsbRegistrationService.OgvJsBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvEpWebJsbRegistrationService$OgvJsBridge$seek$1(OgvEpWebJsbRegistrationService.OgvJsBridge ogvJsBridge, Continuation<? super OgvEpWebJsbRegistrationService$OgvJsBridge$seek$1> continuation) {
        super(continuation);
        this.this$0 = ogvJsBridge;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.seek(0L, this);
    }
}
