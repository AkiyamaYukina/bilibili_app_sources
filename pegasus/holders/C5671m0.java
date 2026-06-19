package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4862g0;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/m0.class */
@StabilityInferred(parameters = 1)
public final class C5671m0 implements PegasusHolderInfo<fp0.k, LargeCoverV7Holder> {
    @NotNull
    public final Class<fp0.k> getDataClass() {
        return fp0.k.class;
    }

    @NotNull
    public final String getViewType() {
        return "large_cover_v7";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new LargeCoverV7Holder(C4862g0.inflate(layoutInflater, viewGroup, false));
    }
}
