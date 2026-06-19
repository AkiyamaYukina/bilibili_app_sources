package com.bilibili.pegasus.compose;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/compose/DefaultExposureCollector$start$3.class */
public final class DefaultExposureCollector$start$3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final DefaultExposureCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultExposureCollector$start$3(DefaultExposureCollector defaultExposureCollector, Continuation<? super DefaultExposureCollector$start$3> continuation) {
        super(2, continuation);
        this.this$0 = defaultExposureCollector;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultExposureCollector$start$3 defaultExposureCollector$start$3 = new DefaultExposureCollector$start$3(this.this$0, continuation);
        defaultExposureCollector$start$3.Z$0 = ((Boolean) obj).booleanValue();
        return defaultExposureCollector$start$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.Z$0) {
                this.this$0.f77251d = false;
                unit = null;
                return unit;
            }
            long j7 = this.this$0.f77248a.f77270d;
            if (j7 > 0) {
                this.label = 1;
                if (DelayKt.delay(j7, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        unit = Unit.INSTANCE;
        return unit;
    }
}
