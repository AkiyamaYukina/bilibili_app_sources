package com.bilibili.pegasus.holders.oversea;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.Z0;
import com.bilibili.pegasus.PegasusHolderInfo;
import ip0.C7609b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/B.class */
@StabilityInferred(parameters = 1)
public final class B implements PegasusHolderInfo<C7609b, LargeCoverSingleV12Holder> {
    @NotNull
    public final Class<C7609b> getDataClass() {
        return C7609b.class;
    }

    @NotNull
    public final String getViewType() {
        return "large_cover_single_v12";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new LargeCoverSingleV12Holder(Z0.inflate(layoutInflater, viewGroup, false));
    }
}
