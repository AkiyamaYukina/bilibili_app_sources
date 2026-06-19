package com.bilibili.pegasus.channelv2.detail.tab.baike.widget;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import java.util.EnumMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/widget/e.class */
@StabilityInferred(parameters = 0)
public final class e extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EnumMap<DIRECTION, List<f>> f75219a;

    public e(@NotNull EnumMap<DIRECTION, List<f>> enumMap) {
        this.f75219a = enumMap;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(@NotNull RecyclerView recyclerView, int i7, int i8) {
        RecyclerView.ViewHolder childViewHolder;
        super.onScrolled(recyclerView, i7, i8);
        List<f> list = this.f75219a.get(i8 > 0 ? DIRECTION.DOWN : i8 < 0 ? DIRECTION.UP : DIRECTION.NONE);
        List<f> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        for (int childCount = recyclerView.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = recyclerView.getChildAt(childCount);
            float translationX = childAt.getTranslationX();
            float translationY = childAt.getTranslationY();
            for (f fVar : list) {
                int iIntValue = ((Number) fVar.f75220a.invoke(recyclerView, childAt)).intValue();
                int iIntValue2 = ((Number) fVar.f75221b.invoke(recyclerView, childAt)).intValue();
                float f7 = iIntValue;
                if (f7 >= childAt.getLeft() + translationX && f7 <= childAt.getRight() + translationX) {
                    float f8 = iIntValue2;
                    if (f8 >= childAt.getTop() + translationY && f8 <= childAt.getBottom() + translationY && (childViewHolder = recyclerView.getChildViewHolder(childAt)) != null && ((Boolean) fVar.f75222c.invoke(childViewHolder)).booleanValue()) {
                        fVar.f75223d.invoke(childViewHolder);
                    }
                }
            }
        }
    }
}
