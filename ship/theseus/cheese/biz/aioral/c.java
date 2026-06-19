package com.bilibili.ship.theseus.cheese.biz.aioral;

import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import fu0.C7179a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/aioral/c.class */
public final class c implements SVGAParser.ParseCompletion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C7179a f89015a;

    public c(C7179a c7179a) {
        this.f89015a = c7179a;
    }

    public final void onCacheExist() {
    }

    public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
        C7179a c7179a = this.f89015a;
        c7179a.f119523d.setVideoItem(sVGAVideoEntity);
        c7179a.f119523d.startAnimation();
    }

    public final void onError() {
    }
}
