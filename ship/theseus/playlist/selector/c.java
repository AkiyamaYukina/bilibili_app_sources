package com.bilibili.ship.theseus.playlist.selector;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.selector.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/c.class */
@StabilityInferred(parameters = 0)
public final class c extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pu0.k f95858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final k.e f95859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Ou0.c f95860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MultiTypeMedia f95861d;

    public c(Pu0.k kVar, k.e eVar) {
        super(kVar.f19372a);
        this.f95858a = kVar;
        this.f95859b = eVar;
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        MultiTypeMedia multiTypeMedia;
        Ou0.c cVar;
        k.e eVar;
        if (!Intrinsics.areEqual(view, this.itemView) || (multiTypeMedia = this.f95861d) == null || (cVar = this.f95860c) == null || (eVar = this.f95859b) == null) {
            return;
        }
        eVar.f95901a.f95880b.tryEmit(new k.c.C0798c(multiTypeMedia, cVar));
    }
}
