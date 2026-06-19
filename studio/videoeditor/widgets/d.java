package com.bilibili.studio.videoeditor.widgets;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/d.class */
public final class d extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditorTrackView f110443a;

    public d(EditorTrackView editorTrackView) {
        this.f110443a = editorTrackView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        EditorTrackView editorTrackView = this.f110443a;
        float y6 = motionEvent.getY();
        int i7 = EditorTrackView.f110309N;
        if (y6 < editorTrackView.getDrawRectTop() || y6 > editorTrackView.getDrawRectBottom()) {
            return;
        }
        int x6 = (int) motionEvent.getX();
        EditorTrackView editorTrackView2 = this.f110443a;
        int iH = editorTrackView2.h(x6 + editorTrackView2.f110316G);
        if (iH >= 0) {
            EditorTrackView editorTrackView3 = this.f110443a;
            editorTrackView3.f110313D = iH;
            editorTrackView3.f110311B = 3;
            editorTrackView3.y(4);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        int i7;
        if (EditorTrackView.c(this.f110443a.f110324b, motionEvent.getX(), motionEvent.getY()) || EditorTrackView.c(this.f110443a.f110325c, motionEvent.getX(), motionEvent.getY())) {
            EditorTrackView editorTrackView = this.f110443a;
            i7 = editorTrackView.f110313D;
            Nv.a aVar = editorTrackView.f110342u;
            if (aVar != null) {
                aVar.a(i7);
            }
        } else {
            int x6 = (int) motionEvent.getX();
            EditorTrackView editorTrackView2 = this.f110443a;
            int iH = editorTrackView2.h(x6 + editorTrackView2.f110316G);
            Nv.a aVar2 = this.f110443a.f110342u;
            if (aVar2 != null) {
                aVar2.a(iH);
            }
            i7 = iH;
            if (iH == this.f110443a.f110313D) {
                return true;
            }
        }
        if (i7 < 0) {
            return true;
        }
        EditorTrackView editorTrackView3 = this.f110443a;
        editorTrackView3.f110313D = i7;
        editorTrackView3.n(i7);
        this.f110443a.v(i7);
        this.f110443a.o();
        this.f110443a.y(0);
        return true;
    }
}
