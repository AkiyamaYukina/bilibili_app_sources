package com.bilibili.pegasus.common.inline;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/PegasusAutoPlaySetDialog$show$1$2.class */
public final class PegasusAutoPlaySetDialog$show$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $activity;
    int label;
    final PegasusAutoPlaySetDialog this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/PegasusAutoPlaySetDialog$show$1$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PegasusAutoPlaySetDialog f75548a;

        public a(PegasusAutoPlaySetDialog pegasusAutoPlaySetDialog) {
            this.f75548a = pegasusAutoPlaySetDialog;
        }

        public final Object emit(Object obj, Continuation continuation) {
            this.f75548a.f75547d.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PegasusAutoPlaySetDialog$show$1$2(FragmentActivity fragmentActivity, PegasusAutoPlaySetDialog pegasusAutoPlaySetDialog, Continuation<? super PegasusAutoPlaySetDialog$show$1$2> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.this$0 = pegasusAutoPlaySetDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PegasusAutoPlaySetDialog$show$1$2(this.$activity, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(ScreenAdjustUtilsKt.windowSizeFlow(this.$activity));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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
