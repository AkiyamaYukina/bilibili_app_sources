package com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.music;

import Df.f;
import Kz0.h;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicListFragmentV3;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListContentFragment;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment;
import com.bilibili.studio.editor.moudle.templatev2.vm.k;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import ey0.c;
import ey0.d;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/template/music/BiliEditorMusicListFragmentOfTemV3.class */
public final class BiliEditorMusicListFragmentOfTemV3 extends BiliEditorMusicListFragmentV3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lazy f107006r = LazyKt.lazy(new f(this, 5));

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicListFragmentV3, com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListFragment, com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        h hVar = this.f107992q;
        if (hVar != null) {
            hVar.f(this.f107988m);
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final void pf(@Nullable Activity activity) {
        super.pf(activity);
        c cVar = ((k) this.f107006r.getValue()).f108195c;
        k.a aVar = ((k) this.f107006r.getValue()).f108194b;
        if (aVar == null || cVar == null) {
            return;
        }
        this.f105685b = new d(aVar, cVar);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final void sf() {
        EditVideoInfo editVideoInfo = ((k) this.f107006r.getValue()).f108196d;
        if (editVideoInfo != null) {
            this.f105686c = editVideoInfo;
        }
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicListFragmentV3, com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListFragment
    @NotNull
    public final BiliEditorMusicListContentFragment xf() {
        BiliEditorMusicListContentFragmentOfTemV3 biliEditorMusicListContentFragmentOfTemV3 = new BiliEditorMusicListContentFragmentOfTemV3();
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab_from", 3);
        biliEditorMusicListContentFragmentOfTemV3.setArguments(bundle);
        return biliEditorMusicListContentFragmentOfTemV3;
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicListFragmentV3, com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListFragment
    @NotNull
    public final BiliEditorMusicVolumeFragment yf() {
        BiliEditorMusicVolumeFragmentOfTemV3 biliEditorMusicVolumeFragmentOfTemV3 = new BiliEditorMusicVolumeFragmentOfTemV3();
        Bundle bundleA = com.bilibili.biligame.router.k.a(0, 3, "current_select_index", "volume_tab_from");
        bundleA.putSerializable("current_select_music", null);
        biliEditorMusicVolumeFragmentOfTemV3.setArguments(bundleA);
        return biliEditorMusicVolumeFragmentOfTemV3;
    }
}
