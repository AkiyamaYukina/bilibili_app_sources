package com.bilibili.studio.videoeditor.extension;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/ContinuationExtKt$postMainSafeCallback$2.class */
final class ContinuationExtKt$postMainSafeCallback$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final Function0<Unit> $block;
    final String $tag;
    final CoroutineScope $this_postMainSafeCallback;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationExtKt$postMainSafeCallback$2(CoroutineScope coroutineScope, String str, Function0<Unit> function0, Continuation<? super ContinuationExtKt$postMainSafeCallback$2> continuation) {
        super(2, continuation);
        this.$this_postMainSafeCallback = coroutineScope;
        this.$tag = str;
        this.$block = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContinuationExtKt$postMainSafeCallback$2 continuationExtKt$postMainSafeCallback$2 = new ContinuationExtKt$postMainSafeCallback$2(this.$this_postMainSafeCallback, this.$tag, this.$block, continuation);
        continuationExtKt$postMainSafeCallback$2.L$0 = obj;
        return continuationExtKt$postMainSafeCallback$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Result result;
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (CoroutineScopeKt.isActive(this.$this_postMainSafeCallback)) {
            Function0<Unit> function0 = this.$block;
            try {
                Result.Companion companion = Result.Companion;
                function0.invoke();
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            String str = this.$tag;
            Throwable th2 = Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                M.b("call back fail message = ", th2.getMessage(), str);
            }
            result = Result.box-impl(obj2);
        } else {
            BLog.e(this.$tag, "call back fail CoroutineScope cancel");
            result = Unit.INSTANCE;
        }
        return result;
    }
}
