package com.bilibili.ship.theseus.playlist.uicomponent;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.uicomponent.C6260i;
import com.bilibili.ship.theseus.united.page.intro.module.relate.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/m.class */
@StabilityInferred(parameters = 0)
public final class m extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f96060f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pu0.g f96061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C6260i.a f96062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f96063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MultiTypeMedia f96064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f96065e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/m$a.class */
    public static final class a {
    }

    public m(Pu0.g gVar, C6260i.a aVar, int i7) {
        super(gVar.f19324a);
        this.f96061a = gVar;
        this.f96062b = aVar;
        this.f96063c = i7;
        gVar.f19332j.setOnClickListener(this);
        gVar.f19325b.setOnClickListener(this);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        MultiTypeMedia multiTypeMedia;
        C6260i.a aVar;
        if (view == null || (multiTypeMedia = this.f96064d) == null) {
            return;
        }
        if (Intrinsics.areEqual(view, this.f96061a.f19325b)) {
            C6260i.a aVar2 = this.f96062b;
            if (aVar2 != null) {
                aVar2.a(multiTypeMedia);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(view, this.f96061a.f19332j)) {
            C6260i.a aVar3 = this.f96062b;
            if (aVar3 != null) {
                aVar3.b(multiTypeMedia, Y.a(this.f96061a.f19332j));
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(view, this.itemView) || (aVar = this.f96062b) == null) {
            return;
        }
        aVar.c(multiTypeMedia);
    }

    public final boolean p0() {
        MultiTypeMedia multiTypeMedia;
        MultiTypeMedia multiTypeMedia2;
        MultiTypeMedia multiTypeMedia3 = this.f96064d;
        boolean z6 = true;
        if ((multiTypeMedia3 == null || !multiTypeMedia3.t()) && (((multiTypeMedia = this.f96064d) == null || !multiTypeMedia.u()) && ((multiTypeMedia2 = this.f96064d) == null || !multiTypeMedia2.f95219G))) {
            z6 = false;
        }
        return z6;
    }
}
