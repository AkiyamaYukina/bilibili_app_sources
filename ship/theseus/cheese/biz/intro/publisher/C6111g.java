package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/g.class */
public final class C6111g extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f89861a;

    public C6111g(Context context) {
        this.f89861a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        rect.right = (int) DpUtils.dp2px(this.f89861a, 8.0f);
    }
}
