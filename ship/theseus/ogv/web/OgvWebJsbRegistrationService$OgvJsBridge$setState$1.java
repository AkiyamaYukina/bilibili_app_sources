package com.bilibili.ship.theseus.ogv.web;

import com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/OgvWebJsbRegistrationService$OgvJsBridge$setState$1.class */
public final class OgvWebJsbRegistrationService$OgvJsBridge$setState$1 extends ContinuationImpl {
    int label;
    Object result;
    final OgvWebJsbRegistrationService.OgvJsBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvWebJsbRegistrationService$OgvJsBridge$setState$1(OgvWebJsbRegistrationService.OgvJsBridge ogvJsBridge, Continuation<? super OgvWebJsbRegistrationService$OgvJsBridge$setState$1> continuation) {
        super(continuation);
        this.this$0 = ogvJsBridge;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setState(null, null, this);
    }
}
