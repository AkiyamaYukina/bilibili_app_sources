package com.bilibili.studio.videoeditor.capturev3.viewmodel;

import com.bilibili.lib.mod.ModErrorInfo;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/viewmodel/d.class */
public final class d implements ModResourceClient.OnUpdateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndependentCaptureViewModel f109325a;

    public d(IndependentCaptureViewModel independentCaptureViewModel) {
        this.f109325a = independentCaptureViewModel;
    }

    public final void onFail(ModUpdateRequest modUpdateRequest, ModErrorInfo modErrorInfo) {
        this.f109325a.f109301n.x.postValue(Boolean.TRUE);
    }

    public final void onSuccess(ModResource modResource) {
        this.f109325a.f109301n.a.postValue(Boolean.TRUE);
    }
}
