package com.bilibili.playset.widget.favorite;

import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/j.class */
public final class j extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavoriteDialog f85758a;

    public j(FavoriteDialog favoriteDialog) {
        this.f85758a = favoriteDialog;
    }

    public final void onSlide(View view, float f7) {
        float f8 = f7 > 0.0f ? 1.0f : 1 + f7;
        Window window = this.f85758a.getWindow();
        if (window != null) {
            window.setDimAmount(f8 * 0.5f);
        }
    }

    public final void onStateChanged(View view, int i7) {
        if (i7 == 5) {
            this.f85758a.dismiss();
        }
    }
}
