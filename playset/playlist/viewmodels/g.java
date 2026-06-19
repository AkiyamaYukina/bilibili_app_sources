package com.bilibili.playset.playlist.viewmodels;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.okretro.BiliApiDataCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/g.class */
public final class g extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistViewModel f85578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f85580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f85581e;

    public g(PlaylistViewModel playlistViewModel, String str, long j7, int i7) {
        this.f85578b = playlistViewModel;
        this.f85579c = str;
        this.f85580d = j7;
        this.f85581e = i7;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(String str) {
        MutableLiveData<Bundle> mutableLiveData = this.f85578b.f85533n;
        Bundle bundleB = B1.a.b(-3, "loading_status");
        bundleB.putString("data_key", this.f85579c);
        bundleB.putLong("media_id", this.f85580d);
        bundleB.putInt("media_type", this.f85581e);
        mutableLiveData.setValue(bundleB);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        MutableLiveData<Bundle> mutableLiveData = this.f85578b.f85533n;
        Bundle bundle = new Bundle();
        bundle.putInt("loading_status", -2);
        bundle.putString("data_key", this.f85579c);
        bundle.putLong("media_id", this.f85580d);
        bundle.putInt("media_type", this.f85581e);
        mutableLiveData.setValue(bundle);
    }
}
