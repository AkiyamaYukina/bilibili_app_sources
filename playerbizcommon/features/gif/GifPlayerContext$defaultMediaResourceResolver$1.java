package com.bilibili.playerbizcommon.features.gif;

import com.bilibili.lib.media.resource.MediaResource;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import tv.danmaku.biliplayerv2.service.resolve.NormalMediaResourceResolveTask;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/GifPlayerContext$defaultMediaResourceResolver$1.class */
final class GifPlayerContext$defaultMediaResourceResolver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<MediaResource, Unit> $func;
    final NormalMediaResourceResolveTask $mediaResourceResolveTask;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifPlayerContext$defaultMediaResourceResolver$1(NormalMediaResourceResolveTask normalMediaResourceResolveTask, Function1<? super MediaResource, Unit> function1, Continuation<? super GifPlayerContext$defaultMediaResourceResolver$1> continuation) {
        super(2, continuation);
        this.$mediaResourceResolveTask = normalMediaResourceResolveTask;
        this.$func = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GifPlayerContext$defaultMediaResourceResolver$1(this.$mediaResourceResolveTask, this.$func, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.$mediaResourceResolveTask.run();
            MediaResource result = this.$mediaResourceResolveTask.getResult();
            if (result != null) {
                Function1<MediaResource, Unit> function1 = this.$func;
                MainCoroutineDispatcher main = Dispatchers.getMain();
                GifPlayerContext$defaultMediaResourceResolver$1$1$1 gifPlayerContext$defaultMediaResourceResolver$1$1$1 = new GifPlayerContext$defaultMediaResourceResolver$1$1$1(function1, result, null);
                this.label = 1;
                if (BuildersKt.withContext(main, gifPlayerContext$defaultMediaResourceResolver$1$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
