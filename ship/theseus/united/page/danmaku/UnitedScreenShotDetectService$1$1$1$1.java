package com.bilibili.ship.theseus.united.page.danmaku;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/UnitedScreenShotDetectService$1$1$1$1.class */
final class UnitedScreenShotDetectService$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<CommentItem> $result;
    int label;
    final UnitedScreenShotDetectService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedScreenShotDetectService$1$1$1$1(UnitedScreenShotDetectService unitedScreenShotDetectService, List<? extends CommentItem> list, Continuation<? super UnitedScreenShotDetectService$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = unitedScreenShotDetectService;
        this.$result = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnitedScreenShotDetectService$1$1$1$1(this.this$0, this.$result, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UnitedScreenShotDetectService unitedScreenShotDetectService = this.this$0;
            List<CommentItem> list = this.$result;
            this.label = 1;
            if (UnitedScreenShotDetectService.a(unitedScreenShotDetectService, list, this) == coroutine_suspended) {
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
