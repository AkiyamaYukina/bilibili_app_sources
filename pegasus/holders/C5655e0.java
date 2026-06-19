package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/e0.class */
@StabilityInferred(parameters = 1)
public final class C5655e0 implements PegasusHolderInfo<fp0.j, LargeCoverSingleV9Holder> {
    @NotNull
    public final Class<fp0.j> getDataClass() {
        return fp0.j.class;
    }

    @NotNull
    public final String getViewType() {
        return "large_cover_single_v9";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new LargeCoverSingleV9Holder(aq0.D0.inflate(layoutInflater, viewGroup, false));
    }
}
