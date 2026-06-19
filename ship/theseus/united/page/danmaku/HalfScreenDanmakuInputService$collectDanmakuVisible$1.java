package com.bilibili.ship.theseus.united.page.danmaku;

import com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$collectDanmakuVisible$1.class */
final class HalfScreenDanmakuInputService$collectDanmakuVisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final HalfScreenDanmakuInputService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$collectDanmakuVisible$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$collectDanmakuVisible$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        Object L$0;
        boolean Z$0;
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
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
            HalfScreenDanmakuInputService.c cVarD;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                cVarD = this.this$0.d();
                if (cVarD != null) {
                    this.this$0.g(HalfScreenDanmakuInputService.c.a(cVarD, null, z6, true, 7));
                    return Unit.INSTANCE;
                }
                MutableStateFlow<HalfScreenDanmakuInputService.c> mutableStateFlow = this.this$0.f99439A;
                this.L$0 = cVarD;
                this.label = 1;
                obj = FlowKt.first(mutableStateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVarD = (HalfScreenDanmakuInputService.c) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (Intrinsics.areEqual(obj, cVarD)) {
                HalfScreenDanmakuInputService.b(this.this$0);
            } else {
                defpackage.a.b("[theseus-united-HalfScreenDanmakuInputService$collectDanmakuVisible$1$1-invokeSuspend] ", "danmaku visible state changed but input state is unavailable, state = " + cVarD, "HalfScreenDanmakuInputService$collectDanmakuVisible$1$1-invokeSuspend");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalfScreenDanmakuInputService$collectDanmakuVisible$1(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super HalfScreenDanmakuInputService$collectDanmakuVisible$1> continuation) {
        super(2, continuation);
        this.this$0 = halfScreenDanmakuInputService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HalfScreenDanmakuInputService$collectDanmakuVisible$1(this.this$0, continuation);
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
            StateFlow<Boolean> stateFlow = halfScreenDanmakuInputService.f99458i.f99384u;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(halfScreenDanmakuInputService, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
