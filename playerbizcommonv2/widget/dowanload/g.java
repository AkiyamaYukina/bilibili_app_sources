package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/g.class */
public final class g extends BottomSheetBehavior.BottomSheetCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoDownloadDialog f82545a;

    public g(VideoDownloadDialog videoDownloadDialog) {
        this.f82545a = videoDownloadDialog;
    }

    public final void onSlide(View view, float f7) {
        float f8 = f7 > 0.0f ? 1.0f : 1 + f7;
        Window window = this.f82545a.getWindow();
        if (window != null) {
            window.setDimAmount(f8 * 0.5f);
        }
    }

    public final void onStateChanged(View view, int i7) {
        if (i7 == 5) {
            this.f82545a.dismiss();
        }
    }
}
