package com.bilibili.playerbizcommon.features.gif;

import com.bilibili.lib.media.resource.MediaResource;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/GifPlayerContext$defaultMediaResourceResolver$1$1$1.class */
public final class GifPlayerContext$defaultMediaResourceResolver$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<MediaResource, Unit> $func;
    final MediaResource $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifPlayerContext$defaultMediaResourceResolver$1$1$1(Function1<? super MediaResource, Unit> function1, MediaResource mediaResource, Continuation<? super GifPlayerContext$defaultMediaResourceResolver$1$1$1> continuation) {
        super(2, continuation);
        this.$func = function1;
        this.$it = mediaResource;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GifPlayerContext$defaultMediaResourceResolver$1$1$1(this.$func, this.$it, continuation);
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
        BLog.i("GifPlayerContext", "gif resolver is success");
        this.$func.invoke(this.$it);
        return Unit.INSTANCE;
    }
}
