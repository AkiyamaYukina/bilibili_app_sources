package com.bilibili.playerbizcommonv2.widget.quality;

import com.bilibili.lib.resmanager.ResCallback;
import com.bilibili.lib.resmanager.ResResponse;
import com.bilibili.playerbizcommon.utils.ModGetHelper;
import com.bilibili.playerbizcommonv2.widget.quality.C5814k;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAVideoEntity;
import java.io.File;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/m.class */
public final class C5816m implements ResCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5814k f82858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5814k.b f82859b;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.m$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/m$a.class */
    public static final class a implements ModGetHelper.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5814k.b f82860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5814k f82861b;

        public a(C5814k.b bVar, C5814k c5814k) {
            this.f82860a = bVar;
            this.f82861b = c5814k;
        }

        @Override // com.bilibili.playerbizcommon.utils.ModGetHelper.d
        public final void b() {
            BLog.e("hdr anim parse fail");
        }

        @Override // com.bilibili.playerbizcommon.utils.ModGetHelper.d
        public final void c(SVGAVideoEntity sVGAVideoEntity) {
            C5814k.b bVar = this.f82860a;
            if (bVar.f82852b.isDetached()) {
                return;
            }
            C5814k.f82847d = true;
            this.f82861b.f82851c = sVGAVideoEntity;
            SVGAImageView sVGAImageView = bVar.f82852b;
            sVGAImageView.setVideoItem(sVGAVideoEntity);
            sVGAImageView.stepToFrame(0, true);
            BLog.i("hdr anim parse success");
        }
    }

    public C5816m(C5814k.b bVar, C5814k c5814k) {
        this.f82858a = c5814k;
        this.f82859b = bVar;
    }

    @Override // com.bilibili.lib.resmanager.ResCallback
    public final void onFailure(int i7, String str) {
        String str2 = this.f82858a.f82850b;
        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "hdr anim load fail: ", " :", str, " :");
        sbB.append(str2);
        BLog.e(sbB.toString());
    }

    @Override // com.bilibili.lib.resmanager.ResCallback
    public final void onSuccess(ResResponse resResponse) {
        BLog.i("hdr anim load success");
        File file = resResponse.getFile();
        if (file == null || !file.exists()) {
            BLog.e("hdr anim parse fail: file not exist");
        } else {
            ModGetHelper.getSvgaFile(resResponse.getFile(), new a(this.f82859b, this.f82858a));
        }
    }
}
