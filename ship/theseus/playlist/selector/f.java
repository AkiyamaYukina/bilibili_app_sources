package com.bilibili.ship.theseus.playlist.selector;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.selector.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/f.class */
@StabilityInferred(parameters = 0)
public final class f extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pu0.j f95865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final k.e f95866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MultiTypeMedia f95868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f95869e;

    public f(Pu0.j jVar, k.e eVar, int i7) {
        super(jVar.f19352a);
        this.f95865a = jVar;
        this.f95866b = eVar;
        this.f95867c = i7;
        jVar.f19353b.setOnClickListener(this);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        MultiTypeMedia multiTypeMedia;
        k.e eVar;
        if (view == null || (multiTypeMedia = this.f95868d) == null) {
            return;
        }
        if (Intrinsics.areEqual(view, this.f95865a.f19353b)) {
            k.e eVar2 = this.f95866b;
            if (eVar2 != null) {
                eVar2.f95901a.f95880b.tryEmit(new k.c(multiTypeMedia));
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(view, this.itemView) || (eVar = this.f95866b) == null) {
            return;
        }
        eVar.f95901a.f95880b.tryEmit(new k.c(multiTypeMedia));
    }
}
