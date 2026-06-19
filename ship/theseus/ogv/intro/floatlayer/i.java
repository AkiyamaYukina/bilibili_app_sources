package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/i.class */
@StabilityInferred(parameters = 0)
public final class i extends Nj0.c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f92937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f92939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f92940e;

    public i(@NotNull String str, @NotNull String str2, boolean z6) {
        this.f92937b = z6;
        this.f92939d = str;
        this.f92940e = str2;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.floatlayer.a
    public final void d(int i7) {
        if (i7 == this.f92938c) {
            return;
        }
        this.f92938c = i7;
        notifyPropertyChanged(285);
    }

    @Override // Nj0.c
    public final int m() {
        return !this.f92937b ? 2131500435 : 2131500429;
    }
}
