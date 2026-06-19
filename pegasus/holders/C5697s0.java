package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/s0.class */
@StabilityInferred(parameters = 1)
public final class C5697s0 implements PegasusHolderInfo<fp0.l, C5695r0> {
    @NotNull
    public final Class<fp0.l> getDataClass() {
        return fp0.l.class;
    }

    @NotNull
    public final String getViewType() {
        return "large_cover_v8";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C5695r0(aq0.B0.inflate(layoutInflater, viewGroup, false));
    }
}
