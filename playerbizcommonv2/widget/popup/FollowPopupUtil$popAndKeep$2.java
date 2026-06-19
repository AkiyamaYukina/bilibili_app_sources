package com.bilibili.playerbizcommonv2.widget.popup;

import android.widget.PopupWindow;
import com.bilibili.playerbizcommonv2.widget.popup.FollowPopupUtil;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil$popAndKeep$2.class */
final class FollowPopupUtil$popAndKeep$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FollowPopupUtil.a $config;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowPopupUtil$popAndKeep$2(FollowPopupUtil.a aVar, Continuation<? super FollowPopupUtil$popAndKeep$2> continuation) {
        super(2, continuation);
        this.$config = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1() {
        Job job = FollowPopupUtil.f82615b;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FollowPopupUtil$popAndKeep$2 followPopupUtil$popAndKeep$2 = new FollowPopupUtil$popAndKeep$2(this.$config, continuation);
        followPopupUtil$popAndKeep$2.L$0 = obj;
        return followPopupUtil$popAndKeep$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.widget.PopupWindow$OnDismissListener, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        PopupWindow popupWindow = new PopupWindow(this.$config.f82617a, -2, -2);
        popupWindow.setFocusable(false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(2131888125);
        popupWindow.setOnDismissListener(new Object());
        try {
            FollowPopupUtil.a aVar = this.$config;
            popupWindow.showAtLocation(aVar.f82618b, aVar.f82619c, aVar.f82620d, aVar.f82621e);
        } catch (Exception e7) {
            BLog.i("show snack bar error:" + e7);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new FollowPopupUtil$popAndKeep$2$invokeSuspend$$inlined$awaitCancel$1(null, popupWindow), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
