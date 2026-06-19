package com.bilibili.ogv.community;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.BiliApiDataCallback;
import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/g.class */
public final class g extends BiliApiDataCallback<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SingleEmitter<Boolean> f67545d;

    public g(long j7, long j8, boolean z6, SingleEmitter<Boolean> singleEmitter) {
        this.f67543b = j8;
        this.f67544c = z6;
        this.f67545d = singleEmitter;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(JSONObject jSONObject) {
        a<Long, Boolean> aVar = h.f67546a;
        long j7 = this.f67543b;
        boolean z6 = this.f67544c;
        h.f67546a.c(Long.valueOf(j7), Boolean.valueOf(z6));
        this.f67545d.onSuccess(Boolean.valueOf(z6));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        if (th != null) {
            this.f67545d.onError(th);
        }
    }
}
