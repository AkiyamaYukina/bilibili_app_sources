package com.bilibili.ship.theseus.ugc.pages;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import tv.danmaku.bili.widget.SpacesItemDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/r.class */
public final class r extends SpacesItemDecoration {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f98056f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i7, Context context) {
        super(i7, 2);
        this.f98056f = context;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int iB = Uj0.c.b(4.0f, this.f98056f);
        rect.top = iB * 3;
        rect.bottom = -iB;
        rect.left = iB;
        rect.right = iB;
    }
}
