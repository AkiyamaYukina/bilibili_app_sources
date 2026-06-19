package com.bilibili.ogv.kmm.operation.inlinevideo;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/k.class */
public interface k {
    @Nullable
    Object a(@NotNull Continuation<? super Unit> continuation);

    boolean b();

    @NotNull
    String c();

    @NotNull
    g d();

    void e(boolean z6);

    @NotNull
    j f();

    @NotNull
    n g();

    @NotNull
    String getModuleType();
}
