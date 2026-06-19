package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/k.class */
@StabilityInferred(parameters = 0)
public final class k extends Nj0.c implements Nj0.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final r f92945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f92946c = "";

    public k(@NotNull r rVar) {
        this.f92945b = rVar;
    }

    @Override // Nj0.g
    public final void b(@NotNull Rect rect, @NotNull RecyclerView recyclerView) {
        int iB = Uj0.c.b(6, recyclerView.getContext());
        rect.top = iB;
        rect.bottom = iB;
    }

    @Override // Nj0.c
    public final int m() {
        return 2131500438;
    }
}
