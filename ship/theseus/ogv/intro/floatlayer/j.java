package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/j.class */
@StabilityInferred(parameters = 0)
public final class j extends Nj0.c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f92941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f92942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f92943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f92944e;

    public j(@NotNull String str, @NotNull String str2) {
        this.f92942c = str;
        this.f92944e = str2;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.floatlayer.a
    public final void d(int i7) {
        if (i7 == this.f92941b) {
            return;
        }
        this.f92941b = i7;
        notifyPropertyChanged(285);
    }

    @Override // Nj0.c
    public final int m() {
        return 2131500444;
    }
}
