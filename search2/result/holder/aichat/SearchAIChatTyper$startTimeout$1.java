package com.bilibili.search2.result.holder.aichat;

import R9.v;
import java.util.concurrent.CancellationException;
import kntr.app.search.aicard.redux.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatTyper$startTimeout$1.class */
final class SearchAIChatTyper$startTimeout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAIChatTyper$startTimeout$1(l lVar, Continuation<? super SearchAIChatTyper$startTimeout$1> continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchAIChatTyper$startTimeout$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(this.this$0.f87803g, DurationUnit.SECONDS);
            this.label = 1;
            if (DelayKt.delay-VtjQ1oo(duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Job job = this.this$0.f87804i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        v.a("timeout sid=", this.this$0.f87797a, "[Search]SearchAIChatTyper");
        this.this$0.f87801e.a.b().a(c.f.a);
        return Unit.INSTANCE;
    }
}
