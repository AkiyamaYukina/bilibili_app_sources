package com.bilibili.ogv.story;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/t.class */
public final class t extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvStorySeasonListDialog f73112a;

    public t(OgvStorySeasonListDialog ogvStorySeasonListDialog) {
        this.f73112a = ogvStorySeasonListDialog;
    }

    public final void onSlide(View view, float f7) {
        OgvStorySeasonListDialog ogvStorySeasonListDialog = this.f73112a;
        ogvStorySeasonListDialog.h.invoke(Float.valueOf(1 + f7), Integer.valueOf(ogvStorySeasonListDialog.f73038g));
    }

    public final void onStateChanged(View view, int i7) {
    }
}
