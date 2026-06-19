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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handleChangeFav$3.class */
final class ActionHandler$handleChangeFav$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final h $state;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionHandler$handleChangeFav$3(b bVar, h hVar, Continuation<? super ActionHandler$handleChangeFav$3> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$state = hVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActionHandler$handleChangeFav$3(this.this$0, this.$state, continuation);
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
                String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
                this.label = 1;
                Object objO0 = multiTypeListDetailViewModel.O0(j7, "playlist.playlist-detail.0.0", "playlist.playlist-video-detail.0.0", strCurrentPolarisActionId, this);
                if (objO0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objO0 = Unit.INSTANCE;
                }
                if (objO0 == coroutine_suspended) {
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
