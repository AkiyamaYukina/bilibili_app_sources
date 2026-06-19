package com.bilibili.studio.editor.moudle.musicv3.ui;

import android.widget.TextView;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.util.C6635h;
import com.bilibili.studio.videoeditor.widgets.EditorTrackView;
import com.bilibili.studio.videoeditor.widgets.TrackEditEntry;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/i.class */
public final class i implements EditorTrackView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicFragmentV3 f108043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kz0.b f108044b;

    public i(Kz0.b bVar, BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3) {
        this.f108043a = biliEditorMusicFragmentV3;
        this.f108044b = bVar;
    }

    @Override // com.bilibili.studio.videoeditor.widgets.EditorTrackView.a
    public final void a(int i7, boolean z6) {
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = this.f108043a;
        biliEditorMusicFragmentV3.f107964p = z6;
        biliEditorMusicFragmentV3.f107965q = i7;
        if (i7 == -1) {
            biliEditorMusicFragmentV3.Bf();
            return;
        }
        EditorTrackView editorTrackView = this.f108044b.f13207l;
        if (editorTrackView == null) {
            return;
        }
        TrackEditEntry trackEditEntry = editorTrackView.f110343v.get(i7);
        boolean z7 = trackEditEntry.outPoint - trackEditEntry.inPoint > trackEditEntry.trimOut - trackEditEntry.trimIn;
        TrackEditEntry trackEditEntry2 = editorTrackView.f110343v.get(i7);
        boolean z8 = trackEditEntry2.trimOut - trackEditEntry2.trimIn < editorTrackView.j(i7) - trackEditEntry2.inPoint;
        TextView textView = biliEditorMusicFragmentV3.f107968t.f13197a;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = biliEditorMusicFragmentV3.f107968t.f13197a;
        if (textView2 != null) {
            textView2.setEnabled(false);
        }
        if (z8) {
            TextView textView3 = biliEditorMusicFragmentV3.f107968t.f13198b;
            if (textView3 != null) {
                textView3.setVisibility(z7 ? 8 : 0);
            }
            TextView textView4 = biliEditorMusicFragmentV3.f107968t.f13198b;
            if (textView4 != null) {
                textView4.setEnabled(!z7);
            }
            TextView textView5 = biliEditorMusicFragmentV3.f107968t.f13199c;
            if (textView5 != null) {
                int i8 = 8;
                if (z7) {
                    i8 = 0;
                }
                textView5.setVisibility(i8);
            }
            TextView textView6 = biliEditorMusicFragmentV3.f107968t.f13199c;
            if (textView6 != null) {
                textView6.setEnabled(z7);
            }
        } else {
            TextView textView7 = biliEditorMusicFragmentV3.f107968t.f13198b;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            TextView textView8 = biliEditorMusicFragmentV3.f107968t.f13199c;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
        }
        TextView textView9 = biliEditorMusicFragmentV3.f107968t.f13200d;
        if (textView9 != null) {
            textView9.setVisibility(0);
        }
        TextView textView10 = biliEditorMusicFragmentV3.f107968t.f13200d;
        if (textView10 != null) {
            textView10.setEnabled(true);
        }
        TextView textView11 = biliEditorMusicFragmentV3.f107968t.f13201e;
        if (textView11 != null) {
            textView11.setVisibility(0);
        }
        TextView textView12 = biliEditorMusicFragmentV3.f107968t.f13201e;
        if (textView12 != null) {
            textView12.setEnabled(true);
        }
        TextView textView13 = biliEditorMusicFragmentV3.f107968t.f13203g;
        if (textView13 != null) {
            textView13.setVisibility(0);
        }
        TextView textView14 = biliEditorMusicFragmentV3.f107968t.f13203g;
        if (textView14 != null) {
            textView14.setEnabled(true);
        }
        TextView textView15 = biliEditorMusicFragmentV3.f107968t.f13202f;
        if (textView15 != null) {
            textView15.setVisibility(0);
        }
        TextView textView16 = biliEditorMusicFragmentV3.f107968t.f13202f;
        if (textView16 != null) {
            textView16.setEnabled(true);
        }
    }

    @Override // com.bilibili.studio.videoeditor.widgets.EditorTrackView.a
    public final void b(int i7, boolean z6) {
        if (z6) {
            return;
        }
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_music_clip_move", "click", C6635h.e()});
        Xz0.d dVar = Xz0.d.f28458a;
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = this.f108043a;
        String strE = com.bilibili.studio.videoeditor.extension.l.e(biliEditorMusicFragmentV3.f105686c);
        BMusic bMusicE = biliEditorMusicFragmentV3.wf().e(i7);
        String strValueOf = String.valueOf(bMusicE != null ? Long.valueOf(bMusicE.bgmSid) : null);
        dVar.getClass();
        Xz0.d.D("0", "1", strE, strValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.widgets.EditorTrackView.a
    public final void c(int i7, long j7, int i8, long j8) {
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = this.f108043a;
        Jz0.e eVarWf = biliEditorMusicFragmentV3.wf();
        BMusic bMusicE = eVarWf.e(i7);
        if (bMusicE != null) {
            if (i8 == 1) {
                long j9 = (j8 - j7) - (bMusicE.outPoint - bMusicE.inPoint);
                String str = j9 > 0 ? "2" : j9 == 0 ? "0" : "1";
                if (j9 != 0) {
                    eVarWf.h = true;
                }
                Xz0.d dVar = Xz0.d.f28458a;
                String strE = com.bilibili.studio.videoeditor.extension.l.e(eVarWf.f16453b);
                BMusic bMusicE2 = eVarWf.e(i7);
                String strValueOf = String.valueOf(bMusicE2 != null ? Long.valueOf(bMusicE2.bgmSid) : null);
                dVar.getClass();
                Xz0.d.D(str, "0", strE, strValueOf);
            }
            bMusicE.inPoint = j7;
            bMusicE.outPoint = j8;
            eVarWf.f16456e.getClass();
            UpperTimeline upperTimelineC = UC0.n.c();
            if (upperTimelineC != null) {
                upperTimelineC.buildBgmAudio((EditorMusicInfo) ((Cz0.a) eVarWf.f16455d).f16451b);
            }
        }
        if (i8 == 1) {
            biliEditorMusicFragmentV3.mf(biliEditorMusicFragmentV3.f105686c, BackUpTag.MUSIC_CLIP);
        }
    }
}
