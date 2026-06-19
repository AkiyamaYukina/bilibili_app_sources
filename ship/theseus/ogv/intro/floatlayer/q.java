package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.bean.PersonRelateSeason;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/q.class */
@StabilityInferred(parameters = 0)
public final class q extends Nj0.c implements Nj0.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PersonRelateSeason f92961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f92962c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f92963d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f92964e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f92965f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public OgvBadgeInfo f92966g;

    public q(@NotNull PersonRelateSeason personRelateSeason) {
        this.f92961b = personRelateSeason;
    }

    @Override // Nj0.g
    public final void b(@NotNull Rect rect, @NotNull RecyclerView recyclerView) {
        int iA = (int) Uj0.c.a(6.0f, recyclerView.getContext());
        rect.left = iA;
        rect.right = iA;
        rect.bottom = iA * 2;
    }

    @Override // Nj0.c
    public final int m() {
        return 2131500439;
    }
}
