package com.bilibili.studio.videoeditor.widgets;

import com.bilibili.studio.videoeditor.widgets.EditorTrackView;
import com.bilibili.studio.videoeditor.widgets.track.timeaxis.TimeAxisZoomView;
import qD0.InterfaceC8406g;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/e.class */
public final class e implements InterfaceC8406g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditorTrackView f110444a;

    public e(EditorTrackView editorTrackView) {
        this.f110444a = editorTrackView;
    }

    @Override // qD0.InterfaceC8406g
    public final void a(int i7) {
        TimeAxisZoomView timeAxisZoomView = ((Kz0.b) this.f110444a.f110339r.a).f13208m;
        if (timeAxisZoomView != null) {
            timeAxisZoomView.c(i7, false);
        }
    }

    @Override // qD0.InterfaceC8406g
    public final void b() {
    }

    @Override // qD0.InterfaceC8406g
    public final void c(int i7, int i8, int i9) {
        AC0.g gVar;
        EditorTrackView editorTrackView = this.f110444a;
        editorTrackView.f110316G = i7;
        if (editorTrackView.f110311B == -1) {
            editorTrackView.f110313D = editorTrackView.h((int) (editorTrackView.f110326d.getX() + editorTrackView.f110316G));
        }
        editorTrackView.y((editorTrackView.f110311B == 3 || editorTrackView.f110313D == -1) ? 4 : 0);
        int i10 = editorTrackView.f110313D;
        if (i10 != -1) {
            editorTrackView.n(i10);
            editorTrackView.v(editorTrackView.f110313D);
        }
        int i11 = editorTrackView.f110311B;
        if ((i11 == -1 || i11 == 3) && editorTrackView.f110337p.isFinished() && (gVar = editorTrackView.f110338q) != null) {
            gVar.k(editorTrackView.getIndicatorTime());
        }
        EditorTrackView.a aVar = editorTrackView.f110341t;
        if (aVar != null && editorTrackView.f110311B != 3) {
            aVar.a(editorTrackView.f110313D, editorTrackView.d());
        }
        editorTrackView.invalidate();
    }
}
