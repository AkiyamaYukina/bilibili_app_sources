package com.bilibili.upper.module.uppercenter.model;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.upper.api.bean.centerv4.UpperCenterIndexResV4;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/model/b.class */
public final class b extends BiliApiDataCallback<UpperCenterIndexResV4> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafeContinuation f114121b;

    public b(SafeContinuation safeContinuation) {
        this.f114121b = safeContinuation;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(UpperCenterIndexResV4 upperCenterIndexResV4) {
        this.f114121b.resumeWith(Result.constructor-impl(upperCenterIndexResV4));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f114121b.resumeWith(Result.constructor-impl((Object) null));
    }
}
