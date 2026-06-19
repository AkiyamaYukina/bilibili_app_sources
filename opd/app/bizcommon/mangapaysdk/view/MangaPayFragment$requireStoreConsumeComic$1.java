package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$requireStoreConsumeComic$1.class */
final class MangaPayFragment$requireStoreConsumeComic$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final MangaPayFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MangaPayFragment$requireStoreConsumeComic$1(MangaPayFragment mangaPayFragment, Continuation<? super MangaPayFragment$requireStoreConsumeComic$1> continuation) {
        super(continuation);
        this.this$0 = mangaPayFragment;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Bf(this);
    }
}
