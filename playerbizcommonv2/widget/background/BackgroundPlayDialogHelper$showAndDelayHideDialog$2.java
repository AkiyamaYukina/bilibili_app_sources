package com.bilibili.playerbizcommonv2.widget.background;

import android.util.Log;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.playerbizcommonv2.widget.background.BackgroundPlayDialogHelper$showAndDelayHideDialog$2;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/BackgroundPlayDialogHelper$showAndDelayHideDialog$2.class */
final class BackgroundPlayDialogHelper$showAndDelayHideDialog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function3<RunningUIComponent, Function0<Unit>, Continuation<? super Unit>, Object> $keepEnforceDialogShowing;
    private Object L$0;
    int label;
    final g this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.background.BackgroundPlayDialogHelper$showAndDelayHideDialog$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/BackgroundPlayDialogHelper$showAndDelayHideDialog$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function3<RunningUIComponent, Function0<Unit>, Continuation<? super Unit>, Object> $keepEnforceDialogShowing;
        int label;
        final g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g gVar, Function3<? super RunningUIComponent, ? super Function0<Unit>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = gVar;
            this.$keepEnforceDialogShowing = function3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(g gVar) {
            Job job = gVar.h;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$keepEnforceDialogShowing, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                g gVar = this.this$0;
                boolean z6 = g.f82315k;
                RunningUIComponent runningUIComponent = new RunningUIComponent((c) gVar.f82330j.getValue(), 0, (Function1) null, 6);
                Function3<RunningUIComponent, Function0<Unit>, Continuation<? super Unit>, Object> function3 = this.$keepEnforceDialogShowing;
                final g gVar2 = this.this$0;
                Function0 function0 = new Function0(gVar2) { // from class: com.bilibili.playerbizcommonv2.widget.background.k

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final g f82337a;

                    {
                        this.f82337a = gVar2;
                    }

                    public final Object invoke() {
                        return BackgroundPlayDialogHelper$showAndDelayHideDialog$2.AnonymousClass1.invokeSuspend$lambda$0(this.f82337a);
                    }
                };
                this.label = 1;
                if (function3.invoke(runningUIComponent, function0, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.background.BackgroundPlayDialogHelper$showAndDelayHideDialog$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/BackgroundPlayDialogHelper$showAndDelayHideDialog$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g gVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = gVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.f82323b.invoke(Boxing.boxBoolean(true));
            Job job = this.this$0.f82328g;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayDialogHelper$showAndDelayHideDialog$2(g gVar, Function3<? super RunningUIComponent, ? super Function0<Unit>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super BackgroundPlayDialogHelper$showAndDelayHideDialog$2> continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$keepEnforceDialogShowing = function3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackgroundPlayDialogHelper$showAndDelayHideDialog$2 backgroundPlayDialogHelper$showAndDelayHideDialog$2 = new BackgroundPlayDialogHelper$showAndDelayHideDialog$2(this.this$0, this.$keepEnforceDialogShowing, continuation);
        backgroundPlayDialogHelper$showAndDelayHideDialog$2.L$0 = obj;
        return backgroundPlayDialogHelper$showAndDelayHideDialog$2;
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
        Log.i("BackgroundPlayDialogHelper$showAndDelayHideDialog$2-invokeSuspend", "[playerbizcommonv2-BackgroundPlayDialogHelper$showAndDelayHideDialog$2-invokeSuspend] show enforce background play dialog");
        Job job = this.this$0.f82328g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        g gVar = this.this$0;
        gVar.f82328g = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(gVar, this.$keepEnforceDialogShowing, null), 3, (Object) null);
        Job job2 = this.this$0.h;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        g gVar2 = this.this$0;
        gVar2.h = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(gVar2, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
