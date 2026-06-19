package com.bilibili.ship.theseus.united.page.intro.module.upreserve;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageService$createUpReservePanel$1$3$2.class */
public final class UpReserveManageService$createUpReservePanel$1$3$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<k> $uiComponent;
    int label;
    final j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpReserveManageService$createUpReservePanel$1$3$2(j jVar, Ref.ObjectRef<k> objectRef, Continuation<? super UpReserveManageService$createUpReservePanel$1$3$2> continuation) {
        super(1, continuation);
        this.this$0 = jVar;
        this.$uiComponent = objectRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Ref.ObjectRef objectRef, boolean z6) {
        return ((k) objectRef.element).c();
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UpReserveManageService$createUpReservePanel$1$3$2(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BackActionRepository backActionRepository = this.this$0.f101997b;
            final Ref.ObjectRef<k> objectRef = this.$uiComponent;
            Function1<? super Boolean, Boolean> function1 = new Function1(objectRef) { // from class: com.bilibili.ship.theseus.united.page.intro.module.upreserve.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.ObjectRef f101995a;

                {
                    this.f101995a = objectRef;
                }

                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(UpReserveManageService$createUpReservePanel$1$3$2.invokeSuspend$lambda$0(this.f101995a, ((Boolean) obj2).booleanValue()));
                }
            };
            this.label = 1;
            if (backActionRepository.b(function1, this) == coroutine_suspended) {
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
