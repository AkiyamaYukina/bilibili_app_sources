package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandiseService$showMerchandisePanel$2$2.class */
final class MerchandiseService$showMerchandisePanel$2$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final MerchandiseService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchandiseService$showMerchandisePanel$2$2(MerchandiseService merchandiseService, Continuation<? super MerchandiseService$showMerchandisePanel$2$2> continuation) {
        super(1, continuation);
        this.this$0 = merchandiseService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(MerchandiseService merchandiseService, boolean z6) {
        return ((f) merchandiseService.f100565p.getValue()).c();
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MerchandiseService$showMerchandisePanel$2$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final MerchandiseService merchandiseService = this.this$0;
            BackActionRepository backActionRepository = merchandiseService.f100555e;
            Function1<? super Boolean, Boolean> function1 = new Function1(merchandiseService) { // from class: com.bilibili.ship.theseus.united.page.intro.module.merchandise.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MerchandiseService f100591a;

                {
                    this.f100591a = merchandiseService;
                }

                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(MerchandiseService$showMerchandisePanel$2$2.invokeSuspend$lambda$0(this.f100591a, ((Boolean) obj2).booleanValue()));
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
