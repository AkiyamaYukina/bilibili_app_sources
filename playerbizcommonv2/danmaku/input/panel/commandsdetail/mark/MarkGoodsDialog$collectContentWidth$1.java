package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark;

import androidx.fragment.app.FragmentActivity;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/mark/MarkGoodsDialog$collectContentWidth$1.class */
final class MarkGoodsDialog$collectContentWidth$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $activity;
    final Ref.ObjectRef<WindowSizeClass> $windowSize;
    int label;
    final MarkGoodsDialog this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.MarkGoodsDialog$collectContentWidth$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/mark/MarkGoodsDialog$collectContentWidth$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<WindowSizeClass> $windowSize;
        Object L$0;
        int label;
        final MarkGoodsDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<WindowSizeClass> objectRef, MarkGoodsDialog markGoodsDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$windowSize = objectRef;
            this.this$0 = markGoodsDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowSize, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
            return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
            if (!Intrinsics.areEqual(this.$windowSize.element, windowSizeClass)) {
                this.$windowSize.element = windowSizeClass;
                this.this$0.hf(windowSizeClass);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkGoodsDialog$collectContentWidth$1(FragmentActivity fragmentActivity, Ref.ObjectRef<WindowSizeClass> objectRef, MarkGoodsDialog markGoodsDialog, Continuation<? super MarkGoodsDialog$collectContentWidth$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$windowSize = objectRef;
        this.this$0 = markGoodsDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarkGoodsDialog$collectContentWidth$1(this.$activity, this.$windowSize, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.$activity);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowSize, this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowWindowSizeFlow, anonymousClass1, this) == coroutine_suspended) {
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
