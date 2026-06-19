package com.bilibili.lib.projection.internal.widget;

import com.opensource.svgaplayer.SVGACallback;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/z.class */
public final class z implements SVGAParser.ParseCompletion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionTitleWidget f64153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64154b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/z$a.class */
    public static final class a implements SVGACallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionTitleWidget f64155a;

        public a(ProjectionTitleWidget projectionTitleWidget) {
            this.f64155a = projectionTitleWidget;
        }

        public final void onFinished() {
            ProjectionTitleWidget projectionTitleWidget = this.f64155a;
            x xVar = projectionTitleWidget.f63856j;
            if (xVar != null) {
                xVar.c(projectionTitleWidget.f63859m);
            }
        }

        public final void onPause() {
        }

        public final void onPreStart() {
        }

        public final void onRepeat() {
        }

        public final void onStep(int i7, double d7) {
        }
    }

    public z(ProjectionTitleWidget projectionTitleWidget, int i7) {
        this.f64153a = projectionTitleWidget;
        this.f64154b = i7;
    }

    public final void onCacheExist() {
    }

    public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
        ProjectionTitleWidget projectionTitleWidget = this.f64153a;
        x xVar = projectionTitleWidget.f63856j;
        if (xVar != null) {
            xVar.d();
        }
        SVGAImageView sVGAImageView = projectionTitleWidget.f63852e;
        if (sVGAImageView != null) {
            sVGAImageView.setVideoItem(sVGAVideoEntity);
        }
        SVGAImageView sVGAImageView2 = projectionTitleWidget.f63852e;
        if (sVGAImageView2 != null) {
            sVGAImageView2.setLoops(this.f64154b);
        }
        SVGAImageView sVGAImageView3 = projectionTitleWidget.f63852e;
        if (sVGAImageView3 != null) {
            sVGAImageView3.startAnimation();
        }
        SVGAImageView sVGAImageView4 = projectionTitleWidget.f63852e;
        if (sVGAImageView4 != null) {
            sVGAImageView4.setCallback(new a(projectionTitleWidget));
        }
    }

    public final void onError() {
    }
}
