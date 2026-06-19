package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.appcompat.widget.C3259x;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.videoplayer.coreV2.ABRManagerKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusQualityResources$setUserQn$1.class */
final class TheseusQualityResources$setUserQn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $quality;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusQualityResources$setUserQn$1(int i7, Continuation<? super TheseusQualityResources$setUserQn$1> continuation) {
        super(2, continuation);
        this.$quality = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusQualityResources$setUserQn$1(this.$quality, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        defpackage.a.b("[theseus-united-TheseusQualityResources$setUserQn$1-invokeSuspend] ", C3259x.a(this.$quality, "setUserQn on switch: quality is "), "TheseusQualityResources$setUserQn$1-invokeSuspend");
        ABRManagerKt.setUserQn(this.$quality);
        return Unit.INSTANCE;
    }
}
