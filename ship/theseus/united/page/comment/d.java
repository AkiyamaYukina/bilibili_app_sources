package com.bilibili.ship.theseus.united.page.comment;

import android.graphics.Bitmap;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.render.core.IVideoRenderLayer;
import tv.danmaku.videoplayer.coreV2.IMediaPlayRenderContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/d.class */
public final class d implements IMediaPlayRenderContext.OnTakeVideoCapture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TheseusCommentService f99294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f99295b;

    public d(TheseusCommentService theseusCommentService, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f99294a = theseusCommentService;
        this.f99295b = cancellableContinuationImpl;
    }

    public final void onResult(Bitmap bitmap) {
        TheseusCommentService theseusCommentService = this.f99294a;
        IPanelContainer panelContainer = theseusCommentService.f99235g.getPanelContainer();
        Bitmap bitmapGenerateWYSIWYGCapture = bitmap;
        if (panelContainer != null) {
            bitmapGenerateWYSIWYGCapture = IVideoRenderLayer.Companion.generateWYSIWYGCapture(bitmap, panelContainer.getWidth(), panelContainer.getHeight(), theseusCommentService.f99235g.getAspectRatio());
        }
        com.bilibili.ogv.infra.coroutine.a.a(this.f99295b, bitmapGenerateWYSIWYGCapture);
    }
}
