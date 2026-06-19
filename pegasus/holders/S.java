package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/S.class */
@StabilityInferred(parameters = 1)
public final class S implements PegasusHolderInfo<fp0.i, Q> {
    @NotNull
    public final Class<fp0.i> getDataClass() {
        return fp0.i.class;
    }

    @NotNull
    public final String getViewType() {
        return "large_cover_single_v8";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new Q(aq0.E0.inflate(layoutInflater, viewGroup, false));
    }
}
