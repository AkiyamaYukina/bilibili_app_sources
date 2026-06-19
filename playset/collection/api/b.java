package com.bilibili.playset.collection.api;

import android.os.Bundle;
import com.bilibili.okretro.BiliApiDataCallback;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/api/b.class */
public final class b extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollectionViewModel f84217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f84218c;

    public b(CollectionViewModel collectionViewModel, Bundle bundle) {
        this.f84217b = collectionViewModel;
        this.f84218c = bundle;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(String str) {
        this.f84217b.f84211d.setValue(TuplesKt.to(1, this.f84218c));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f84217b.f84211d.setValue(TuplesKt.to(2, this.f84218c));
    }
}
