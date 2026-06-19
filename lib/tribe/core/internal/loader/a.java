package com.bilibili.lib.tribe.core.internal.loader;

import Gf0.InterfaceC1965A;
import Gf0.u;
import If0.C2294d;
import If0.f;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/loader/a.class */
public interface a {

    /* JADX INFO: renamed from: com.bilibili.lib.tribe.core.internal.loader.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/loader/a$a.class */
    public interface InterfaceC0361a {
        @NotNull
        DefaultClassLoaderService getService();
    }

    void a(@NotNull Function0<Boolean> function0);

    @NotNull
    ClassLoader b();

    @NotNull
    C2294d c(@NotNull u uVar);

    @Nullable
    f d(@NotNull String str);

    void e(@NotNull InterfaceC1965A interfaceC1965A);

    void f(@NotNull f fVar);
}
