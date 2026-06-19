package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui;

import TB0.E;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListContentFragment;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/BiliEditorMusicListFragmentV3.class */
public class BiliEditorMusicListFragmentV3 extends BiliEditorMusicListFragment {
    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListFragment
    @NotNull
    public final Kz0.h Af() {
        return new Kz0.h();
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListFragment, com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Kz0.h hVar = this.f107992q;
        if (hVar != null) {
            hVar.e(this.f107988m);
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean qf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final boolean rf() {
        return true;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListFragment
    @NotNull
    public BiliEditorMusicListContentFragment xf() {
        int i7 = BiliEditorMusicListContentFragmentV3.f106823A;
        Bundle bundleB = B1.a.b(2, "key_tab_from");
        BiliEditorMusicListContentFragmentV3 biliEditorMusicListContentFragmentV3 = new BiliEditorMusicListContentFragmentV3();
        biliEditorMusicListContentFragmentV3.setArguments(bundleB);
        return biliEditorMusicListContentFragmentV3;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListFragment
    @NotNull
    public com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment yf() {
        BiliEditorMusicVolumeFragmentV3 biliEditorMusicVolumeFragmentV3 = new BiliEditorMusicVolumeFragmentV3();
        Bundle bundleA = com.bilibili.biligame.router.k.a(0, 2, "current_select_index", "volume_tab_from");
        bundleA.putSerializable("current_select_music", null);
        biliEditorMusicVolumeFragmentV3.setArguments(bundleA);
        return biliEditorMusicVolumeFragmentV3;
    }

    @Override // com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListFragment
    @Nullable
    public final View zf(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        E eInflate = E.inflate(layoutInflater, viewGroup, false);
        this.f107988m = eInflate;
        LinearLayout linearLayout = null;
        if (eInflate == null) {
            eInflate = null;
        }
        if (eInflate != null) {
            linearLayout = eInflate.f23506a;
        }
        return linearLayout;
    }
}
