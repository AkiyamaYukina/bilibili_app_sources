package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui;

import TB0.r0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicFragmentV3;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.widgets.EditorTrackView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/BiliEditorMusicFragmentV5.class */
public final class BiliEditorMusicFragmentV5 extends BiliEditorMusicFragmentV3 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final a f106821v = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/BiliEditorMusicFragmentV5$a.class */
    public static final class a implements com.bilibili.studio.editor.timeline.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorMusicFragmentV5 f106822a;

        public a(BiliEditorMusicFragmentV5 biliEditorMusicFragmentV5) {
            this.f106822a = biliEditorMusicFragmentV5;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo] */
        @Override // com.bilibili.studio.editor.timeline.a
        public final void b(EditVideoInfo editVideoInfo, EditVideoInfo editVideoInfo2, BackUpTag backUpTag) {
            List<BClip> bClipList;
            BiliEditorMusicFragmentV5 biliEditorMusicFragmentV5 = this.f106822a;
            biliEditorMusicFragmentV5.f105686c = editVideoInfo2;
            ((Cz0.a) biliEditorMusicFragmentV5.wf().f16455d).f16451b = editVideoInfo2.getEditorMusicInfo();
            EditVideoClip userVideoTrack = editVideoInfo2.getUserVideoTrack();
            if (userVideoTrack == null || (bClipList = userVideoTrack.getBClipList()) == null) {
                return;
            }
            biliEditorMusicFragmentV5.yf(false, bClipList, editVideoInfo2.getEditorMusicInfo());
            long j7 = biliEditorMusicFragmentV5.f107967s;
            Kz0.b bVar = biliEditorMusicFragmentV5.f107968t;
            EditorTrackView editorTrackView = bVar.f13207l;
            if (editorTrackView != null) {
                editorTrackView.post(new com.bilibili.studio.editor.moudle.musicv3.ui.g(bVar, j7));
            }
        }
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicFragmentV3
    public final void Af() {
        super.Af();
        int i7 = this.f107969u;
        if (i7 == 1) {
            mf(this.f105686c, BackUpTag.MUSIC_REPLACE);
        } else if (i7 == 2) {
            mf(this.f105686c, BackUpTag.MUSIC_ADD);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicFragmentV3
    public final void Bf() {
        super.Bf();
        TextView textView = this.f107968t.f13203g;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final void mf(@Nullable EditVideoInfo editVideoInfo, @Nullable BackUpTag backUpTag) {
        if (editVideoInfo != null) {
            editVideoInfo.setEditorMusicInfo((EditorMusicInfo) ((Cz0.a) wf().f16455d).f16451b);
        }
        ey0.c cVar = this.f105685b;
        if (cVar != null) {
            cVar.n(editVideoInfo, backUpTag);
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.bilibili.studio.editor.timeline.i iVar = this.f105687d;
        ((ArrayList) iVar.f108309l).remove(this.f106821v);
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicFragmentV3, com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.bilibili.studio.editor.timeline.i iVar = this.f105687d;
        ((ArrayList) iVar.f108309l).add(this.f106821v);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean qf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean rf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicFragmentV3
    public final void xf() {
        jf();
        EditorTrackView editorTrackView = this.f107968t.f13207l;
        if (editorTrackView == null) {
            return;
        }
        editorTrackView.f110321L = true;
        if (wf().c(this.f107965q)) {
            mf(this.f105686c, BackUpTag.MUSIC_DEL);
            editorTrackView.s(this.f107965q);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicFragmentV3
    @Nullable
    public final View zf(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        r0 r0VarInflate = r0.inflate(layoutInflater, viewGroup, false);
        this.f107960l = r0VarInflate;
        ConstraintLayout constraintLayout = null;
        if (r0VarInflate == null) {
            r0VarInflate = null;
        }
        if (r0VarInflate != null) {
            constraintLayout = r0VarInflate.f23955a;
        }
        return constraintLayout;
    }
}
