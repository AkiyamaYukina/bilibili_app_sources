package com.bilibili.upper.module.manuscript.repository;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.upper.module.manuscript.bean.ManuscriptVideosEntity;
import eJ0.C6925c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/repository/c.class */
public final class c extends BiliApiDataCallback<ManuscriptVideosEntity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f113674b;

    public c(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f113674b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(ManuscriptVideosEntity manuscriptVideosEntity) {
        C6925c.a(this.f113674b, Result.box-impl(Result.constructor-impl(manuscriptVideosEntity)));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        C6925c.a(this.f113674b, Result.box-impl(Result.constructor-impl(ResultKt.createFailure(th))));
    }
}
