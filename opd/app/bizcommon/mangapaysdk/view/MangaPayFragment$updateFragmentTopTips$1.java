package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$updateFragmentTopTips$1.class */
final class MangaPayFragment$updateFragmentTopTips$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    Object result;
    final MangaPayFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MangaPayFragment$updateFragmentTopTips$1(MangaPayFragment mangaPayFragment, Continuation<? super MangaPayFragment$updateFragmentTopTips$1> continuation) {
        super(continuation);
        this.this$0 = mangaPayFragment;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MangaPayFragment.lf(this.this$0, null, this);
    }
}
