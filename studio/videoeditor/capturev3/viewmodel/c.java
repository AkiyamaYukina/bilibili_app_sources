package com.bilibili.studio.videoeditor.capturev3.viewmodel;

import com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment;
import com.bilibili.studio.videoeditor.capturev3.logic.f;
import zB0.a$e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/viewmodel/c.class */
public final class c implements a$e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f109323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IndependentCaptureFragment<?> f109324b;

    public c(f fVar, IndependentCaptureFragment independentCaptureFragment) {
        this.f109323a = fVar;
        this.f109324b = independentCaptureFragment;
    }

    @Override // zB0.a$e
    public final void a(IB0.b bVar) {
        f fVar = this.f109323a;
        if (fVar != null) {
            fVar.a(bVar);
        }
    }

    @Override // zB0.a$e
    public final boolean isCancel() {
        IndependentCaptureFragment<?> independentCaptureFragment = this.f109324b;
        return independentCaptureFragment != null ? independentCaptureFragment.ig() : false;
    }

    @Override // zB0.a$e
    public final void onError() {
    }
}
