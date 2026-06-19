package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui;

import TB0.p0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/BiliEditorMusicVolumeFragmentV3.class */
public class BiliEditorMusicVolumeFragmentV3 extends com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment {
    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment
    @Nullable
    public final View Af(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        p0 p0VarInflate = p0.inflate(layoutInflater, viewGroup, false);
        this.f108005l = p0VarInflate;
        ConstraintLayout constraintLayout = null;
        if (p0VarInflate == null) {
            p0VarInflate = null;
        }
        if (p0VarInflate != null) {
            constraintLayout = p0VarInflate.f23912a;
        }
        return constraintLayout;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment
    @NotNull
    public final Kz0.i Bf() {
        return new Kz0.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final void mf(@Nullable EditVideoInfo editVideoInfo, @Nullable BackUpTag backUpTag) {
        if (editVideoInfo != null) {
            Jz0.e eVar = this.f108010q;
            editVideoInfo.setEditorMusicInfo(eVar != null ? (EditorMusicInfo) ((Cz0.a) eVar.f16455d).f16451b : null);
        }
        this.f105685b.n(editVideoInfo, backUpTag);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean qf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean rf() {
        return true;
    }
}
