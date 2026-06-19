package com.bilibili.ogv.operation.modular.modules;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/I.class */
@StabilityInferred(parameters = 0)
public final class I extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f70375b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final F f70376a;

    public I(RecyclerView recyclerView, Pk0.w wVar, Ak0.c cVar) {
        super(recyclerView);
        F f7 = new F(wVar, cVar);
        this.f70376a = f7;
        recyclerView.setAdapter(f7);
    }
}
