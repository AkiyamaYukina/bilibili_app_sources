package com.bilibili.ship.theseus.united.page.danmaku;

import c6.Q;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$danmakuShowFlow$1.class */
public final class DanmakuCompoundRepository$danmakuShowFlow$1 extends SuspendLambda implements Function4<Boolean, Boolean, Boolean, Continuation<? super Boolean>, Object> {
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;

    public DanmakuCompoundRepository$danmakuShowFlow$1(Continuation<? super DanmakuCompoundRepository$danmakuShowFlow$1> continuation) {
        super(4, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (Continuation<? super Boolean>) obj4);
    }

    public final Object invoke(boolean z6, boolean z7, boolean z8, Continuation<? super Boolean> continuation) {
        DanmakuCompoundRepository$danmakuShowFlow$1 danmakuCompoundRepository$danmakuShowFlow$1 = new DanmakuCompoundRepository$danmakuShowFlow$1(continuation);
        danmakuCompoundRepository$danmakuShowFlow$1.Z$0 = z6;
        danmakuCompoundRepository$danmakuShowFlow$1.Z$1 = z7;
        danmakuCompoundRepository$danmakuShowFlow$1.Z$2 = z8;
        return danmakuCompoundRepository$danmakuShowFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z6 = this.Z$0;
        boolean z7 = this.Z$1;
        boolean z8 = this.Z$2;
        StringBuilder sbA = Q.a("danmaku service:", ", cast screen:", ", in casting:", z6, z7);
        sbA.append(z8);
        defpackage.a.b("[theseus-united-DanmakuCompoundRepository$danmakuShowFlow$1-invokeSuspend] ", sbA.toString(), "DanmakuCompoundRepository$danmakuShowFlow$1-invokeSuspend");
        if (z8) {
            z6 = z7;
        }
        return Boxing.boxBoolean(z6);
    }
}
