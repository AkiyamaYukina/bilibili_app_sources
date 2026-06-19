package com.bilibili.ship.theseus.ugc.weblayer;

import android.graphics.Bitmap;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.render.core.IVideoRenderLayer;
import tv.danmaku.videoplayer.coreV2.IMediaPlayRenderContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/j.class */
public final class j implements IMediaPlayRenderContext.OnTakeVideoCapture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NoteFloatLayerService f98687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f98688b;

    public j(NoteFloatLayerService noteFloatLayerService, h hVar) {
        this.f98687a = noteFloatLayerService;
        this.f98688b = hVar;
    }

    public final void onResult(Bitmap bitmap) {
        NoteFloatLayerService noteFloatLayerService = this.f98687a;
        IPanelContainer panelContainer = noteFloatLayerService.f98609o.getPanelContainer();
        int height = 0;
        int width = panelContainer != null ? panelContainer.getWidth() : 0;
        PlayerContainer playerContainer = noteFloatLayerService.f98609o;
        IPanelContainer panelContainer2 = playerContainer.getPanelContainer();
        if (panelContainer2 != null) {
            height = panelContainer2.getHeight();
        }
        this.f98688b.a(IVideoRenderLayer.Companion.generateWYSIWYGCapture(bitmap, width, height, playerContainer.getRenderContainerService().getAspectRatio()), null);
    }
}
