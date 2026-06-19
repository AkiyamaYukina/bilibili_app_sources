package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/d1.class */
@StabilityInferred(parameters = 1)
public final class d1 implements PegasusHolderInfo<fp0.w, c1> {
    @NotNull
    public final Class<fp0.w> getDataClass() {
        return fp0.w.class;
    }

    @NotNull
    public final String getViewType() {
        return "small_cover_v9";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new c1(aq0.P0.inflate(layoutInflater, viewGroup, false));
    }
}
