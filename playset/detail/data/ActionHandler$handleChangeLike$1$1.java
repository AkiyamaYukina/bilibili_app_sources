package com.bilibili.playset.detail.data;

import com.bilibili.playset.detail.MultiTypeListDetailViewModel;
import com.bilibili.pvtracker.PageViewTracker;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handleChangeLike$1$1.class */
final class ActionHandler$handleChangeLike$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $mid;
    final h $state;
    final boolean $thumbUp;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionHandler$handleChangeLike$1$1(b bVar, h hVar, boolean z6, long j7, Continuation<? super ActionHandler$handleChangeLike$1$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$state = hVar;
        this.$thumbUp = z6;
        this.$mid = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActionHandler$handleChangeLike$1$1(this.this$0, this.$state, this.$thumbUp, this.$mid, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MultiTypeListDetailViewModel multiTypeListDetailViewModel = this.this$0.f84456c;
            if (multiTypeListDetailViewModel != null) {
                long j7 = this.$state.f84513a;
                int i8 = !this.$thumbUp ? 1 : 2;
                long j8 = this.$mid;
                String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
                this.label = 1;
                Object objQ0 = multiTypeListDetailViewModel.Q0(j7, i8, j8, "playlist.playlist-detail.0.0", "playlist.playlist-video-detail.0.0", strCurrentPolarisActionId, this);
                if (objQ0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objQ0 = Unit.INSTANCE;
                }
                if (objQ0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
