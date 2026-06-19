package com.bilibili.playerbizcommonv2.widget.quality;

import com.bilibili.playerbizcommon.utils.ModGetHelper;
import com.bilibili.playerbizcommonv2.widget.quality.C5810g;
import com.opensource.svgaplayer.SVGAVideoEntity;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/h.class */
public final class C5811h implements ModGetHelper.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5810g f82825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5810g.b f82826b;

    public C5811h(C5810g c5810g, C5810g.b bVar) {
        this.f82825a = c5810g;
        this.f82826b = bVar;
    }

    @Override // com.bilibili.playerbizcommon.utils.ModGetHelper.c
    public final void a(SVGAVideoEntity sVGAVideoEntity) {
        if (sVGAVideoEntity == null) {
            BLog.e("dolby_vision anim parse fail");
            return;
        }
        C5810g.f82819b = true;
        this.f82825a.f82821a = sVGAVideoEntity;
        C5810g.b bVar = this.f82826b;
        bVar.f82822b.setVideoItem(sVGAVideoEntity);
        bVar.f82822b.stepToFrame(0, true);
    }
}
