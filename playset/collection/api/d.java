package com.bilibili.playset.collection.api;

import android.os.Bundle;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.y0;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/api/d.class */
public final class d extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CollectionViewModel f84221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f84222c;

    public d(CollectionViewModel collectionViewModel, Bundle bundle) {
        this.f84221b = collectionViewModel;
        this.f84222c = bundle;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(String str) {
        this.f84221b.f84213f.setValue(TuplesKt.to(1, this.f84222c));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        if (th instanceof BiliApiException) {
            BiliApiException biliApiException = (BiliApiException) th;
            int i7 = biliApiException.mCode;
            if (y0.a(i7)) {
                this.f84222c.putInt("exception_code", i7);
                this.f84222c.putString("exception_message", biliApiException.getMessage());
            }
        }
        this.f84221b.f84213f.setValue(TuplesKt.to(2, this.f84222c));
    }
}
