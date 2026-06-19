package com.bilibili.ship.theseus.ogv.misc;

import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/misc/e.class */
public final class e implements SVGAParser.ParseCompletion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SVGAImageView f94053a;

    public e(SVGAImageView sVGAImageView) {
        this.f94053a = sVGAImageView;
    }

    public final void onCacheExist() {
    }

    public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
        SVGAImageView sVGAImageView = this.f94053a;
        sVGAImageView.setVideoItem(sVGAVideoEntity);
        sVGAImageView.startAnimation();
    }

    public final void onError() {
    }
}
