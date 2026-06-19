package com.bilibili.studio.comm.manager;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/o.class */
public final class o implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MF0.n f105418a;

    public o(MF0.n nVar) {
        this.f105418a = nVar;
    }

    @Override // com.bilibili.studio.comm.manager.a
    public final void a(String str) {
        this.f105418a.invoke(Boolean.valueOf(Intrinsics.areEqual(str, "2")));
    }
}
