package com.bilibili.ship.theseus.united.page.danmaku;

import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$collectUpdateInputViewState$1.class */
final class HalfScreenDanmakuInputService$collectUpdateInputViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final HalfScreenDanmakuInputService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$collectUpdateInputViewState$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$collectUpdateInputViewState$1$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<Boolean, DmViewReply, Continuation<? super Pair<? extends Boolean, ? extends DmViewReply>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Boolean) obj).booleanValue(), (DmViewReply) obj2, (Continuation<? super Pair<Boolean, DmViewReply>>) obj3);
        }

        public final Object invoke(boolean z6, DmViewReply dmViewReply, Continuation<? super Pair<Boolean, DmViewReply>> continuation) {
            return HalfScreenDanmakuInputService$collectUpdateInputViewState$1.invokeSuspend$lambda$0(z6, dmViewReply, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$collectUpdateInputViewState$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$collectUpdateInputViewState$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends DmViewReply>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(Pair<Boolean, DmViewReply> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$collectUpdateInputViewState$1.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalfScreenDanmakuInputService$collectUpdateInputViewState$1(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super HalfScreenDanmakuInputService$collectUpdateInputViewState$1> continuation) {
        super(2, continuation);
        this.this$0 = halfScreenDanmakuInputService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(boolean z6, DmViewReply dmViewReply, Continuation continuation) {
        return new Pair(Boxing.boxBoolean(z6), dmViewReply);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HalfScreenDanmakuInputService$collectUpdateInputViewState$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(halfScreenDanmakuInputService.f99459j.h, halfScreenDanmakuInputService.f99458i.f99379p, AnonymousClass3.INSTANCE));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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
