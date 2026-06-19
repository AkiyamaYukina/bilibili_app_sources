package com.bilibili.music.podcast.view;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/q.class */
public final class q extends RecyclerView.SimpleOnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f67315a;

    public q(r rVar) {
        this.f67315a = rVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        return this.f67315a.f67318c.onTouchEvent(motionEvent);
    }
}
