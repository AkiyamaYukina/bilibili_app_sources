package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PayViewStoreViewModel$tryLoadMangaSDKPage$1.class */
final class PayViewStoreViewModel$tryLoadMangaSDKPage$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayViewStoreViewModel$tryLoadMangaSDKPage$1(d dVar, Continuation<? super PayViewStoreViewModel$tryLoadMangaSDKPage$1> continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Z0(null, null, null, null, this);
    }
}
