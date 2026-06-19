package com.bilibili.studio.editor.moudle.musicv3.ui;

import com.bilibili.studio.videoeditor.util.U;
import com.bilibili.studio.videoeditor.widgets.MusicCropViewV2;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/d.class */
public final class d implements MusicCropViewV2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicChangeStartFragment f108036a;

    public d(BiliEditorMusicChangeStartFragment biliEditorMusicChangeStartFragment) {
        this.f108036a = biliEditorMusicChangeStartFragment;
    }

    @Override // com.bilibili.studio.videoeditor.widgets.MusicCropViewV2.a
    public final void a() {
        BiliEditorMusicChangeStartFragment biliEditorMusicChangeStartFragment = this.f108036a;
        biliEditorMusicChangeStartFragment.getClass();
        biliEditorMusicChangeStartFragment.jf();
        com.bilibili.studio.videoeditor.capturev3.music.r rVar = biliEditorMusicChangeStartFragment.wf().f15023e;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // com.bilibili.studio.videoeditor.widgets.MusicCropViewV2.a
    public final void b(long j7) {
        BiliEditorMusicChangeStartFragment biliEditorMusicChangeStartFragment = this.f108036a;
        Kz0.a aVar = biliEditorMusicChangeStartFragment.f107958r;
        if (aVar != null) {
            aVar.g(biliEditorMusicChangeStartFragment.f107952l, U.c(j7 / 1000));
        }
        biliEditorMusicChangeStartFragment.f107956p = true;
    }

    @Override // com.bilibili.studio.videoeditor.widgets.MusicCropViewV2.a
    public final void c(long j7) {
        BiliEditorMusicChangeStartFragment biliEditorMusicChangeStartFragment = this.f108036a;
        if (biliEditorMusicChangeStartFragment.isDetached() || !biliEditorMusicChangeStartFragment.isAdded()) {
            BLog.e("BiliEditorMusicChangeStartFragment", "不执行后续操作");
            return;
        }
        biliEditorMusicChangeStartFragment.getClass();
        biliEditorMusicChangeStartFragment.wf().N0(j7);
        biliEditorMusicChangeStartFragment.wf().K0();
    }
}
