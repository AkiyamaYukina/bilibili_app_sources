package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/Q0.class */
@StabilityInferred(parameters = 1)
public final class Q0 implements PegasusHolderInfo<fp0.t, P0> {
    @NotNull
    public final Class<fp0.t> getDataClass() {
        return fp0.t.class;
    }

    @NotNull
    public final String getViewType() {
        return "small_cover_v10";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new P0(aq0.N0.inflate(layoutInflater, viewGroup, false));
    }
}
