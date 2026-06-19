package com.bilibili.ogv.community;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/h.class */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a<Long, Boolean> f67546a;

    static {
        a<Long, Boolean> aVar = new a<>();
        b.a(aVar);
        f67546a = aVar;
    }

    public static boolean a(long j7) {
        Boolean boolA = f67546a.a(Long.valueOf(j7));
        return boolA != null ? boolA.booleanValue() : false;
    }
}
