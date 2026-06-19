package com.bilibili.upper.module.manuscript.repository;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.upper.module.manuscript.bean.ManuscriptOpenEntity;
import eJ0.C6925c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/repository/a.class */
public final class a extends BiliApiDataCallback<ManuscriptOpenEntity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f113671b;

    public a(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f113671b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(ManuscriptOpenEntity manuscriptOpenEntity) {
        C6925c.a(this.f113671b, Result.box-impl(Result.constructor-impl(manuscriptOpenEntity)));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        C6925c.a(this.f113671b, Result.box-impl(Result.constructor-impl(ResultKt.createFailure(th))));
    }
}
