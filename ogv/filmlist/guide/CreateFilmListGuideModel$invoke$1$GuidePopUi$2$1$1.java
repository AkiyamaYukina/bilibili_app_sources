package com.bilibili.ogv.filmlist.guide;

import androidx.compose.runtime.MutableState;
import com.alipay.sdk.app.PayTask;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/guide/CreateFilmListGuideModel$invoke$1$GuidePopUi$2$1$1.class */
final class CreateFilmListGuideModel$invoke$1$GuidePopUi$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Boolean> $showGuidePop$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFilmListGuideModel$invoke$1$GuidePopUi$2$1$1(MutableState<Boolean> mutableState, Continuation<? super CreateFilmListGuideModel$invoke$1$GuidePopUi$2$1$1> continuation) {
        super(2, continuation);
        this.$showGuidePop$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateFilmListGuideModel$invoke$1$GuidePopUi$2$1$1(this.$showGuidePop$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(PayTask.f60018j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MutableState<Boolean> mutableState = this.$showGuidePop$delegate;
        KProperty<Object>[] kPropertyArr = d.f67711a;
        mutableState.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
