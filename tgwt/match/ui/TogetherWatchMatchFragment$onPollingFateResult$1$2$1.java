package com.bilibili.tgwt.match.ui;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.tgwt.chatroom.FateMatchVo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment$onPollingFateResult$1$2$1.class */
public final class TogetherWatchMatchFragment$onPollingFateResult$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FateMatchVo $fateMatchVo;
    int label;
    final TogetherWatchMatchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchMatchFragment$onPollingFateResult$1$2$1(FateMatchVo fateMatchVo, TogetherWatchMatchFragment togetherWatchMatchFragment, Continuation<? super TogetherWatchMatchFragment$onPollingFateResult$1$2$1> continuation) {
        super(2, continuation);
        this.$fateMatchVo = fateMatchVo;
        this.this$0 = togetherWatchMatchFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchMatchFragment$onPollingFateResult$1$2$1(this.$fateMatchVo, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(this.$fateMatchVo.a() * ((long) 1000), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        TogetherWatchMatchFragment togetherWatchMatchFragment = this.this$0;
        FateMatchVo fateMatchVo = togetherWatchMatchFragment.f111490o;
        if (fateMatchVo != null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$onPollingFateResult$1(togetherWatchMatchFragment, fateMatchVo, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
