package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.BasePegasusHolder;
import com.bilibili.pegasus.PegasusHolderInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/x.class */
@StabilityInferred(parameters = 1)
public final class C5706x implements PegasusHolderInfo<fp0.o, FooterEmptyHolder> {
    @NotNull
    public final Class<fp0.o> getDataClass() {
        return fp0.o.class;
    }

    @NotNull
    public final String getViewType() {
        return "footer_empty";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131498131, viewGroup, false);
        BasePegasusHolder basePegasusHolder = new BasePegasusHolder(viewInflate);
        ((TextView) viewInflate.findViewById(2131297926)).setOnClickListener(new FB.d(1, basePegasusHolder, viewInflate));
        return basePegasusHolder;
    }
}
