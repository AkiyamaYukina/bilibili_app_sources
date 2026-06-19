package com.bilibili.ship.theseus.united.page.translate;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/translate/DetailPageTranslationServiceKt$translateTitle$1.class */
final class DetailPageTranslationServiceKt$translateTitle$1 extends ContinuationImpl {
    int label;
    Object result;

    public DetailPageTranslationServiceKt$translateTitle$1(Continuation<? super DetailPageTranslationServiceKt$translateTitle$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objB = c.b(null, 0L, null, null, this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Result.box-impl(objB);
    }
}
