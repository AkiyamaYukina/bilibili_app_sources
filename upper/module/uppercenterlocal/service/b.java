package com.bilibili.upper.module.uppercenterlocal.service;

import com.bilibili.jsb.IPrivacyController;
import kntr.base.jsb.api.upper.G;
import kntr.base.jsb.api.upper.k;
import kntr.base.jsb.api.upper.m;
import kntr.base.jsb.api.upper.o;
import kntr.base.jsb.api.upper.q;
import kntr.base.jsb.api.upper.u;
import kntr.base.jsb.api.upper.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/b.class */
public interface b extends IPrivacyController {
    @Nullable
    Unit C1(@NotNull String str);

    void D0(long j7);

    @Nullable
    q E0(@NotNull String str);

    @Nullable
    Unit F1(@NotNull String str);

    @NotNull
    SharedFlow H();

    @NotNull
    SharedFlow I();

    void I0(@NotNull String str);

    void I3(long j7);

    @Nullable
    G M5(@NotNull String str, @Nullable String str2);

    void O2(long j7, boolean z6);

    void Q5(long j7);

    void S2(@NotNull String str, boolean z6);

    @Nullable
    o S5(long j7);

    @Nullable
    Unit T5(@NotNull String str, boolean z6);

    void W2(long j7);

    @Nullable
    k X1(long j7);

    @Nullable
    u Y0(@NotNull String str);

    void a1(boolean z6);

    @Nullable
    Unit c3(@NotNull String str);

    void f1(long j7);

    void f2(@Nullable Long l7);

    @Nullable
    Object f3(@NotNull String str, @NotNull Continuation<? super m> continuation);

    boolean i1();

    void i4(@Nullable Long l7);

    @Nullable
    z v5(int i7);
}
