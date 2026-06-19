package com.bilibili.ship.theseus.detail.di;

import android.os.SystemClock;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/TheseusLayoutBackedModule$initContentView$1$1.class */
final class TheseusLayoutBackedModule$initContentView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ViewGroup $content;
    final com.bilibili.ship.theseus.united.page.performance.a $performanceTracker;
    int label;
    final C6143c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusLayoutBackedModule$initContentView$1$1(ViewGroup viewGroup, com.bilibili.ship.theseus.united.page.performance.a aVar, C6143c c6143c, Continuation<? super TheseusLayoutBackedModule$initContentView$1$1> continuation) {
        super(2, continuation);
        this.$content = viewGroup;
        this.$performanceTracker = aVar;
        this.this$0 = c6143c;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusLayoutBackedModule$initContentView$1$1(this.$content, this.$performanceTracker, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ViewGroup viewGroup = this.$content;
            this.label = 1;
            if (com.bilibili.ship.theseus.united.utils.v.a(viewGroup, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$performanceTracker.b(PerformanceTracerImpl.Entry.ON_VIEW_TREE_LAYOUT.attach(SystemClock.elapsedRealtime()));
        this.$performanceTracker.a(com.bilibili.ship.theseus.united.page.screensize.b.e(this.this$0.f91007d), "contentViewType");
        return Unit.INSTANCE;
    }
}
