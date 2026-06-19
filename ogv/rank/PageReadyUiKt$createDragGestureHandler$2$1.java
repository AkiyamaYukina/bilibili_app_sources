package com.bilibili.ogv.rank;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/PageReadyUiKt$createDragGestureHandler$2$1.class */
final class PageReadyUiKt$createDragGestureHandler$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableFloatState $dragState;
    final TopAppBarScrollBehavior $scrollBehavior;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageReadyUiKt$createDragGestureHandler$2$1(MutableFloatState mutableFloatState, TopAppBarScrollBehavior topAppBarScrollBehavior, Continuation<? super PageReadyUiKt$createDragGestureHandler$2$1> continuation) {
        super(2, continuation);
        this.$dragState = mutableFloatState;
        this.$scrollBehavior = topAppBarScrollBehavior;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageReadyUiKt$createDragGestureHandler$2$1(this.$dragState, this.$scrollBehavior, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long jVelocity = VelocityKt.Velocity(0.0f, this.$dragState.getFloatValue() * 2.0f);
            NestedScrollConnection nestedScrollConnection = this.$scrollBehavior.getNestedScrollConnection();
            long jM4047getZero9UxMQ8M = Velocity.Companion.m4047getZero9UxMQ8M();
            this.J$0 = jVelocity;
            this.label = 1;
            if (nestedScrollConnection.mo1278onPostFlingRZ2iAVY(jM4047getZero9UxMQ8M, jVelocity, this) == coroutine_suspended) {
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
