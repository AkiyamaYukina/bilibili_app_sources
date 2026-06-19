package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4854c0;
import com.bilibili.pegasus.PegasusHolderInfo;
import com.bilibili.pegasus.data.card.DislikeItemData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/q.class */
@StabilityInferred(parameters = 1)
public final class C5693q implements PegasusHolderInfo<DislikeItemData, C5691p> {
    @NotNull
    public final Class<DislikeItemData> getDataClass() {
        return DislikeItemData.class;
    }

    @NotNull
    public final String getViewType() {
        return "dislike_v2";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C5691p(C4854c0.inflate(layoutInflater, viewGroup, false).f53998a);
    }
}
