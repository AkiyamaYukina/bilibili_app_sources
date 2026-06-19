package com.bilibili.playset.detail.data;

import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.detail.data.g;
import com.bilibili.playset.detail.data.l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handlePlaylistBatchManager$1.class */
final class ActionHandler$handlePlaylistBatchManager$1 extends SuspendLambda implements Function1<Continuation<? super g>, Object> {
    final h $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionHandler$handlePlaylistBatchManager$1(h hVar, Continuation<? super ActionHandler$handlePlaylistBatchManager$1> continuation) {
        super(1, continuation);
        this.$state = hVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ActionHandler$handlePlaylistBatchManager$1(this.$state, continuation);
    }

    public final Object invoke(Continuation<? super g> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        h hVar = this.$state;
        long j7 = hVar.f84513a;
        MultitypePlaylist.Info info = hVar.f84517e;
        String str = info.title;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return new g.b(new l.a(j7, str2, info.attr, info.mediaCount));
    }
}
