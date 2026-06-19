package com.bilibili.live.streaming.encoder.audio;

import android.media.MediaCodec;
import android.os.Build;
import com.bilibili.live.streaming.encoder.audio.BiliAudioEncoderOutput;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nh0.InterfaceC8094b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/audio/BiliAudioEncoderOutput$BiliAudioEncoder$start$$inlined$postAudioEncoderThread$1.class */
public final class BiliAudioEncoderOutput$BiliAudioEncoder$start$$inlined$postAudioEncoderThread$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BiliAudioEncoderOutput this$0;
    final BiliAudioEncoderOutput this$0$inline_fun;
    final BiliAudioEncoderOutput.BiliAudioEncoder this$1$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliAudioEncoderOutput$BiliAudioEncoder$start$$inlined$postAudioEncoderThread$1(BiliAudioEncoderOutput biliAudioEncoderOutput, Continuation continuation, BiliAudioEncoderOutput biliAudioEncoderOutput2, BiliAudioEncoderOutput.BiliAudioEncoder biliAudioEncoder) {
        super(2, continuation);
        this.this$0$inline_fun = biliAudioEncoderOutput;
        this.this$0 = biliAudioEncoderOutput2;
        this.this$1$inlined = biliAudioEncoder;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliAudioEncoderOutput$BiliAudioEncoder$start$$inlined$postAudioEncoderThread$1(this.this$0$inline_fun, continuation, this.this$0, this.this$1$inlined);
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
        if (this.this$0$inline_fun.mAudioEncoderScopeIsCancel) {
            return Unit.INSTANCE;
        }
        InterfaceC8094b.b(this.this$0, "start...., mIsEncoding:" + this.this$1$inlined.mIsEncoding.get(), null, 14);
        if (!this.this$1$inlined.mIsEncoding.get()) {
            MediaCodec mediaCodec = this.this$1$inlined.mEncoder;
            if (mediaCodec != null) {
                mediaCodec.start();
            }
            if (Build.VERSION.SDK_INT >= 33) {
                this.this$1$inlined.mIsEncoding.setRelease(true);
            } else {
                this.this$1$inlined.mIsEncoding.set(true);
            }
        }
        return Unit.INSTANCE;
    }
}
