package com.bilibili.pegasus.holders.oversea;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.a1;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/J.class */
@StabilityInferred(parameters = 1)
public final class J implements PegasusHolderInfo<ip0.c, LargeCoverSingleV13Holder> {
    @NotNull
    public final Class<ip0.c> getDataClass() {
        return ip0.c.class;
    }

    @NotNull
    public final String getViewType() {
        return "large_cover_single_v13";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new LargeCoverSingleV13Holder(a1.inflate(layoutInflater, viewGroup, false));
    }
}
