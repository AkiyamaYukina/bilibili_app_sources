package com.bilibili.ogv.operation.modular.modules;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/Q.class */
@StabilityInferred(parameters = 0)
public final class Q extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f70411c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Ek0.E f70412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final L f70413b;

    public Q(Ek0.E e7, Pk0.w wVar) {
        super(e7.getRoot());
        this.f70412a = e7;
        this.f70413b = new L(wVar, new Fc.s(this, 3));
    }
}
