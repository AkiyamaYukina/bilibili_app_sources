package com.bilibili.sistersplayer.p2p;

import com.bilibili.sistersplayer.hls.PlaylistItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$fragmentFinished$1$1.class */
public final class SistersPlayerLoader$fragmentFinished$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PlaylistItem $item;
    final long $startTime;
    final String $url;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final SistersPlayerLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SistersPlayerLoader$fragmentFinished$1$1(SistersPlayerLoader sistersPlayerLoader, String str, PlaylistItem playlistItem, long j7, Continuation<? super SistersPlayerLoader$fragmentFinished$1$1> continuation) {
        super(2, continuation);
        this.this$0 = sistersPlayerLoader;
        this.$url = str;
        this.$item = playlistItem;
        this.$startTime = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SistersPlayerLoader$fragmentFinished$1$1(this.this$0, this.$url, this.$item, this.$startTime, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Finally extract failed */
    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 3189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.SistersPlayerLoader$fragmentFinished$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
