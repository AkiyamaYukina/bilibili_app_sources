package com.bilibili.ogv.operation2.inlinevideo;

import androidx.lifecycle.Lifecycle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OgvInlineStatusHelper$inlineVideoAllowedFlow$1.class */
public final class OgvInlineStatusHelper$inlineVideoAllowedFlow$1 extends SuspendLambda implements Function4<Boolean, Boolean, Lifecycle.State, Continuation<? super Boolean>, Object> {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;

    public OgvInlineStatusHelper$inlineVideoAllowedFlow$1(Continuation<? super OgvInlineStatusHelper$inlineVideoAllowedFlow$1> continuation) {
        super(4, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Lifecycle.State) obj3, (Continuation<? super Boolean>) obj4);
    }

    public final Object invoke(boolean z6, boolean z7, Lifecycle.State state, Continuation<? super Boolean> continuation) {
        OgvInlineStatusHelper$inlineVideoAllowedFlow$1 ogvInlineStatusHelper$inlineVideoAllowedFlow$1 = new OgvInlineStatusHelper$inlineVideoAllowedFlow$1(continuation);
        ogvInlineStatusHelper$inlineVideoAllowedFlow$1.Z$0 = z6;
        ogvInlineStatusHelper$inlineVideoAllowedFlow$1.Z$1 = z7;
        ogvInlineStatusHelper$inlineVideoAllowedFlow$1.L$0 = state;
        return ogvInlineStatusHelper$inlineVideoAllowedFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.Z$0 && this.Z$1 && ((Lifecycle.State) this.L$0).compareTo(Lifecycle.State.RESUMED) >= 0);
    }
}
