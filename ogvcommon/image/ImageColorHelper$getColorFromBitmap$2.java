package com.bilibili.ogvcommon.image;

import android.graphics.Bitmap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/image/ImageColorHelper$getColorFromBitmap$2.class */
final class ImageColorHelper$getColorFromBitmap$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final Bitmap $bitmap;
    final int $defaultColor;
    final Pair<Float, Float> $hsbData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageColorHelper$getColorFromBitmap$2(int i7, Bitmap bitmap, Pair<Float, Float> pair, Continuation<? super ImageColorHelper$getColorFromBitmap$2> continuation) {
        super(2, continuation);
        this.$defaultColor = i7;
        this.$bitmap = bitmap;
        this.$hsbData = pair;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageColorHelper$getColorFromBitmap$2(this.$defaultColor, this.$bitmap, this.$hsbData, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogvcommon.image.ImageColorHelper$getColorFromBitmap$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
