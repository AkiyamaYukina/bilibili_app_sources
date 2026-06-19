package com.bilibili.upper.module.manuscript.repository;

import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.upper.module.manuscript.bean.ManuscriptTranscodingEntity;
import eJ0.C6925c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/repository/d.class */
public final class d extends BiliApiDataCallback<ManuscriptTranscodingEntity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f113675b;

    public d(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f113675b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(ManuscriptTranscodingEntity manuscriptTranscodingEntity) {
        C6925c.a(this.f113675b, Result.box-impl(Result.constructor-impl(manuscriptTranscodingEntity)));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        BiliApiException biliApiException = th instanceof BiliApiException ? (BiliApiException) th : null;
        d dVar = (biliApiException == null || biliApiException.mCode != 30300) ? null : this;
        CancellableContinuationImpl cancellableContinuationImpl = this.f113675b;
        if (dVar != null) {
            C6925c.a(cancellableContinuationImpl, Result.box-impl(Result.constructor-impl((Object) null)));
        } else {
            Result.Companion companion = Result.Companion;
            C6925c.a(cancellableContinuationImpl, Result.box-impl(Result.constructor-impl(ResultKt.createFailure(th))));
        }
    }
}
