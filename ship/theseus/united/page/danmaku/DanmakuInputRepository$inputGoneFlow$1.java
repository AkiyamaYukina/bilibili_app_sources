package com.bilibili.ship.theseus.united.page.danmaku;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuInputRepository$inputGoneFlow$1.class */
public final class DanmakuInputRepository$inputGoneFlow$1 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
    boolean Z$0;
    boolean Z$1;
    int label;
    final DanmakuInputRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuInputRepository$inputGoneFlow$1(DanmakuInputRepository danmakuInputRepository, Continuation<? super DanmakuInputRepository$inputGoneFlow$1> continuation) {
        super(3, continuation);
        this.this$0 = danmakuInputRepository;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
    }

    public final Object invoke(boolean z6, boolean z7, Continuation<? super Boolean> continuation) {
        DanmakuInputRepository$inputGoneFlow$1 danmakuInputRepository$inputGoneFlow$1 = new DanmakuInputRepository$inputGoneFlow$1(this.this$0, continuation);
        danmakuInputRepository$inputGoneFlow$1.Z$0 = z6;
        danmakuInputRepository$inputGoneFlow$1.Z$1 = z7;
        return danmakuInputRepository$inputGoneFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.Z$0 || this.Z$1 || this.this$0.f99401b.f99536a.e());
    }
}
