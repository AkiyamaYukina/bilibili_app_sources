package com.bilibili.ship.theseus.united.page.comment;

import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.ship.theseus.keel.player.j;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$kntrFragment$3$seek$2.class */
final class TheseusCommentService$createNewState$kntrFragment$3$seek$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $position;
    int label;
    final TheseusCommentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$createNewState$kntrFragment$3$seek$2(TheseusCommentService theseusCommentService, long j7, Continuation<? super TheseusCommentService$createNewState$kntrFragment$3$seek$2> continuation) {
        super(2, continuation);
        this.this$0 = theseusCommentService;
        this.$position = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusCommentService$createNewState$kntrFragment$3$seek$2(this.this$0, this.$position, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        WithVideoProgress withVideoProgressP;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.f99234f.p();
            j jVarJ = this.this$0.f99234f.j();
            if (jVarJ != null && (withVideoProgressP = jVarJ.p()) != null) {
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(this.$position, DurationUnit.MILLISECONDS);
                this.label = 1;
                Object objC = withVideoProgressP.c(duration, false, this);
                obj = objC;
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
