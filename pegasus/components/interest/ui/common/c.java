package com.bilibili.pegasus.components.interest.ui.common;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.pegasus.components.interest.C5628b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/common/c.class */
public final class c {
    public static final void a(@NotNull BottomSheetDialogFragment bottomSheetDialogFragment, int i7) {
        Dialog dialog = bottomSheetDialogFragment.getDialog();
        if (dialog != null) {
            WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(dialog.getContext());
            Lazy lazy = C5628b.f76326a;
            boolean zWidthBreakPointLarge = KScreenAdjustUtilsKt.widthBreakPointLarge(windowSizeClassWindowSize);
            int iDpToPx = zWidthBreakPointLarge ? DimenUtilsKt.dpToPx(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_TROUSER_LEG_SEGMENT_BLUR) : -1;
            View viewFindViewById = dialog.findViewById(2131299837);
            if (viewFindViewById != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
                bottomSheetBehaviorFrom.setPeekHeight(i7);
                bottomSheetBehaviorFrom.setMaxHeight(i7);
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(iDpToPx, i7);
                window.setGravity(zWidthBreakPointLarge ? 81 : 80);
            }
        }
    }
}
