package com.bilibili.playerbizcommon.features.gif;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bilibili.opd.app.core.config.ConfigService;
import tv.danmaku.android.log.BLog;
import tv.danmaku.render.core.IVideoRenderLayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/e.class */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f79802a;

    public e(b bVar) {
        this.f79802a = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.f79802a.f79771e;
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        IVideoRenderLayer iVideoRenderLayer = this.f79802a.f79770d;
        if (iVideoRenderLayer != null) {
            iVideoRenderLayer.updateViewPort(new Rect(0, 0, viewGroup.getWidth(), viewGroup.getHeight()));
        }
        ViewGroup viewGroup2 = this.f79802a.f79771e;
        Integer numValueOf = null;
        Integer numValueOf2 = viewGroup2 != null ? Integer.valueOf(viewGroup2.getWidth()) : null;
        ViewGroup viewGroup3 = this.f79802a.f79771e;
        if (viewGroup3 != null) {
            numValueOf = Integer.valueOf(viewGroup3.getHeight());
        }
        BLog.i("GifPlayerContext", "set video size: " + numValueOf2 + ConfigService.ANY + numValueOf);
    }
}
