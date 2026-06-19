package com.bilibili.ship.theseus.united.player.oldway;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/UnitedGeminiPlayerCommonActionDelegate$handleRightZoomAction$1$1$2.class */
public final class UnitedGeminiPlayerCommonActionDelegate$handleRightZoomAction$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final UnitedGeminiPlayerCommonActionDelegate this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate$handleRightZoomAction$1$1$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/UnitedGeminiPlayerCommonActionDelegate$handleRightZoomAction$1$1$2$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<Long, Long, Continuation<? super Pair<? extends Long, ? extends Long>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(long j7, long j8, Continuation<? super Pair<Long, Long>> continuation) {
            return UnitedGeminiPlayerCommonActionDelegate$handleRightZoomAction$1$1$2.invokeSuspend$lambda$0(j7, j8, continuation);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (Continuation<? super Pair<Long, Long>>) obj3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedGeminiPlayerCommonActionDelegate$handleRightZoomAction$1$1$2(UnitedGeminiPlayerCommonActionDelegate unitedGeminiPlayerCommonActionDelegate, Continuation<? super UnitedGeminiPlayerCommonActionDelegate$handleRightZoomAction$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = unitedGeminiPlayerCommonActionDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(long j7, long j8, Continuation continuation) {
        return new Pair(Boxing.boxLong(j7), Boxing.boxLong(j8));
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedGeminiPlayerCommonActionDelegate$handleRightZoomAction$1$1$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.united.page.view.a aVar = this.this$0.f104709e;
            Flow flowTake = FlowKt.take(FlowKt.combine(aVar.f104038c, aVar.f104042g, AnonymousClass3.INSTANCE), 2);
            this.label = 1;
            if (FlowKt.collect(flowTake, this) == coroutine_suspended) {
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
