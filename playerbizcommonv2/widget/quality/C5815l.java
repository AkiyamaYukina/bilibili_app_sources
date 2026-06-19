package com.bilibili.playerbizcommonv2.widget.quality;

import com.bilibili.playerbizcommon.utils.ModGetHelper;
import com.bilibili.playerbizcommonv2.widget.quality.C5814k;
import com.opensource.svgaplayer.SVGAVideoEntity;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/l.class */
public final class C5815l implements ModGetHelper.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5814k f82856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5814k.b f82857b;

    public C5815l(C5814k.b bVar, C5814k c5814k) {
        this.f82856a = c5814k;
        this.f82857b = bVar;
    }

    @Override // com.bilibili.playerbizcommon.utils.ModGetHelper.c
    public final void a(SVGAVideoEntity sVGAVideoEntity) {
        if (sVGAVideoEntity == null) {
            BLog.e("hdr anim parse fail");
            return;
        }
        C5814k.f82847d = true;
        this.f82856a.f82851c = sVGAVideoEntity;
        C5814k.b bVar = this.f82857b;
        bVar.f82852b.setVideoItem(sVGAVideoEntity);
        bVar.f82852b.stepToFrame(0, true);
    }
}
