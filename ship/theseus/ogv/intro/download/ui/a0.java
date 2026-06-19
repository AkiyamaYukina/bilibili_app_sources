package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/a0.class */
@StabilityInferred(parameters = 1)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f92522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState f92523c = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f92524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f92525e;

    public a0(int i7, @NotNull Function0<Unit> function0) {
        this.f92521a = i7;
        this.f92522b = function0;
        Boolean bool = Boolean.FALSE;
        this.f92524d = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f92525e = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }
}
