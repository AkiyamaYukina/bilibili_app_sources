package com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.music;

import Df.f;
import android.app.Activity;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui.BiliEditorMusicVolumeFragmentV3;
import com.bilibili.studio.editor.moudle.templatev2.vm.k;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import ey0.c;
import ey0.d;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/template/music/BiliEditorMusicVolumeFragmentOfTemV3.class */
public final class BiliEditorMusicVolumeFragmentOfTemV3 extends BiliEditorMusicVolumeFragmentV3 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f107007u = LazyKt.lazy(new f(this, 5));

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final void pf(@Nullable Activity activity) {
        super.pf(activity);
        c cVar = ((k) this.f107007u.getValue()).f108195c;
        k.a aVar = ((k) this.f107007u.getValue()).f108194b;
        if (aVar == null || cVar == null) {
            return;
        }
        this.f105685b = new d(aVar, cVar);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    public final void sf() {
        EditVideoInfo editVideoInfo = ((k) this.f107007u.getValue()).f108196d;
        if (editVideoInfo != null) {
            this.f105686c = editVideoInfo;
        }
    }
}
