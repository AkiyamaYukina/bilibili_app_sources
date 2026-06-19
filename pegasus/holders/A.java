package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.BasePegasusHolder;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/A.class */
@StabilityInferred(parameters = 1)
public final class A implements PegasusHolderInfo<fp0.o, C5710z> {
    @NotNull
    public final Class<fp0.o> getDataClass() {
        return fp0.o.class;
    }

    @NotNull
    public final String getViewType() {
        return "footer_loading";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new BasePegasusHolder(layoutInflater.inflate(2131498132, viewGroup, false));
    }
}
