package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/h.class */
@StabilityInferred(parameters = 0)
public final class h extends Nj0.c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LY0.a f92922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92923c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public OgvBadgeInfo f92926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f92927g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f92928i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f92930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f92931l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f92924d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f92925e = "";

    @Nullable
    public String h = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f92929j = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public String f92932m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f92933n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public String f92934o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f92935p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f92936q = "";

    public h(@NotNull LY0.a aVar) {
        this.f92922b = aVar;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.floatlayer.a
    public final void d(int i7) {
        if (i7 == this.f92923c) {
            return;
        }
        this.f92923c = i7;
        notifyPropertyChanged(285);
    }

    @Override // Nj0.c
    public final int m() {
        return 2131500434;
    }
}
