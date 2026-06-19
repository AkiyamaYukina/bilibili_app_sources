package com.bilibili.lib.projection.internal.widget;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/ProjectionControlDialog$observeDismissFlow$1.class */
final class ProjectionControlDialog$observeDismissFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final o this$0;

    /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.widget.ProjectionControlDialog$observeDismissFlow$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/ProjectionControlDialog$observeDismissFlow$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;
        final o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o oVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                o oVar = this.this$0;
                if (oVar.f64108e) {
                    oVar.f64108e = false;
                    View view = oVar.h;
                    if (view != null) {
                        oVar.b(view);
                    }
                    oVar.f64112j.dispose();
                    oVar.f64111i = null;
                    oVar.f64113k = null;
                    oVar.f64114l = null;
                    oVar.f64115m = null;
                    oVar.f64116n = null;
                    oVar.f64117o = null;
                    oVar.f64118p = null;
                    oVar.f64119q = null;
                    oVar.h = null;
                    oVar.f64110g = null;
                    Job job = oVar.f64107d;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    oVar.f64107d = null;
                    VV.d dVar = oVar.f64109f;
                    if (dVar != null) {
                        dVar.invoke();
                    }
                    oVar.f64109f = null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProjectionControlDialog$observeDismissFlow$1(o oVar, Continuation<? super ProjectionControlDialog$observeDismissFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProjectionControlDialog$observeDismissFlow$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            o oVar = this.this$0;
            MutableStateFlow<Boolean> mutableStateFlow = oVar.f64106c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(oVar, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
