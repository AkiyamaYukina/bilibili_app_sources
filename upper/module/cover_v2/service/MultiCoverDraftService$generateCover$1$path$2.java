package com.bilibili.upper.module.cover_v2.service;

import android.graphics.Bitmap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/service/MultiCoverDraftService$generateCover$1$path$2.class */
public final class MultiCoverDraftService$generateCover$1$path$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final Bitmap $bitmap;
    final float $mixRatio;
    final String $savePath;
    int label;
    final MultiCoverDraftService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCoverDraftService$generateCover$1$path$2(MultiCoverDraftService multiCoverDraftService, Bitmap bitmap, float f7, String str, Continuation<? super MultiCoverDraftService$generateCover$1$path$2> continuation) {
        super(2, continuation);
        this.this$0 = multiCoverDraftService;
        this.$bitmap = bitmap;
        this.$mixRatio = f7;
        this.$savePath = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiCoverDraftService$generateCover$1$path$2(this.this$0, this.$bitmap, this.$mixRatio, this.$savePath, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.this$0.saveCropPicture(this.$bitmap, this.$mixRatio, this.$savePath);
    }
}
