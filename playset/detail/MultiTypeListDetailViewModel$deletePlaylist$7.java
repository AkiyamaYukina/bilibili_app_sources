package com.bilibili.playset.detail;

import com.bilibili.playset.detail.data.g;
import com.bilibili.playset.detail.data.r;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$deletePlaylist$7.class */
final class MultiTypeListDetailViewModel$deletePlaylist$7 extends SuspendLambda implements Function1<Continuation<? super com.bilibili.playset.detail.data.g>, Object> {
    final long $playlistId;
    int label;
    final MultiTypeListDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailViewModel$deletePlaylist$7(long j7, MultiTypeListDetailViewModel multiTypeListDetailViewModel, Continuation<? super MultiTypeListDetailViewModel$deletePlaylist$7> continuation) {
        super(1, continuation);
        this.$playlistId = j7;
        this.this$0 = multiTypeListDetailViewModel;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MultiTypeListDetailViewModel$deletePlaylist$7(this.$playlistId, this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super com.bilibili.playset.detail.data.g> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new g.i(new r.d(this.$playlistId, false, ((com.bilibili.playset.detail.data.h) this.this$0.getState().getValue()).f84531t));
    }
}
