package com.bilibili.studio.videoeditor.extension;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/p.class */
public final class p {
    public static final void a(@Nullable View view) {
        if (view == null || view.getVisibility() == 8) {
            view = null;
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void b(View view, Function0 function0) {
        if (view == null) {
            return;
        }
        view.postDelayed(new o(view, function0), 0L);
    }

    public static final void c(@Nullable RecyclerView recyclerView, int i7, @Nullable Integer num) {
        RecyclerView.LayoutManager layoutManager;
        if (i7 < 0 || recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewFindViewByPosition = layoutManager.findViewByPosition(i7);
        if (viewFindViewByPosition == null || !layoutManager.isViewPartiallyVisible(viewFindViewByPosition, true, false)) {
            if (num == null || !(layoutManager instanceof LinearLayoutManager)) {
                recyclerView.scrollToPosition(i7);
            } else {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i7, num.intValue());
            }
        }
    }

    public static final void d(@Nullable View view) {
        if (view == null || view.getVisibility() == 0) {
            view = null;
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
