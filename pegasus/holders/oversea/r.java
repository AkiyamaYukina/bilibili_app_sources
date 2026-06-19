package com.bilibili.pegasus.holders.oversea;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.Y0;
import com.bilibili.pegasus.PegasusHolderInfo;
import ip0.C7608a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/r.class */
@StabilityInferred(parameters = 1)
public final class r implements PegasusHolderInfo<C7608a, q> {
    @NotNull
    public final Class<C7608a> getDataClass() {
        return C7608a.class;
    }

    @NotNull
    public final String getViewType() {
        return "large_cover_single_v11";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new q(Y0.inflate(layoutInflater, viewGroup, false));
    }
}
