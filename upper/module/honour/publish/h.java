package com.bilibili.upper.module.honour.publish;

import Qh1.V;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/h.class */
public final class h implements YE0.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeContinuation f113196a;

    public h(SafeContinuation safeContinuation) {
        this.f113196a = safeContinuation;
    }

    @Override // YE0.a
    public final void onFail(String str) {
        Result.Companion companion = Result.Companion;
        this.f113196a.resumeWith(V.a(str));
    }

    @Override // YE0.a
    public final void onSuccess(String str) {
        this.f113196a.resumeWith(Result.constructor-impl(str));
    }
}
