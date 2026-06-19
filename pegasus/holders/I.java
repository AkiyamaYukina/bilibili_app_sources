package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/I.class */
@StabilityInferred(parameters = 1)
public final class I implements PegasusHolderInfo<fp0.h, LargeCoverSingleV7Holder> {
    @NotNull
    public final Class<fp0.h> getDataClass() {
        return fp0.h.class;
    }

    @NotNull
    public final String getViewType() {
        return "large_cover_single_v7";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new LargeCoverSingleV7Holder(aq0.C0.inflate(layoutInflater, viewGroup, false));
    }
}
