package com.bilibili.studio.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/MediaFileReader$mediaFlow$1.class */
public final class MediaFileReader$mediaFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super d>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    int I$6;
    int I$7;
    int I$8;
    private Object L$0;
    Object L$1;
    int label;
    final MediaFileReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaFileReader$mediaFlow$1(MediaFileReader mediaFileReader, Continuation<? super MediaFileReader$mediaFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaFileReader;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaFileReader$mediaFlow$1 mediaFileReader$mediaFlow$1 = new MediaFileReader$mediaFlow$1(this.this$0, continuation);
        mediaFileReader$mediaFlow$1.L$0 = obj;
        return mediaFileReader$mediaFlow$1;
    }

    public final Object invoke(FlowCollector<? super d> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Path cross not found for [B:50:0x0415, B:48:0x0409], limit reached: 122 */
    /* JADX WARN: Path cross not found for [B:84:0x04ed, B:110:0x064a], limit reached: 122 */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0415  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0656 -> B:113:0x066e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 1760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.media.MediaFileReader$mediaFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
