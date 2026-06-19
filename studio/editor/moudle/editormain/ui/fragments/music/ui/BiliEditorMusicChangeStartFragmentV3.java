package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui;

import TB0.y0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicChangeStartFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/BiliEditorMusicChangeStartFragmentV3.class */
public class BiliEditorMusicChangeStartFragmentV3 extends BiliEditorMusicChangeStartFragment {
    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean qf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean rf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicChangeStartFragment
    @Nullable
    public final View xf(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        y0 y0VarInflate = y0.inflate(layoutInflater, viewGroup, false);
        this.f107952l = y0VarInflate;
        ConstraintLayout constraintLayout = null;
        if (y0VarInflate == null) {
            y0VarInflate = null;
        }
        if (y0VarInflate != null) {
            constraintLayout = y0VarInflate.f24065a;
        }
        return constraintLayout;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicChangeStartFragment
    @NotNull
    public final Kz0.a yf() {
        return new Kz0.a();
    }
}
