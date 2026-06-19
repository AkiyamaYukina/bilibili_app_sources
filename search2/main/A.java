package com.bilibili.search2.main;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.search2.api.SearchReferral;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/A.class */
public final class A extends BiliApiDataCallback<SearchReferral> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f86618b;

    public A(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f86618b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(SearchReferral searchReferral) {
        this.f86618b.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(searchReferral))));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        this.f86618b.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(th)))));
    }
}
