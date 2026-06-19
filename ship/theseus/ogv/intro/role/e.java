package com.bilibili.ship.theseus.ogv.intro.role;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/e.class */
@Stable
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f93457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f93458b = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState f93459c = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f93460d = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f93461e = SnapshotStateKt.mutableStateOf$default(Dp.m3878boximpl(Dp.m3880constructorimpl(0)), null, 2, null);

    public e(@NotNull Function0<Unit> function0) {
        this.f93457a = function0;
    }
}
