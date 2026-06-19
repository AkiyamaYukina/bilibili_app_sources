package com.bilibili.pegasus.holders.oversea;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4853c;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.oversea.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/e.class */
@StabilityInferred(parameters = 1)
public final class C5680e implements PegasusHolderInfo<ip0.d, C5679d> {
    @NotNull
    public final Class<ip0.d> getDataClass() {
        return ip0.d.class;
    }

    @NotNull
    public final String getDataType() {
        return "large_grd_v1";
    }

    @NotNull
    public final String getViewType() {
        return "large_grd_v1";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C5679d(C4853c.inflate(layoutInflater, viewGroup, false));
    }
}
