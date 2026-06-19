package com.bilibili.ship.theseus.playlist.uicomponent;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.uicomponent.D;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/k.class */
@StabilityInferred(parameters = 0)
public final class ViewOnClickListenerC6262k extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pu0.h f96055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final D.h f96056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Ou0.c f96057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MultiTypeMedia f96058d;

    public ViewOnClickListenerC6262k(Pu0.h hVar, D.h hVar2) {
        super(hVar.f19347a);
        this.f96055a = hVar;
        this.f96056b = hVar2;
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        MultiTypeMedia multiTypeMedia;
        Ou0.c cVar;
        D.h hVar;
        if (!Intrinsics.areEqual(view, this.itemView) || (multiTypeMedia = this.f96058d) == null || (cVar = this.f96057c) == null || (hVar = this.f96056b) == null) {
            return;
        }
        hVar.f95988a.f95932g.tryEmit(new D.b.c(multiTypeMedia, cVar));
    }
}
