package com.bilibili.upper.module.uppercenter.model;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.upper.api.bean.PageTip;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/model/c.class */
public final class c extends BiliApiDataCallback<PageTip> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafeContinuation f114122b;

    public c(SafeContinuation safeContinuation) {
        this.f114122b = safeContinuation;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(PageTip pageTip) {
        this.f114122b.resumeWith(Result.constructor-impl(pageTip));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f114122b.resumeWith(Result.constructor-impl((Object) null));
    }
}
