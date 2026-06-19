package com.bilibili.ogv.bdesign.color;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/color/ImageDominantColorKt$imageDominantColor$1.class */
final class ImageDominantColorKt$imageDominantColor$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    Object result;

    public ImageDominantColorKt$imageDominantColor$1(Continuation<? super ImageDominantColorKt$imageDominantColor$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ImageDominantColorKt.a(null, null, false, this);
    }
}
