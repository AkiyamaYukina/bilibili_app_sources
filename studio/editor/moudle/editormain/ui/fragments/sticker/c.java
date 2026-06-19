package com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker;

import Nz0.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/sticker/c.class */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorStickerListFragment f106966a;

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.f106966a.f106953i;
        r rVar2 = rVar;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickerPagerAdapter");
            rVar2 = null;
        }
        rVar2.b();
    }
}
