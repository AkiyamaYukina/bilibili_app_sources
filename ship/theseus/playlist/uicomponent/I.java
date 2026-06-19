package com.bilibili.ship.theseus.playlist.uicomponent;

import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/I.class */
public final class I implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f95997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistRecyclerView f95998b;

    public I(ConstraintLayout constraintLayout, PlaylistRecyclerView playlistRecyclerView) {
        this.f95997a = constraintLayout;
        this.f95998b = playlistRecyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f95997a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f95998b.setPadding(0, this.f95997a.getHeight(), 0, 0);
    }
}
