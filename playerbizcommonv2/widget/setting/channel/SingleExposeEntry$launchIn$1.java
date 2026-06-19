package com.bilibili.playerbizcommonv2.widget.setting.channel;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/SingleExposeEntry$launchIn$1.class */
public final class SingleExposeEntry$launchIn$1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final SingleExposeEntry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleExposeEntry$launchIn$1(SingleExposeEntry singleExposeEntry, Continuation<? super SingleExposeEntry$launchIn$1> continuation) {
        super(2, continuation);
        this.this$0 = singleExposeEntry;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SingleExposeEntry$launchIn$1(this.this$0, continuation);
    }

    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.f83205a.invoke();
        return Unit.INSTANCE;
    }
}
