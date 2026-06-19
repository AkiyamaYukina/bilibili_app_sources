package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/g.class */
@StabilityInferred(parameters = 0)
public final class g extends Nj0.c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f92920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ObservableArrayList<Nj0.c> f92921c = new ObservableArrayList<>();

    @Override // com.bilibili.ship.theseus.ogv.intro.floatlayer.a
    public final void d(int i7) {
        if (i7 == this.f92920b) {
            return;
        }
        this.f92920b = i7;
        notifyPropertyChanged(285);
    }

    @Override // Nj0.c
    public final int m() {
        return 2131500423;
    }
}
