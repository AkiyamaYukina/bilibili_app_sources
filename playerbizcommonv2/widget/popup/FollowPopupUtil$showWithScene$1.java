package com.bilibili.playerbizcommonv2.widget.popup;

import androidx.activity.ComponentActivity;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ogv.infra.coroutine.c;
import com.bilibili.playerbizcommonv2.widget.popup.FollowPopupUtil;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil$showWithScene$1.class */
final class FollowPopupUtil$showWithScene$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ComponentActivity $activity;
    final long $duration;
    final FollowPopupUtil.Scene $scene;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowPopupUtil$showWithScene$1(ComponentActivity componentActivity, FollowPopupUtil.Scene scene, long j7, Continuation<? super FollowPopupUtil$showWithScene$1> continuation) {
        super(2, continuation);
        this.$activity = componentActivity;
        this.$scene = scene;
        this.$duration = j7;
    }

    private static final Unit invokeSuspend$lambda$0(ComponentActivity componentActivity, FollowPopupUtil.Scene scene, long j7, c cVar) {
        cVar.b(new FollowPopupUtil$showWithScene$1$1$1(componentActivity, null));
        cVar.b(new FollowPopupUtil$showWithScene$1$1$2(componentActivity, scene, null));
        cVar.b(new FollowPopupUtil$showWithScene$1$1$3(j7, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FollowPopupUtil$showWithScene$1(this.$activity, this.$scene, this.$duration, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ComponentActivity componentActivity = this.$activity;
            FollowPopupUtil.Scene scene = this.$scene;
            long j7 = this.$duration;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(componentActivity, scene, j7, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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
