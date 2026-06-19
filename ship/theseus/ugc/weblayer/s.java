package com.bilibili.ship.theseus.ugc.weblayer;

import com.bilibili.bplus.imageeditor.ImageEditorActivity;
import tv.danmaku.bili.widget.swiperefresh.TintSwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/s.class */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98700a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f98701b;

    public /* synthetic */ s(TintSwipeRefreshLayout tintSwipeRefreshLayout) {
        this.f98701b = tintSwipeRefreshLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98700a) {
            case 0:
                ((TintSwipeRefreshLayout) this.f98701b).setRefreshing(false);
                break;
            default:
                ImageEditorActivity imageEditorActivity = (ImageEditorActivity) this.f98701b;
                imageEditorActivity.T.setVisibility(0);
                imageEditorActivity.U.playAnimation();
                imageEditorActivity.U.setRepeatCount(-1);
                break;
        }
    }
}
