package com.bilibili.pegasus.components.videomode;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/VideoModeGuidanceV2$show$8.class */
public final class VideoModeGuidanceV2$show$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $delay;
    int label;
    final VideoModeGuidanceV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoModeGuidanceV2$show$8(long j7, VideoModeGuidanceV2 videoModeGuidanceV2, Continuation<? super VideoModeGuidanceV2$show$8> continuation) {
        super(2, continuation);
        this.$delay = j7;
        this.this$0 = videoModeGuidanceV2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoModeGuidanceV2$show$8(this.$delay, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$delay;
            this.label = 1;
            if (DelayKt.delay(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.f77188e = null;
        BLog.i("[Pegasus]VideoModeGuidance", "dismiss by time out");
        this.this$0.a();
        return Unit.INSTANCE;
    }
}
