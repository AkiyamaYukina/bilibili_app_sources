package com.bilibili.playerbizcommon.features.gif;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bilibili.opd.app.core.config.ConfigService;
import tv.danmaku.android.log.BLog;
import tv.danmaku.render.core.IVideoRenderLayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/c.class */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f79801a;

    public c(b bVar) {
        this.f79801a = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = this.f79801a.f79771e;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        IVideoRenderLayer iVideoRenderLayer = this.f79801a.f79770d;
        if (iVideoRenderLayer != null) {
            ViewGroup viewGroup2 = this.f79801a.f79771e;
            int width = viewGroup2 != null ? viewGroup2.getWidth() : 0;
            ViewGroup viewGroup3 = this.f79801a.f79771e;
            iVideoRenderLayer.updateViewPort(new Rect(0, 0, width, viewGroup3 != null ? viewGroup3.getHeight() : 0));
        }
        b.a(this.f79801a);
        ViewGroup viewGroup4 = this.f79801a.f79771e;
        Integer numValueOf = null;
        Integer numValueOf2 = viewGroup4 != null ? Integer.valueOf(viewGroup4.getWidth()) : null;
        ViewGroup viewGroup5 = this.f79801a.f79771e;
        if (viewGroup5 != null) {
            numValueOf = Integer.valueOf(viewGroup5.getHeight());
        }
        BLog.i("GifPlayerContext", "resetPreViewContainer-set video size: " + numValueOf2 + ConfigService.ANY + numValueOf);
    }
}
