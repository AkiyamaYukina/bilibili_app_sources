package com.bilibili.studio.videoeditor.loader;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/VideoDurationCache$asyncLoadDuration$1.class */
public final class VideoDurationCache$asyncLoadDuration$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $path;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDurationCache$asyncLoadDuration$1(String str, Continuation<? super VideoDurationCache$asyncLoadDuration$1> continuation) {
        super(2, continuation);
        this.$path = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoDurationCache$asyncLoadDuration$1(this.$path, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d7 -> B:26:0x00c9). Please report as a decompilation issue!!! */
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    VideoDurationCache videoDurationCache = VideoDurationCache.f109773a;
                    String str = this.$path;
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    obj = VideoDurationCache.a(videoDurationCache, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jCurrentTimeMillis = this.J$0;
                    ResultKt.throwOnFailure(obj);
                }
                long jLongValue = ((Number) obj).longValue();
                if (jLongValue > 0) {
                    VideoDurationCache.f109774b.put(this.$path, Boxing.boxLong(jLongValue));
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                BLog.d("VideoDurationCache", "async load duration end: " + this.$path + ", duration=" + jLongValue + ", cost=" + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms");
            } catch (Exception e7) {
                BLog.w("VideoDurationCache", "async load duration failed: " + this.$path + ", error=" + e7.getMessage());
            }
            VideoDurationCache.f109775c.remove(this.$path);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            VideoDurationCache.f109775c.remove(this.$path);
            throw th;
        }
    }
}
