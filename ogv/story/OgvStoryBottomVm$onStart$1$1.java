package com.bilibili.ogv.story;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryBottomVm$onStart$1$1.class */
final class OgvStoryBottomVm$onStart$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    int label;
    final OgvStoryBottomVm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvStoryBottomVm$onStart$1$1(OgvStoryBottomVm ogvStoryBottomVm, Context context, Continuation<? super OgvStoryBottomVm$onStart$1$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvStoryBottomVm;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvStoryBottomVm$onStart$1$1(this.this$0, this.$context, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OgvStoryBottomVm ogvStoryBottomVm = this.this$0;
            Context context = this.$context;
            this.label = 1;
            if (OgvStoryBottomVm.m(ogvStoryBottomVm, context, 5000L, this) == coroutine_suspended) {
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
