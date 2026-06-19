package com.bilibili.studio.editor.moudle.musicv3.ui;

import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.videoeditor.util.C6635h;
import com.bilibili.studio.videoeditor.widgets.EditorTrackView;
import com.bilibili.studio.videoeditor.widgets.track.media.BiliEditorMediaTrackView;
import com.bilibili.studio.videoeditor.widgets.track.timeaxis.TimeAxisZoomView;
import java.util.Iterator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/k.class */
public final class k implements TimeAxisZoomView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Kz0.b f108046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliEditorMusicFragmentV3 f108047b;

    public k(Kz0.b bVar, BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3) {
        this.f108046a = bVar;
        this.f108047b = biliEditorMusicFragmentV3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.widgets.track.timeaxis.TimeAxisZoomView.a
    public final void a() {
        Kz0.b bVar = this.f108046a;
        TimeAxisZoomView timeAxisZoomView = bVar.f13208m;
        if (timeAxisZoomView != null) {
            long frameDuration = timeAxisZoomView.getFrameDuration();
            EditorTrackView editorTrackView = bVar.f13207l;
            if (editorTrackView != null) {
                BiliEditorMediaTrackView biliEditorMediaTrackView = editorTrackView.f110336o;
                Iterator<T> it = biliEditorMediaTrackView.f110516i.iterator();
                while (it.hasNext()) {
                    ((qD0.a) it.next()).b(frameDuration);
                }
                biliEditorMediaTrackView.h();
                biliEditorMediaTrackView.postInvalidate();
            }
            BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = this.f108047b;
            biliEditorMusicFragmentV3.Df((EditorMusicInfo) ((Cz0.a) biliEditorMusicFragmentV3.wf().f16455d).f16451b);
            if (biliEditorMusicFragmentV3.f107962n) {
                return;
            }
            biliEditorMusicFragmentV3.f107962n = true;
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_music_behave_zoom", "click", C6635h.d().toString()});
        }
    }

    @Override // com.bilibili.studio.videoeditor.widgets.track.timeaxis.TimeAxisZoomView.a
    public final void b(long j7, boolean z6) {
        EditorTrackView editorTrackView;
        if (!z6 || (editorTrackView = this.f108046a.f13207l) == null) {
            return;
        }
        editorTrackView.w((int) j7);
    }
}
