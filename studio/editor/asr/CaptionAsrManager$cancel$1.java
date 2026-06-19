package com.bilibili.studio.editor.asr;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/CaptionAsrManager$cancel$1.class */
public final class CaptionAsrManager$cancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CaptionAsrManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionAsrManager$cancel$1(CaptionAsrManager captionAsrManager, Continuation<? super CaptionAsrManager$cancel$1> continuation) {
        super(2, continuation);
        this.this$0 = captionAsrManager;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptionAsrManager$cancel$1(this.this$0, continuation);
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
        this.this$0.f105511a.a();
        return Unit.INSTANCE;
    }
}
