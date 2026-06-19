package com.bilibili.playset.playlist.viewmodels;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.okretro.BaseResponse;
import com.bilibili.okretro.BiliApiDataCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/r.class */
public final class r extends BiliApiDataCallback<BaseResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistViewModelV2 f85601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85602c;

    public r(PlaylistViewModelV2 playlistViewModelV2, String str) {
        this.f85601b = playlistViewModelV2;
        this.f85602c = str;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(BaseResponse baseResponse) {
        MutableLiveData<Bundle> mutableLiveData = this.f85601b.f85550l;
        Bundle bundleB = B1.a.b(-3, "loading_status");
        bundleB.putString("data_key", this.f85602c);
        mutableLiveData.setValue(bundleB);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        MutableLiveData<Bundle> mutableLiveData = this.f85601b.f85550l;
        Bundle bundle = new Bundle();
        bundle.putInt("loading_status", -2);
        bundle.putString("data_key", this.f85602c);
        mutableLiveData.setValue(bundle);
    }
}
