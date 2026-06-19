package com.bilibili.playset.collection.api;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.api.PlaySetGroups;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/api/e.class */
public final class e extends BiliApiDataCallback<PlaySetGroups> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollectionViewModel f84223b;

    public e(CollectionViewModel collectionViewModel) {
        this.f84223b = collectionViewModel;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(PlaySetGroups playSetGroups) {
        this.f84223b.f84209b.setValue(TuplesKt.to(1, playSetGroups));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f84223b.f84209b.setValue(TuplesKt.to(2, (Object) null));
    }
}
