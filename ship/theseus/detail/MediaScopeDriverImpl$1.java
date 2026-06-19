package com.bilibili.ship.theseus.detail;

import com.bilibili.ship.theseus.detail.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/MediaScopeDriverImpl$1.class */
final class MediaScopeDriverImpl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.MediaScopeDriverImpl$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/MediaScopeDriverImpl$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                c.a aVar = (c.a) this.L$0;
                if (Intrinsics.areEqual(aVar, c.a.C0671a.f90882a)) {
                    BLog.i("MediaScopeDriverImpl$1$1-invokeSuspend", "[theseus-detail-MediaScopeDriverImpl$1$1-invokeSuspend] media scope change state to idle");
                } else if (aVar instanceof c.a.C0672c) {
                    BLog.i("MediaScopeDriverImpl$1$1-invokeSuspend", "[theseus-detail-MediaScopeDriverImpl$1$1-invokeSuspend] media scope change state to loading");
                } else {
                    if (!(aVar instanceof c.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c cVar = this.this$0;
                    this.label = 1;
                    cVar.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new MediaScopeDriverImpl$driveMediaScope$2((c.a.b) aVar, cVar, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
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
    public MediaScopeDriverImpl$1(c cVar, Continuation<? super MediaScopeDriverImpl$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaScopeDriverImpl$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            c cVar = this.this$0;
            MutableStateFlow<c.a> mutableStateFlow = cVar.h;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, null);
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
