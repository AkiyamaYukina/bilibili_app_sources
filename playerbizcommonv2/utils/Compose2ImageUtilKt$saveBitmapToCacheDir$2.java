package com.bilibili.playerbizcommonv2.utils;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/Compose2ImageUtilKt$saveBitmapToCacheDir$2.class */
final class Compose2ImageUtilKt$saveBitmapToCacheDir$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final Bitmap $bitmap;
    final Context $context;
    final String $fileName;
    final int $quality;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Compose2ImageUtilKt$saveBitmapToCacheDir$2(Context context, String str, Bitmap bitmap, int i7, Continuation<? super Compose2ImageUtilKt$saveBitmapToCacheDir$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$fileName = str;
        this.$bitmap = bitmap;
        this.$quality = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Compose2ImageUtilKt$saveBitmapToCacheDir$2(this.$context, this.$fileName, this.$bitmap, this.$quality, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String absolutePath;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            File externalCacheDir = this.$context.getExternalCacheDir();
            File filesDir = externalCacheDir;
            if (externalCacheDir == null) {
                filesDir = this.$context.getFilesDir();
            }
            if (!filesDir.exists()) {
                filesDir.mkdirs();
            }
            File file = new File(filesDir, this.$fileName);
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.$bitmap.compress(StringsKt.t(this.$fileName, ".png") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, this.$quality, fileOutputStream);
                fileOutputStream.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                absolutePath = file.getAbsolutePath();
            } finally {
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            absolutePath = null;
        }
        return absolutePath;
    }
}
