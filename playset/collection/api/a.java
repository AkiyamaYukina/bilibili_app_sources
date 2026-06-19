package com.bilibili.playset.collection.api;

import android.os.Bundle;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.y0;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/api/a.class */
public final class a extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollectionViewModel f84215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f84216c;

    public a(CollectionViewModel collectionViewModel, Bundle bundle) {
        this.f84215b = collectionViewModel;
        this.f84216c = bundle;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(String str) {
        this.f84215b.f84212e.setValue(TuplesKt.to(1, this.f84216c));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        if (th instanceof BiliApiException) {
            int i7 = ((BiliApiException) th).mCode;
            if (y0.a(i7)) {
                this.f84216c.putInt("exception_code", i7);
                this.f84216c.putString("exception_message", th.getMessage());
            }
        }
        this.f84215b.f84212e.setValue(TuplesKt.to(2, this.f84216c));
    }
}
