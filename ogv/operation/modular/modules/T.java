package com.bilibili.ogv.operation.modular.modules;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.neuron.api.Neurons;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/T.class */
@StabilityInferred(parameters = 0)
public final class T extends RecyclerView.ViewHolder implements S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f70414c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Ek0.K f70415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Pk0.w f70416b;

    public T(Ek0.K k7, Pk0.w wVar) {
        super(k7.getRoot());
        this.f70415a = k7;
        this.f70416b = wVar;
    }

    @Override // com.bilibili.ogv.operation.modular.modules.S
    public final void j0(@NotNull String str) {
        V v7 = this.f70415a.f4329z;
        Neurons.reportClick(false, v7.f70425g, v7.h);
        this.f70416b.E6(str, new Pair[0]);
    }
}
