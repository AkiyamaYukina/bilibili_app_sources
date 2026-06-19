package com.bilibili.playerbizcommonv2.api;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/TranslationMaterialServiceKt$requestTranslationIntro$1.class */
final class TranslationMaterialServiceKt$requestTranslationIntro$1 extends ContinuationImpl {
    int label;
    Object result;

    public TranslationMaterialServiceKt$requestTranslationIntro$1(Continuation<? super TranslationMaterialServiceKt$requestTranslationIntro$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.a(this);
    }
}
