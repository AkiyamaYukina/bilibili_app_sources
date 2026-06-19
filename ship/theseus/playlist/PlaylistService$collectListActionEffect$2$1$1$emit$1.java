package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.PlaylistService$collectListActionEffect$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectListActionEffect$2$1$1$emit$1.class */
public final class PlaylistService$collectListActionEffect$2$1$1$emit$1 extends ContinuationImpl {
    int label;
    Object result;
    final PlaylistService$collectListActionEffect$2.AnonymousClass1.C07701<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlaylistService$collectListActionEffect$2$1$1$emit$1(PlaylistService$collectListActionEffect$2.AnonymousClass1.C07701<? super T> c07701, Continuation<? super PlaylistService$collectListActionEffect$2$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c07701;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, (Continuation<? super Unit>) this);
    }
}
