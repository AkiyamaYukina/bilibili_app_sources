package com.bilibili.ship.theseus.cheese.biz.aioral;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/aioral/CheeseAiOralService$showPanel$2$2.class */
final class CheeseAiOralService$showPanel$2$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final b $component;
    int label;
    final CheeseAiOralService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAiOralService$showPanel$2$2(CheeseAiOralService cheeseAiOralService, b bVar, Continuation<? super CheeseAiOralService$showPanel$2$2> continuation) {
        super(1, continuation);
        this.this$0 = cheeseAiOralService;
        this.$component = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(b bVar, boolean z6) {
        return bVar.c();
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseAiOralService$showPanel$2$2(this.this$0, this.$component, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BackActionRepository backActionRepository = this.this$0.f89004e;
            final b bVar = this.$component;
            Function1<? super Boolean, Boolean> function1 = new Function1(bVar) { // from class: com.bilibili.ship.theseus.cheese.biz.aioral.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f89016a;

                {
                    this.f89016a = bVar;
                }

                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(CheeseAiOralService$showPanel$2$2.invokeSuspend$lambda$0(this.f89016a, ((Boolean) obj2).booleanValue()));
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
