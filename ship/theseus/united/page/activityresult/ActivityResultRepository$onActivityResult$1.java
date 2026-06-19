package com.bilibili.ship.theseus.united.page.activityresult;

import android.content.Intent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activityresult/ActivityResultRepository$onActivityResult$1.class */
public final class ActivityResultRepository$onActivityResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Intent $data;
    final int $requestCode;
    final int $resultCode;
    int label;
    final ActivityResultRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityResultRepository$onActivityResult$1(ActivityResultRepository activityResultRepository, int i7, int i8, Intent intent, Continuation<? super ActivityResultRepository$onActivityResult$1> continuation) {
        super(2, continuation);
        this.this$0 = activityResultRepository;
        this.$requestCode = i7;
        this.$resultCode = i8;
        this.$data = intent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivityResultRepository$onActivityResult$1(this.this$0, this.$requestCode, this.$resultCode, this.$data, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<a> mutableSharedFlow = this.this$0.f98828b;
            a aVar = new a(this.$requestCode, this.$resultCode, this.$data);
            this.label = 1;
            if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
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
