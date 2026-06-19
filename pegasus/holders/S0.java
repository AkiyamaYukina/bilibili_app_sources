package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/S0.class */
@StabilityInferred(parameters = 1)
public final class S0 implements PegasusHolderInfo<fp0.u, R0> {
    @NotNull
    public final Class<fp0.u> getDataClass() {
        return fp0.u.class;
    }

    @NotNull
    public final String getViewType() {
        return "small_cover_v2";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new R0(aq0.O0.inflate(layoutInflater, viewGroup, false));
    }
}
