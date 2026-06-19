package com.bilibili.mediastreaming.audio.track;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioTrack$doGetAudioLevel$1.class */
final class BiliAudioTrack$doGetAudioLevel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $callbackMs;
    int label;
    final BiliAudioTrack this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliAudioTrack$doGetAudioLevel$1(BiliAudioTrack biliAudioTrack, long j7, Continuation<? super BiliAudioTrack$doGetAudioLevel$1> continuation) {
        super(2, continuation);
        this.this$0 = biliAudioTrack;
        this.$callbackMs = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliAudioTrack$doGetAudioLevel$1(this.this$0, this.$callbackMs, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004a -> B:16:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L24
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L50
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
        L28:
            r0 = r4
            com.bilibili.mediastreaming.audio.track.BiliAudioTrack r0 = r0.this$0
            boolean r0 = com.bilibili.mediastreaming.audio.track.BiliAudioTrack.access$getDoGetAudioLevel$p(r0)
            if (r0 == 0) goto L5e
            r0 = r4
            com.bilibili.mediastreaming.audio.track.BiliAudioTrack r0 = r0.this$0
            com.bilibili.mediastreaming.audio.track.BiliAudioTrack.access$getLRLevelFullRange(r0)
            r0 = r4
            long r0 = r0.$callbackMs
            r7 = r0
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r4
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r9
            if (r0 != r1) goto L50
            r0 = r9
            return r0
        L50:
            r0 = r4
            com.bilibili.mediastreaming.audio.track.BiliAudioTrack r0 = r0.this$0
            boolean r0 = com.bilibili.mediastreaming.audio.track.BiliAudioTrack.access$getDoGetAudioLevel$p(r0)
            if (r0 != 0) goto L28
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L5e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mediastreaming.audio.track.BiliAudioTrack$doGetAudioLevel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
