package com.bilibili.studio.videoeditor.bgm;

import com.bilibili.studio.videoeditor.bgm.BgmLocalAdapter;
import com.bilibili.studio.videoeditor.util.U;
import com.bilibili.studio.videoeditor.widgets.MusicCropView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/o.class */
public final class o implements MusicCropView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BgmLocalAdapter.c f109094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BgmLocalAdapter f109095b;

    public o(BgmLocalAdapter bgmLocalAdapter, BgmLocalAdapter.c cVar) {
        this.f109095b = bgmLocalAdapter;
        this.f109094a = cVar;
    }

    @Override // com.bilibili.studio.videoeditor.widgets.MusicCropView.a
    public final void a() {
        BgmLocalAdapter.c cVar = this.f109094a;
        cVar.f108935k = true;
        aD0.f.d().f("BgmLocalAdapter onDragStart");
        cVar.f108934j.setImageResource(2131244231);
    }

    @Override // com.bilibili.studio.videoeditor.widgets.MusicCropView.a
    public final void b(long j7) {
        this.f109094a.f108930e.setText(U.c(j7 / 1000));
    }

    @Override // com.bilibili.studio.videoeditor.widgets.MusicCropView.a
    public final void c(long j7) {
        BgmLocalAdapter.c cVar = this.f109094a;
        cVar.f108935k = false;
        long j8 = j7 / 1000;
        BgmLocalAdapter bgmLocalAdapter = this.f109095b;
        bgmLocalAdapter.f108920e = j8;
        bgmLocalAdapter.f108921f.f108925b = j8;
        aD0.f.d().h(bgmLocalAdapter.f108920e);
        aD0.f.d().g();
        cVar.f108934j.setImageResource(2131236411);
    }
}
