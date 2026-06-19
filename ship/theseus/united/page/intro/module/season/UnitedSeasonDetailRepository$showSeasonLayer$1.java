package com.bilibili.ship.theseus.united.page.intro.module.season;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonDetailRepository$showSeasonLayer$1.class */
public final class UnitedSeasonDetailRepository$showSeasonLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $cid;
    int label;
    final UnitedSeasonDetailRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonDetailRepository$showSeasonLayer$1(UnitedSeasonDetailRepository unitedSeasonDetailRepository, long j7, Continuation<? super UnitedSeasonDetailRepository$showSeasonLayer$1> continuation) {
        super(2, continuation);
        this.this$0 = unitedSeasonDetailRepository;
        this.$cid = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnitedSeasonDetailRepository$showSeasonLayer$1(this.this$0, this.$cid, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Long> mutableSharedFlow = this.this$0.f101575f;
            Long lBoxLong = Boxing.boxLong(this.$cid);
            this.label = 1;
            if (mutableSharedFlow.emit(lBoxLong, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
