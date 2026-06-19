package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.bilibili.playerbizcommonv2.widget.subtitle.r0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/n0.class */
@StabilityInferred(parameters = 0)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b0 f92606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final r0 f92607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Tt0.e f92608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LH.j f92609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableIntState f92610e = SnapshotIntStateKt.mutableIntStateOf(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<d0> f92611f = SnapshotStateKt.mutableStateListOf();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableState f92612g = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @NotNull
    public final MutableState h = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableState f92613i = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableState f92614j = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    public n0(@NotNull b0 b0Var, @NotNull r0 r0Var, @NotNull Tt0.e eVar, @NotNull LH.j jVar) {
        this.f92606a = b0Var;
        this.f92607b = r0Var;
        this.f92608c = eVar;
        this.f92609d = jVar;
    }
}
