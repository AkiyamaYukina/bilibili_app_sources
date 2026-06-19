package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui;

import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.capturev3.music.r;
import com.bilibili.studio.videoeditor.util.U;
import com.bilibili.studio.videoeditor.widgets.MusicCropViewV2;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/e.class */
public final class e implements MusicCropViewV2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicChangeStartFragmentV5 f106858a;

    public e(BiliEditorMusicChangeStartFragmentV5 biliEditorMusicChangeStartFragmentV5) {
        this.f106858a = biliEditorMusicChangeStartFragmentV5;
    }

    @Override // com.bilibili.studio.videoeditor.widgets.MusicCropViewV2.a
    public final void a() {
        BiliEditorMusicChangeStartFragmentV5 biliEditorMusicChangeStartFragmentV5 = this.f106858a;
        biliEditorMusicChangeStartFragmentV5.getClass();
        my0.b bVarKf = biliEditorMusicChangeStartFragmentV5.kf();
        com.bilibili.studio.editor.timeline.i iVar = bVarKf.d.f4833c;
        if (iVar != null) {
            iVar.n();
        }
        r rVar = bVarKf.l;
        if (rVar != null) {
            rVar.e();
        }
        r rVar2 = biliEditorMusicChangeStartFragmentV5.kf().l;
        if (rVar2 != null) {
            rVar2.e();
        }
    }

    @Override // com.bilibili.studio.videoeditor.widgets.MusicCropViewV2.a
    public final void b(long j7) {
        BiliEditorMusicChangeStartFragmentV5 biliEditorMusicChangeStartFragmentV5 = this.f106858a;
        ly0.a aVar = biliEditorMusicChangeStartFragmentV5.f106818k;
        if (aVar != null) {
            aVar.g(biliEditorMusicChangeStartFragmentV5.f106815g, U.c(j7 / 1000));
        }
        biliEditorMusicChangeStartFragmentV5.f106817j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.widgets.MusicCropViewV2.a
    public final void c(long j7) {
        BiliEditorMusicChangeStartFragmentV5 biliEditorMusicChangeStartFragmentV5 = this.f106858a;
        if (biliEditorMusicChangeStartFragmentV5.isDetached() || !biliEditorMusicChangeStartFragmentV5.isAdded()) {
            BLog.e("BiliEditorMusicChangeStartFragmentV5", "不执行后续操作");
            return;
        }
        biliEditorMusicChangeStartFragmentV5.getClass();
        my0.b bVarKf = biliEditorMusicChangeStartFragmentV5.kf();
        bVarKf.h.setValue(Long.valueOf(j7));
        long j8 = bVarKf.k + j7;
        BMusic bMusic = (BMusic) bVarKf.m.getValue();
        long j9 = j8;
        if (bMusic != null) {
            long j10 = bMusic.totalTime;
            j9 = j8;
            if (j8 > j10) {
                j9 = j10;
            }
            bMusic.trimIn = j7;
            bMusic.trimOut = j9;
        }
        bVarKf.i.setValue(Long.valueOf(j9));
        bVarKf.J0();
        biliEditorMusicChangeStartFragmentV5.kf().K0();
    }
}
