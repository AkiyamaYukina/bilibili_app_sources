package com.bilibili.ship.theseus.united.page;

import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ReloadOnAccountInfoChangeService$reloadRequestFlow$4.class */
public final class ReloadOnAccountInfoChangeService$reloadRequestFlow$4 extends SuspendLambda implements Function2<Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>, Continuation<? super Unit>, Object> {
    int label;
    final ReloadOnAccountInfoChangeService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ReloadOnAccountInfoChangeService$reloadRequestFlow$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ReloadOnAccountInfoChangeService$reloadRequestFlow$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        boolean Z$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!this.Z$0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReloadOnAccountInfoChangeService$reloadRequestFlow$4(ReloadOnAccountInfoChangeService reloadOnAccountInfoChangeService, Continuation<? super ReloadOnAccountInfoChangeService$reloadRequestFlow$4> continuation) {
        super(2, continuation);
        this.this$0 = reloadOnAccountInfoChangeService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReloadOnAccountInfoChangeService$reloadRequestFlow$4(this.this$0, continuation);
    }

    public final Object invoke(Triple<Boolean, Boolean, Boolean> triple, Continuation<? super Unit> continuation) {
        return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<Boolean> mutableStateFlow = this.this$0.f98797a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (FlowKt.first(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
