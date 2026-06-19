package com.bilibili.ship.theseus.united.page.story;

import androidx.lifecycle.Lifecycle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$6.class */
final class StoryTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$6 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;

    public StoryTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$6(Continuation<? super StoryTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$6> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StoryTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$6 storyTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$6 = new StoryTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$6(continuation);
        storyTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$6.L$0 = obj;
        return storyTransitionAnimService$expandPlayingContainerToFullScreenAndKeep$6;
    }

    public final Object invoke(Lifecycle.Event event, Continuation<? super Boolean> continuation) {
        return create(event, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(((Lifecycle.Event) this.L$0) == Lifecycle.Event.ON_STOP);
    }
}
