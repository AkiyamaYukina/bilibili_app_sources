package com.bilibili.music.podcast.view;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/p.class */
public final class p extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f67313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f67314b;

    public p(r rVar, RecyclerView recyclerView) {
        this.f67314b = rVar;
        this.f67313a = recyclerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View childAt;
        if (motionEvent.getY() > this.f67314b.f67322g || (childAt = this.f67313a.getChildAt(0)) == null) {
            return false;
        }
        return this.f67314b.f67317b.e(motionEvent, this.f67313a.getChildAdapterPosition(childAt));
    }
}
