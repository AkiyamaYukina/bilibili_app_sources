package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import com.bilibili.ship.theseus.ugc.intro.ugcheadline.m;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createHeadline$headlineFlow$1.class */
public final class UgcHeadlineService$createHeadline$headlineFlow$1 extends SuspendLambda implements Function4<Boolean, Boolean, Boolean, Continuation<? super m.a>, Object> {
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;

    public UgcHeadlineService$createHeadline$headlineFlow$1(Continuation<? super UgcHeadlineService$createHeadline$headlineFlow$1> continuation) {
        super(4, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (Continuation<? super m.a>) obj4);
    }

    public final Object invoke(boolean z6, boolean z7, boolean z8, Continuation<? super m.a> continuation) {
        UgcHeadlineService$createHeadline$headlineFlow$1 ugcHeadlineService$createHeadline$headlineFlow$1 = new UgcHeadlineService$createHeadline$headlineFlow$1(continuation);
        ugcHeadlineService$createHeadline$headlineFlow$1.Z$0 = z6;
        ugcHeadlineService$createHeadline$headlineFlow$1.Z$1 = z7;
        ugcHeadlineService$createHeadline$headlineFlow$1.Z$2 = z8;
        return ugcHeadlineService$createHeadline$headlineFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new m.a(this.Z$0, this.Z$1, this.Z$2);
    }
}
