package com.bilibili.sistersplayer.hls;

import com.bilibili.sistersplayer.hls.model.HLSStreamInf;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$updateTargetPlaylist$1$1$1$1.class */
public final class Hls7Player$updateTargetPlaylist$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final HLSStreamInf $streamInf;
    final BasicM3u8Parser $subParser;
    int label;
    final Hls7Player this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hls7Player$updateTargetPlaylist$1$1$1$1(Hls7Player hls7Player, HLSStreamInf hLSStreamInf, BasicM3u8Parser basicM3u8Parser, Continuation<? super Hls7Player$updateTargetPlaylist$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = hls7Player;
        this.$streamInf = hLSStreamInf;
        this.$subParser = basicM3u8Parser;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Hls7Player$updateTargetPlaylist$1$1$1$1(this.this$0, this.$streamInf, this.$subParser, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m3u8Parser.switchToNextPlaylist(this.$streamInf, this.$subParser, this.this$0.seekSwitch, this.this$0.pickSeq);
        return Unit.INSTANCE;
    }
}
