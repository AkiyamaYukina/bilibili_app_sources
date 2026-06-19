package com.bilibili.studio.editor.moudle.musicv3.ui;

import Xz0.i;
import com.bilibili.studio.videoeditor.widgets.EditorTrackView;
import com.bilibili.studio.videoeditor.widgets.track.timeaxis.TimeAxisZoomView;
import kotlin.Lazy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/h.class */
public final class h implements AC0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicFragmentV3 f108041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kz0.b f108042b;

    public h(Kz0.b bVar, BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3) {
        this.f108041a = biliEditorMusicFragmentV3;
        this.f108042b = bVar;
    }

    @Override // AC0.g
    public final void h() {
        this.f108041a.jf();
        Lazy<Xz0.i> lazy = Xz0.i.f28467f;
        i.a.a().a();
    }

    @Override // AC0.g
    public final void k(long j7) {
        this.f108041a.P9(j7, true);
        Kz0.b bVar = this.f108042b;
        EditorTrackView editorTrackView = bVar.f13207l;
        if (editorTrackView == null) {
            return;
        }
        long jI = editorTrackView.i(editorTrackView.getIndicatorTime());
        TimeAxisZoomView timeAxisZoomView = bVar.f13208m;
        if (timeAxisZoomView != null) {
            timeAxisZoomView.a(jI, false);
        }
    }
}
