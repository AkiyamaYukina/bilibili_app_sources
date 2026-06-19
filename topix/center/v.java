package com.bilibili.topix.center;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/v.class */
@StabilityInferred(parameters = 0)
public final class v extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Jq.g f112441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextView f112442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f112443c;

    public v(@NotNull ViewGroup viewGroup, @NotNull Jq.g gVar) {
        super(p.a(viewGroup, 2131500579, viewGroup, false));
        this.f112441a = gVar;
        this.f112442b = (TextView) this.itemView.findViewById(2131310619);
        this.f112443c = (TextView) this.itemView.findViewById(2131314423);
        this.itemView.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.fragment.o(this, 2));
    }
}
