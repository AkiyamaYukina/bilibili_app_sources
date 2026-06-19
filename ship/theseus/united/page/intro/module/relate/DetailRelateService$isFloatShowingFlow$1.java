package com.bilibili.ship.theseus.united.page.intro.module.relate;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$isFloatShowingFlow$1.class */
final class DetailRelateService$isFloatShowingFlow$1 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
    boolean Z$0;
    boolean Z$1;
    int label;

    public DetailRelateService$isFloatShowingFlow$1(Continuation<? super DetailRelateService$isFloatShowingFlow$1> continuation) {
        super(3, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
    }

    public final Object invoke(boolean z6, boolean z7, Continuation<? super Boolean> continuation) {
        DetailRelateService$isFloatShowingFlow$1 detailRelateService$isFloatShowingFlow$1 = new DetailRelateService$isFloatShowingFlow$1(continuation);
        detailRelateService$isFloatShowingFlow$1.Z$0 = z6;
        detailRelateService$isFloatShowingFlow$1.Z$1 = z7;
        return detailRelateService$isFloatShowingFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.Z$0 || this.Z$1);
    }
}
