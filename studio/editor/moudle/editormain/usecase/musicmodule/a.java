package com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule;

import Ex0.n;
import It0.x;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.videoeditor.bean.BMusic;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/musicmodule/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n f107210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Sy0.a f107211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public BMusic f107212c;

    @Inject
    public a(@NotNull n nVar, @NotNull Sy0.a aVar, @NotNull Xy0.a aVar2) {
        this.f107210a = nVar;
        this.f107211b = aVar;
        aVar2.f28407e = new x(this, 4);
    }

    @Nullable
    public final BMusic a() {
        BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfoK = this.f107211b.k();
        BMusic bMusic = null;
        Object attachObj = biliEditorMaterialMultiInfoK != null ? biliEditorMaterialMultiInfoK.getAttachObj(BiliEditorMaterialMultiInfo.KEY_MUSIC_INFO) : null;
        if (attachObj instanceof BMusic) {
            bMusic = (BMusic) attachObj;
        }
        return bMusic;
    }

    @Nullable
    public final UpperTimeline b() {
        i iVar = this.f107210a.f4833c;
        return iVar != null ? iVar.f108300b : null;
    }
}
