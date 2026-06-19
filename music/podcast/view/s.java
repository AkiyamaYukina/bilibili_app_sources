package com.bilibili.music.podcast.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/s.class */
public final class s extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MusicTopCarLayout f67323a;

    public s(MusicTopCarLayout musicTopCarLayout) {
        this.f67323a = musicTopCarLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        rect.right = (int) DpUtils.dp2px(this.f67323a.getContext(), 8.0f);
    }
}
