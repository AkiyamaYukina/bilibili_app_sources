package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderInfo;
import com.bilibili.pegasus.data.card.DislikeItemData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/o.class */
@StabilityInferred(parameters = 1)
public final class C5674o implements PegasusHolderInfo<DislikeItemData, C5672n> {
    @NotNull
    public final Class<DislikeItemData> getDataClass() {
        return DislikeItemData.class;
    }

    @NotNull
    public final String getViewType() {
        return "dislike_v1";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C5647b(layoutInflater.inflate(2131498172, viewGroup, false));
    }
}
