package com.bilibili.studio.videoeditor.util;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/Y.class */
public final class Y {
    public static void a(RecyclerView recyclerView) {
        recyclerView.getItemAnimator().setAddDuration(0L);
        recyclerView.getItemAnimator().setChangeDuration(0L);
        recyclerView.getItemAnimator().setMoveDuration(0L);
        recyclerView.getItemAnimator().setRemoveDuration(0L);
        ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    public static void b(View view) {
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }
}
