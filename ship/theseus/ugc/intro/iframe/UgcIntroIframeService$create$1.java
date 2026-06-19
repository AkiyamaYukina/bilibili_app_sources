package com.bilibili.ship.theseus.ugc.intro.iframe;

import com.bilibili.common.webview.js.JsbProxy;
import com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/UgcIntroIframeService$create$1.class */
public final class UgcIntroIframeService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final b $component;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcIntroIframeService$create$1(b bVar, Continuation<? super UgcIntroIframeService$create$1> continuation) {
        super(1, continuation);
        this.$component = bVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcIntroIframeService$create$1(this.$component, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            b bVar = this.$component;
            BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2 = bVar.f97024d;
            if (biliWebViewConfigHolderV2 != null) {
                biliWebViewConfigHolderV2.destroyWebView();
            }
            JsbProxy jsbProxy = bVar.f97023c;
            if (jsbProxy != null) {
                jsbProxy.onDestroy();
            }
            throw th;
        }
    }
}
