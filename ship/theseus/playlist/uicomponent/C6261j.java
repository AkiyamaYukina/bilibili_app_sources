package com.bilibili.ship.theseus.playlist.uicomponent;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/j.class */
@StabilityInferred(parameters = 0)
public final class C6261j extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pu0.f f96052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Job f96053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96054c;

    public C6261j(Pu0.f fVar) {
        super(fVar.f19322a);
        this.f96052a = fVar;
        this.f96054c = X9.n.b();
    }
}
