package com.bilibili.pegasus.components.graduation;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.adcommon.utils.ext.AdExtensions;
import com.bilibili.lib.dd.DeviceDecision;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonFlipEnterOverlayController$show$1.class */
final class GraduationSeasonFlipEnterOverlayController$show$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $onEnd;
    int label;
    final C5624z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationSeasonFlipEnterOverlayController$show$1(C5624z c5624z, Function0<Unit> function0, Continuation<? super GraduationSeasonFlipEnterOverlayController$show$1> continuation) {
        super(2, continuation);
        this.this$0 = c5624z;
        this.$onEnd = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GraduationSeasonFlipEnterOverlayController$show$1(this.this$0, this.$onEnd, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getClass();
            long longOrDefault = AdExtensions.toLongOrDefault(DeviceDecision.INSTANCE.dd("dd_grd26_flip_transition_duration_ms", "1720"), 1720L);
            this.label = 1;
            if (DelayKt.delay(longOrDefault, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        C5624z c5624z = this.this$0;
        Function0<Unit> function0 = this.$onEnd;
        if (!c5624z.f76263c) {
            c5624z.f76263c = true;
            Job job = c5624z.f76262b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            c5624z.f76262b = null;
            ComposeView composeView = c5624z.f76261a;
            if (composeView != null) {
                ViewParent parent = composeView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(composeView);
                }
            }
            c5624z.f76261a = null;
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
