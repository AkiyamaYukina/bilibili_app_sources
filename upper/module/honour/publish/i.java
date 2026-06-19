package com.bilibili.upper.module.honour.publish;

import Qh1.V;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeContinuation f113197a;

    public i(SafeContinuation safeContinuation) {
        this.f113197a = safeContinuation;
    }

    public final void a(String str) {
        Result.Companion companion = Result.Companion;
        this.f113197a.resumeWith(V.a(str));
    }
}
