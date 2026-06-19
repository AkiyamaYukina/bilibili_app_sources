package com.bilibili.studio.editor.moudle.musicv3.ui;

import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicChangeStartFragment;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/l.class */
public final class l implements BiliEditorMusicChangeStartFragment.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicFragmentV3 f108048a;

    public l(BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3) {
        this.f108048a = biliEditorMusicFragmentV3;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicChangeStartFragment.a
    public final long a() {
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = this.f108048a;
        BMusic bMusicE = biliEditorMusicFragmentV3.wf().e(biliEditorMusicFragmentV3.f107965q);
        return bMusicE != null ? bMusicE.outPoint - bMusicE.inPoint : 0L;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicChangeStartFragment.a
    public final void b(BMusic bMusic, Function1<? super Boolean, Unit> function1) {
        if (bMusic == null) {
            return;
        }
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = this.f108048a;
        BMusic bMusicE = biliEditorMusicFragmentV3.wf().e(biliEditorMusicFragmentV3.f107965q);
        if (bMusicE == null) {
            return;
        }
        bMusicE.trimIn = bMusic.trimIn;
        bMusicE.trimOut = bMusic.trimOut;
        biliEditorMusicFragmentV3.La(function1);
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicChangeStartFragment.a
    public final EditVideoInfo c(BMusic bMusic) {
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3;
        EditVideoInfo editVideoInfoQ0;
        EditorMusicInfo editorMusicInfo;
        ArrayList<BMusic> arrayList;
        BMusic bMusic2;
        if (bMusic == null || (editVideoInfoQ0 = (biliEditorMusicFragmentV3 = this.f108048a).Q0()) == null || (editorMusicInfo = editVideoInfoQ0.getEditorMusicInfo()) == null || (arrayList = editorMusicInfo.bMusicList) == null || (bMusic2 = (BMusic) CollectionsKt.getOrNull(arrayList, biliEditorMusicFragmentV3.f107965q)) == null) {
            return null;
        }
        bMusic2.trimIn = bMusic.trimIn;
        bMusic2.trimOut = bMusic.trimOut;
        return editVideoInfoQ0;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicChangeStartFragment.a
    public final void d(BMusic bMusic) {
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = this.f108048a;
        biliEditorMusicFragmentV3.f105685b.a(biliEditorMusicFragmentV3);
        if (bMusic != null) {
            boolean z6 = bMusic.fadeIn;
            boolean z7 = bMusic.fadeOut;
            BMusic bMusicE = biliEditorMusicFragmentV3.wf().e(biliEditorMusicFragmentV3.f107965q);
            long j7 = 0;
            long j8 = bMusicE != null ? bMusicE.fadeInValue : 0L;
            BMusic bMusicE2 = biliEditorMusicFragmentV3.wf().e(biliEditorMusicFragmentV3.f107965q);
            if (bMusicE2 != null) {
                j7 = bMusicE2.fadeOutValue;
            }
            long j9 = bMusic.trimIn;
            long j10 = bMusic.trimOut;
            BMusic bMusicE3 = biliEditorMusicFragmentV3.wf().e(biliEditorMusicFragmentV3.f107965q);
            biliEditorMusicFragmentV3.wf().d(biliEditorMusicFragmentV3.f107965q, new BiliEditorMusicVolumeFragment.a(z6, z7, j8, j7, j9, j10, bMusicE3 != null ? bMusicE3.ratioMusic : 0.0f, biliEditorMusicFragmentV3.f105686c.getNativeVolume(), 0, 0, null), true);
            biliEditorMusicFragmentV3.mf(biliEditorMusicFragmentV3.f105686c, BackUpTag.MUSIC_POINT_CHANGE);
            biliEditorMusicFragmentV3.kf();
        }
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicChangeStartFragment.a
    public final BMusic e() {
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = this.f108048a;
        return biliEditorMusicFragmentV3.wf().e(biliEditorMusicFragmentV3.f107965q);
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicChangeStartFragment.a
    public final void onCancel() {
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = this.f108048a;
        biliEditorMusicFragmentV3.P9(biliEditorMusicFragmentV3.f107967s, false);
        biliEditorMusicFragmentV3.f105685b.a(biliEditorMusicFragmentV3);
    }
}
