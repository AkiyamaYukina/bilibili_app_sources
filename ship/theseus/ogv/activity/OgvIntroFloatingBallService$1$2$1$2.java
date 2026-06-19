package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.united.page.intro.IntroFloatingViewService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvIntroFloatingBallService$1$2$1$2.class */
public final class OgvIntroFloatingBallService$1$2$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final CompletableDeferred<Unit> $closeDeferred;
    final RunningUIComponent $runningUIComponent;
    int label;
    final OgvIntroFloatingBallService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvIntroFloatingBallService$1$2$1$2(OgvIntroFloatingBallService ogvIntroFloatingBallService, RunningUIComponent runningUIComponent, CompletableDeferred<Unit> completableDeferred, Continuation<? super OgvIntroFloatingBallService$1$2$1$2> continuation) {
        super(1, continuation);
        this.this$0 = ogvIntroFloatingBallService;
        this.$runningUIComponent = runningUIComponent;
        this.$closeDeferred = completableDeferred;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvIntroFloatingBallService$1$2$1$2(this.this$0, this.$runningUIComponent, this.$closeDeferred, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IntroFloatingViewService introFloatingViewService = this.this$0.f91433c;
                introFloatingViewService.f100034b.setValue(this.$runningUIComponent.a);
                CompletableDeferred<Unit> completableDeferred = this.$closeDeferred;
                this.label = 1;
                if (completableDeferred.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.f91433c.f100034b.setValue((Object) null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.f91433c.f100034b.setValue((Object) null);
            throw th;
        }
    }
}
