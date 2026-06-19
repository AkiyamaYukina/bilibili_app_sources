package com.bilibili.ogv.operation2.inlinevideo;

import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ogv.operation2.inlinevideo.OGVInlineHelper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OGVInlineHelper$startDelayAutoPlay$1.class */
public final class OGVInlineHelper$startDelayAutoPlay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OGVInlineHelper.b $pageReselectListener;
    final RecyclerView $recyclerView;
    final boolean $retry;
    final OGVInlineHelper.c $viewPagerStateChangeListener;
    int label;
    final OGVInlineHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OGVInlineHelper$startDelayAutoPlay$1(RecyclerView recyclerView, OGVInlineHelper.b bVar, OGVInlineHelper.c cVar, OGVInlineHelper oGVInlineHelper, boolean z6, Continuation<? super OGVInlineHelper$startDelayAutoPlay$1> continuation) {
        super(2, continuation);
        this.$recyclerView = recyclerView;
        this.$pageReselectListener = bVar;
        this.$viewPagerStateChangeListener = cVar;
        this.this$0 = oGVInlineHelper;
        this.$retry = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(OGVInlineHelper oGVInlineHelper) {
        oGVInlineHelper.l();
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OGVInlineHelper$startDelayAutoPlay$1(this.$recyclerView, this.$pageReselectListener, this.$viewPagerStateChangeListener, this.this$0, this.$retry, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        OGVInlineHelper.b bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        RecyclerView recyclerView = this.$recyclerView;
        if (recyclerView != null && recyclerView.isAttachedToWindow() && this.$recyclerView.getChildCount() > 0 && ((bVar = this.$pageReselectListener) == null || bVar.a())) {
            OGVInlineHelper.c cVar = this.$viewPagerStateChangeListener;
            if (cVar == null || cVar.a() == 0) {
                this.this$0.l();
            } else {
                OGVInlineHelper.c cVar2 = this.$viewPagerStateChangeListener;
                final OGVInlineHelper oGVInlineHelper = this.this$0;
                cVar2.b(new Function0(oGVInlineHelper) { // from class: com.bilibili.ogv.operation2.inlinevideo.w

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OGVInlineHelper f70981a;

                    {
                        this.f70981a = oGVInlineHelper;
                    }

                    public final Object invoke() {
                        return OGVInlineHelper$startDelayAutoPlay$1.invokeSuspend$lambda$0(this.f70981a);
                    }
                });
            }
        } else if (this.this$0.f70882a.getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && this.$retry) {
            this.this$0.j(this.$recyclerView, false, this.$pageReselectListener, this.$viewPagerStateChangeListener);
        }
        return Unit.INSTANCE;
    }
}
