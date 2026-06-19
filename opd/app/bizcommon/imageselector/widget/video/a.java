package com.bilibili.opd.app.bizcommon.imageselector.widget.video;

import com.bilibili.opd.app.bizcommon.imageselector.page.w;
import com.bilibili.opd.app.bizcommon.imageselector.widget.MallMediaImageView;
import com.bilibili.opd.app.bizcommon.imageselector.widget.video.MallMediaVideoView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/video/a.class */
public final class a implements MallMediaVideoView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f73978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f73979b;

    public a(boolean z6, b bVar) {
        this.f73978a = z6;
        this.f73979b = bVar;
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.widget.video.MallMediaVideoView.a
    public final void a() {
        b bVar = this.f73979b;
        MallMediaVideoView mallMediaVideoView = bVar.f73980a;
        if (mallMediaVideoView != null) {
            mallMediaVideoView.setVisibility(8);
        }
        bVar.f73982c = false;
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.widget.video.MallMediaVideoView.a
    public final void b() {
        MallMediaVideoView mallMediaVideoView;
        if (!this.f73978a || (mallMediaVideoView = this.f73979b.f73980a) == null) {
            return;
        }
        mallMediaVideoView.c();
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.widget.video.MallMediaVideoView.a
    public final void c() {
        b bVar = this.f73979b;
        MallMediaVideoView mallMediaVideoView = bVar.f73980a;
        if (mallMediaVideoView != null) {
            mallMediaVideoView.setVisibility(8);
        }
        bVar.f73982c = false;
        w wVar = bVar.f73981b;
        if (wVar != null) {
            b.a(wVar.f73937c, wVar.f73938d);
            wVar.f73935a.setVisibility(0);
            MallMediaImageView mallMediaImageView = wVar.f73936b;
            if (mallMediaImageView != null) {
                mallMediaImageView.setVisibility(0);
            }
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.widget.video.MallMediaVideoView.a
    public final void onPlayStart() {
        b bVar = this.f73979b;
        MallMediaVideoView mallMediaVideoView = bVar.f73980a;
        if (mallMediaVideoView != null) {
            mallMediaVideoView.setVisibility(0);
        }
        bVar.f73982c = true;
        w wVar = bVar.f73981b;
        if (wVar != null) {
            wVar.f73935a.setVisibility(8);
            MallMediaImageView mallMediaImageView = wVar.f73936b;
            if (mallMediaImageView != null) {
                mallMediaImageView.setVisibility(8);
            }
        }
    }
}
