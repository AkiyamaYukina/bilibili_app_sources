package com.bilibili.ogv.review.reviewpublish;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewShareFragment$doShare$2.class */
final class ReviewShareFragment$doShare$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Bitmap $bitmap;
    final Ref.ObjectRef<File> $imageFile;
    final Ref.BooleanRef $storedImageFileSuccessfully;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewShareFragment$doShare$2(Ref.ObjectRef<File> objectRef, Ref.BooleanRef booleanRef, Bitmap bitmap, Continuation<? super ReviewShareFragment$doShare$2> continuation) {
        super(2, continuation);
        this.$imageFile = objectRef;
        this.$storedImageFileSuccessfully = booleanRef;
        this.$bitmap = bitmap;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReviewShareFragment$doShare$2(this.$imageFile, this.$storedImageFileSuccessfully, this.$bitmap, continuation);
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
        try {
            File parentFile = ((File) this.$imageFile.element).getParentFile();
            if (parentFile != null) {
                Boxing.boxBoolean(parentFile.mkdirs());
            }
            FileOutputStream fileOutputStream = new FileOutputStream((File) this.$imageFile.element);
            try {
                this.$bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                this.$storedImageFileSuccessfully.element = true;
            } finally {
            }
        } catch (IOException e7) {
            BLog.w("ReviewShareFragment$doShare$2-invokeSuspend", "[ogv-review-ReviewShareFragment$doShare$2-invokeSuspend] Writing bitmap to file failed.", e7);
        }
        return Unit.INSTANCE;
    }
}
