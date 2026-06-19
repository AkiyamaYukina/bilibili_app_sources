package com.bilibili.live.streaming.encoder.video;

import android.media.MediaCodec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/video/i.class */
public final /* synthetic */ class i implements Function3 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return VideoEncoderV2.signalEndOfInputStream$lambda$1((MediaCodec) obj, ((Integer) obj2).intValue(), (Function0) obj3);
    }
}
