package com.bilibili.ship.theseus.ugc.intro.upcenter;

import com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterService$collectCurIndexStateFlow$1.class */
final class UgcUpCenterService$collectCurIndexStateFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UgcUpCenterService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterService$collectCurIndexStateFlow$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterService$collectCurIndexStateFlow$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int I$0;
        int label;
        final UgcUpCenterService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcUpCenterService ugcUpCenterService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcUpCenterService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i7, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i7 = this.I$0;
            UgcUpCenterService ugcUpCenterService = this.this$0;
            ugcUpCenterService.f97518m.tryEmit(UgcUpCenterUIComponent.b.a(ugcUpCenterService.c(), false, i7, false, null, UgcUpCenterUIComponent.AnimType.NONE, 0, 45));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpCenterService$collectCurIndexStateFlow$1(UgcUpCenterService ugcUpCenterService, Continuation<? super UgcUpCenterService$collectCurIndexStateFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = ugcUpCenterService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcUpCenterService$collectCurIndexStateFlow$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UgcUpCenterService ugcUpCenterService = this.this$0;
            StateFlow<Integer> stateFlow = ugcUpCenterService.f97517l;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcUpCenterService, null);
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
