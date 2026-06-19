package com.bilibili.tgwt.watermark;

import com.bilibili.bangumi.ui.page.detail.playerV2.playerservice.PGCPlayerProgressService2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/PlayerWatermarkService$1.class */
final class PlayerWatermarkService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.tgwt.watermark.PlayerWatermarkService$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/PlayerWatermarkService$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
        long J$0;
        int label;
        final b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.J$0 = ((Number) obj).longValue();
            return anonymousClass1;
        }

        public final Object invoke(long j7, Continuation<? super Unit> continuation) {
            return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                long j7 = this.J$0;
                if (1 <= j7 && j7 < 5000) {
                    b bVar = this.this$0;
                    this.label = 1;
                    bVar.getClass();
                    IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
                    layoutParams.setLayoutType(8);
                    layoutParams.setExitAnim(-1);
                    layoutParams.setEnterAnim(-1);
                    layoutParams.setFunctionType(0);
                    layoutParams.touchEnable(false);
                    layoutParams.touchOutsideDismiss(false);
                    Object objRetainFunctionWidget$default = IFunctionWidgetServiceKt.retainFunctionWidget$default(bVar.f112314f.a.c(), (AbsFunctionWidget) bVar.f112312d.get(), layoutParams, (Function1) null, this, 4, (Object) null);
                    if (objRetainFunctionWidget$default != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objRetainFunctionWidget$default = Unit.INSTANCE;
                    }
                    if (objRetainFunctionWidget$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerWatermarkService$1(b bVar, Continuation<? super PlayerWatermarkService$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerWatermarkService$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flow = this.this$0.f112309a.getPlayerServiceController().a.b(PGCPlayerProgressService2.class).getService().b;
            Flow flow2 = flow;
            if (flow == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressFlow");
                flow2 = null;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow2, anonymousClass1, this) == coroutine_suspended) {
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
