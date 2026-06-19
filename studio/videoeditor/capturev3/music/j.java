package com.bilibili.studio.videoeditor.capturev3.music;

import Qh1.V;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/j.class */
public final class j extends VB0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f109273a;

    public j(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f109273a = cancellableContinuationImpl;
    }

    @Override // VB0.a
    public final void onError(String str) {
        Result.Companion companion = Result.Companion;
        this.f109273a.resumeWith(V.a(str));
    }

    @Override // VB0.a
    public final void onFinish() {
        com.bilibili.studio.videoeditor.extension.d.b(Boolean.TRUE, this.f109273a);
    }
}
