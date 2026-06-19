package com.bilibili.pegasus.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4856d0;
import com.bilibili.pegasus.PegasusHolderInfo;
import com.bilibili.pegasus.data.card.DislikeItemData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/w.class */
@StabilityInferred(parameters = 1)
public final class C5704w implements PegasusHolderInfo<DislikeItemData, C5702v> {
    @NotNull
    public final Class<DislikeItemData> getDataClass() {
        return DislikeItemData.class;
    }

    @NotNull
    public final String getViewType() {
        return "dislike_v3";
    }

    public final RecyclerView.ViewHolder onCreateHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C5702v(C4856d0.inflate(layoutInflater, viewGroup, false).f54006a);
    }
}
