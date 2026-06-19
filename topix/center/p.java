package com.bilibili.topix.center;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.exposer.child.ExposeItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/p.class */
@StabilityInferred(parameters = 1)
public final class p implements dY.d {
    public final boolean a(@NotNull View view) {
        ViewParent parent = view.getParent();
        RecyclerView.ViewHolder childViewHolder = null;
        if (parent != null) {
            RecyclerView recyclerView = (RecyclerView) (parent instanceof RecyclerView ? parent : null);
            childViewHolder = null;
            if (recyclerView != null) {
                childViewHolder = recyclerView.getChildViewHolder(view);
            }
        }
        return childViewHolder instanceof ExposeItem;
    }
}
