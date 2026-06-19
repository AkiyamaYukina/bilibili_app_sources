package com.bilibili.studio.editor.moudle.musicv3.ui;

import com.bilibili.studio.videoeditor.widgets.EditorTrackView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/g.class */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Kz0.b f108039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f108040b;

    public /* synthetic */ g(Kz0.b bVar, long j7) {
        this.f108039a = bVar;
        this.f108040b = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Kz0.b bVar = this.f108039a;
        long j7 = this.f108040b;
        EditorTrackView editorTrackView = bVar.f13207l;
        if (editorTrackView != null) {
            editorTrackView.f110336o.d(editorTrackView.i(j7) - editorTrackView.f110316G);
        }
    }
}
