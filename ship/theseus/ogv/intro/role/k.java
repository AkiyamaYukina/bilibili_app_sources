package com.bilibili.ship.theseus.ogv.intro.role;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.bilibili.framework.exposure.core.ExposureEntry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/k.class */
@Stable
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f93480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f93481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f93482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f93483d = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f93484e = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableState f93485f = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableState f93486g;

    @NotNull
    public final MutableState h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableState f93487i;

    public k(@NotNull ExposureEntry exposureEntry, @NotNull c cVar, @NotNull d dVar) {
        this.f93480a = exposureEntry;
        this.f93481b = cVar;
        this.f93482c = dVar;
        Boolean bool = Boolean.FALSE;
        this.f93486g = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.h = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f93487i = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }
}
