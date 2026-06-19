package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4862g0;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/B0.class */
@StabilityInferred(parameters = 1)
public final class B0 implements PegasusHolderInfo<fp0.m, LargeCoverV9Holder> {
    @NotNull
    public final Class<fp0.m> getDataClass() {
        return fp0.m.class;
    }

    @NotNull
    public final String getViewType() {
        return "large_cover_v9";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new LargeCoverV9Holder(C4862g0.inflate(layoutInflater, viewGroup, false));
    }
}
