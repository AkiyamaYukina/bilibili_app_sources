package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui;

import TB0.B;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListContentFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/BiliEditorMusicListContentFragmentV3.class */
public class BiliEditorMusicListContentFragmentV3 extends BiliEditorMusicListContentFragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f106823A = 0;

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean qf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean rf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListContentFragment
    @Nullable
    public final View yf(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        B bInflate = B.inflate(layoutInflater, viewGroup, false);
        this.f107974l = bInflate;
        FrameLayout frameLayout = null;
        if (bInflate == null) {
            bInflate = null;
        }
        if (bInflate != null) {
            frameLayout = bInflate.f23470a;
        }
        return frameLayout;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListContentFragment
    @NotNull
    public final Kz0.f zf() {
        return new Kz0.f();
    }
}
