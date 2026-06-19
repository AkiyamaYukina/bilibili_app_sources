package com.bilibili.playerbizcommonv2.widget.popup;

import android.content.res.Configuration;
import androidx.activity.ComponentActivity;
import com.bilibili.ogv.infra.android.app.ActivitiesKt;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil$showWithScene$1$1$1.class */
public final class FollowPopupUtil$showWithScene$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final ComponentActivity $activity;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil$showWithScene$1$1$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f82622a = (a<T>) new Object();

        public final Object emit(Object obj, Continuation continuation) {
            Lazy lazy = FollowPopupUtil.f82614a;
            Job job = FollowPopupUtil.f82615b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            FollowPopupUtil.f82615b = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowPopupUtil$showWithScene$1$1$1(ComponentActivity componentActivity, Continuation<? super FollowPopupUtil$showWithScene$1$1$1> continuation) {
        super(1, continuation);
        this.$activity = componentActivity;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FollowPopupUtil$showWithScene$1$1$1(this.$activity, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Configuration> flowB = ActivitiesKt.b(this.$activity);
            FlowCollector flowCollector = a.f82622a;
            this.label = 1;
            if (flowB.collect(flowCollector, this) == coroutine_suspended) {
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
