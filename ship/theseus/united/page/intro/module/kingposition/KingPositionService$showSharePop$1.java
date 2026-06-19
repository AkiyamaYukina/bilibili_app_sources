package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$showSharePop$1.class */
final class KingPositionService$showSharePop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final KingPositionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingPositionService$showSharePop$1(KingPositionService kingPositionService, Continuation<? super KingPositionService$showSharePop$1> continuation) {
        super(2, continuation);
        this.this$0 = kingPositionService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KingPositionService$showSharePop$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.f100370T = false;
            this.label = 1;
            if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        KingPositionService kingPositionService = this.this$0;
        BiliGuideBubble biliGuideBubble = kingPositionService.f100368R;
        if (biliGuideBubble != null && biliGuideBubble.isShowing()) {
            kingPositionService.f100370T = true;
            BiliGuideBubble biliGuideBubble2 = kingPositionService.f100368R;
            if (biliGuideBubble2 != null) {
                biliGuideBubble2.dismiss();
            }
        }
        return Unit.INSTANCE;
    }
}
