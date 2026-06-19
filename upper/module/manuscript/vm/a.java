package com.bilibili.upper.module.manuscript.vm;

import Qh1.V;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.upper.api.bean.manuscript.ArchivePre;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/a.class */
public final class a extends BiliApiCallback<GeneralResponse<ArchivePre>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f113713b;

    public a(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f113713b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        this.f113713b.resumeWith(V.a("error when getting pre data in ManuscriptListViewModel"));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<ArchivePre> generalResponse) {
        GeneralResponse<ArchivePre> generalResponse2 = generalResponse;
        ArchivePre archivePre = generalResponse2 != null ? generalResponse2.data : null;
        CancellableContinuationImpl cancellableContinuationImpl = this.f113713b;
        if (archivePre != null) {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(archivePre));
        } else {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Exception("empty when getting pre data in ManuscriptListViewModel"))));
        }
    }
}
