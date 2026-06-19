package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$2.class */
public final class TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final m $uiComponent;
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$2(TheseusInteractVideoService theseusInteractVideoService, m mVar, Continuation<? super TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = theseusInteractVideoService;
        this.$uiComponent = mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(m mVar, boolean z6) {
        return mVar.c();
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$2(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BackActionRepository backActionRepository = this.this$0.f99898o;
            final m mVar = this.$uiComponent;
            Function1<? super Boolean, Boolean> function1 = new Function1(mVar) { // from class: com.bilibili.ship.theseus.united.page.interactvideo.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final m f100005a;

                {
                    this.f100005a = mVar;
                }

                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$2.invokeSuspend$lambda$0(this.f100005a, ((Boolean) obj2).booleanValue()));
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
