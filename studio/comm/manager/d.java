package com.bilibili.studio.comm.manager;

import F3.C1767k2;
import F3.C1775l2;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/d.class */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f105389a = LazyKt.lazy(new C1767k2(10));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f105390b = LazyKt.lazy(new C1775l2(10));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile Boolean f105391c;

    public static boolean a() {
        return ((Boolean) f105390b.getValue()).booleanValue();
    }
}
