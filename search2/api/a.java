package com.bilibili.search2.api;

import androidx.lifecycle.MutableLiveData;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.search2.api.DefaultKeywordImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/a.class */
public final class a extends BiliApiDataCallback<DefaultKeyword> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultKeywordImpl f86291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableLiveData<Resource<com.bilibili.app.comm.list.common.api.b>> f86292c;

    public a(DefaultKeywordImpl defaultKeywordImpl, MutableLiveData<Resource<com.bilibili.app.comm.list.common.api.b>> mutableLiveData) {
        this.f86291b = defaultKeywordImpl;
        this.f86292c = mutableLiveData;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(DefaultKeyword defaultKeyword) {
        this.f86291b.f86275a = DefaultKeywordImpl.DefaultWordReport.HAS_REQUESTED_STATUS;
        Resource.Companion.getClass();
        this.f86292c.setValue(Resource.a.d(defaultKeyword));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Resource.a aVar = Resource.Companion;
        Throwable exc = th;
        if (th == null) {
            exc = new Exception();
        }
        aVar.getClass();
        this.f86292c.setValue(Resource.a.a(exc));
    }
}
