package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/o1.class */
@StabilityInferred(parameters = 1)
public final class o1 implements PegasusHolderInfo<fp0.x, k1> {
    @NotNull
    public final Class<fp0.x> getDataClass() {
        return fp0.x.class;
    }

    @NotNull
    public final String getViewType() {
        return "up_small_cover";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new k1(aq0.Q0.inflate(layoutInflater, viewGroup, false));
    }
}
