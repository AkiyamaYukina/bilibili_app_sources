package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/E0.class */
@StabilityInferred(parameters = 1)
public final class E0 implements PegasusHolderInfo<fp0.o, PullDownTipsHolder> {
    @NotNull
    public final Class<fp0.o> getDataClass() {
        return fp0.o.class;
    }

    @NotNull
    public final String getViewType() {
        return "pull_down_tip_v2";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new PullDownTipsHolder(layoutInflater.inflate(2131498170, viewGroup, false));
    }
}
