package com.bilibili.playset.collection.api;

import android.os.Bundle;
import com.bilibili.okretro.BiliApiDataCallback;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/api/c.class */
public final class c extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollectionViewModel f84219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f84220c;

    public c(CollectionViewModel collectionViewModel, Bundle bundle) {
        this.f84219b = collectionViewModel;
        this.f84220c = bundle;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(String str) {
        this.f84219b.f84211d.setValue(TuplesKt.to(1, this.f84220c));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f84219b.f84211d.setValue(TuplesKt.to(2, this.f84220c));
    }
}
