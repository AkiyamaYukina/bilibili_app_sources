package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/M0.class */
@StabilityInferred(parameters = 1)
public final class M0 implements PegasusHolderInfo<fp0.s, L0> {
    @NotNull
    public final Class<fp0.s> getDataClass() {
        return fp0.s.class;
    }

    @NotNull
    public final String getViewType() {
        return "select";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new L0(aq0.J0.inflate(layoutInflater, viewGroup, false));
    }
}
