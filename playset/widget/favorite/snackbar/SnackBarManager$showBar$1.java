package com.bilibili.playset.widget.favorite.snackbar;

import android.widget.PopupWindow;
import androidx.activity.ComponentActivity;
import com.bilibili.playset.widget.favorite.snackbar.SnackBarManager;
import com.bilibili.playset.widget.favorite.snackbar.SnackBarManager$showBar$1;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/snackbar/SnackBarManager$showBar$1.class */
public final class SnackBarManager$showBar$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final a $action;
    final ComponentActivity $activity;
    final SnackBarManager.a $data;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.playset.widget.favorite.snackbar.SnackBarManager$showBar$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/snackbar/SnackBarManager$showBar$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $action;
        final ComponentActivity $activity;
        final SnackBarManager.a $data;
        final Job $job;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ComponentActivity componentActivity, SnackBarManager.a aVar, a aVar2, Job job, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = componentActivity;
            this.$data = aVar;
            this.$action = aVar2;
            this.$job = job;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(ComponentActivity componentActivity, Job job, a aVar) {
            componentActivity.removeOnConfigurationChangedListener(SnackBarManager.f85793b);
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            if (aVar != null) {
                aVar.onDismiss();
            }
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activity, this.$data, this.$action, this.$job, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$activity.isFinishing() || this.$activity.isDestroyed()) {
                return Unit.INSTANCE;
            }
            if (SnackBarManager.f85792a != null) {
                BLog.i("SnackBarManager", "dismiss cause of next show");
                SnackBarManager.a();
            }
            PopupWindow popupWindow = new PopupWindow(this.$data.f85794a, -2, -2);
            popupWindow.setFocusable(false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setAnimationStyle(2131888125);
            SnackBarManager.f85792a = popupWindow;
            final ComponentActivity componentActivity = this.$activity;
            final Job job = this.$job;
            final a aVar = this.$action;
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener(componentActivity, job, aVar) { // from class: com.bilibili.playset.widget.favorite.snackbar.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ComponentActivity f85800a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Job f85801b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final a f85802c;

                {
                    this.f85800a = componentActivity;
                    this.f85801b = job;
                    this.f85802c = aVar;
                }

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    SnackBarManager$showBar$1.AnonymousClass1.invokeSuspend$lambda$1(this.f85800a, this.f85801b, this.f85802c);
                }
            });
            this.$activity.addOnConfigurationChangedListener(SnackBarManager.f85793b);
            try {
                PopupWindow popupWindow2 = SnackBarManager.f85792a;
                if (popupWindow2 != null) {
                    SnackBarManager.a aVar2 = this.$data;
                    popupWindow2.showAtLocation(aVar2.f85795b, aVar2.f85797d, aVar2.f85798e, aVar2.f85799f);
                }
            } catch (Exception e7) {
                BLog.i("show snack bar error:" + e7);
            }
            a aVar3 = this.$action;
            if (aVar3 != null) {
                aVar3.onShow();
            }
            this.$job.start();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackBarManager$showBar$1(SnackBarManager.a aVar, ComponentActivity componentActivity, a aVar2, Continuation<? super SnackBarManager$showBar$1> continuation) {
        super(2, continuation);
        this.$data = aVar;
        this.$activity = componentActivity;
        this.$action = aVar2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SnackBarManager$showBar$1 snackBarManager$showBar$1 = new SnackBarManager$showBar$1(this.$data, this.$activity, this.$action, continuation);
        snackBarManager$showBar$1.L$0 = obj;
        return snackBarManager$showBar$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$activity, this.$data, this.$action, BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, CoroutineStart.LAZY, new SnackBarManager$showBar$1$job$1(this.$data, null), 1, (Object) null), null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new SnackBarManager$showBar$1$invokeSuspend$$inlined$awaitCancel$1(null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
