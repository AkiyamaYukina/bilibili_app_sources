package com.bilibili.pegasus.components.interest;

import F3.C1767k2;
import android.view.View;
import android.view.ViewGroup;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.DimenUtilsKt;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/b.class */
public final class C5628b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f76326a = LazyKt.lazy(new Cj1.g(9));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f76327b = LazyKt.lazy(new C1767k2(9));

    public static final void a(int i7, @NotNull View... viewArr) {
        Integer num;
        Integer numValueOf;
        int iIntValue;
        float f7;
        float f8;
        float fDpToPx;
        int length = viewArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                num = null;
                break;
            }
            View view = viewArr[i8];
            if (view != null) {
                WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(view.getContext());
                int iDpToPx = DimenUtilsKt.dpToPx(windowSizeClassWindowSize.getMinWidthDp());
                if (KScreenAdjustUtilsKt.widthBreakPointLarge(windowSizeClassWindowSize)) {
                    if (i7 > 0) {
                        fDpToPx = (DimenUtilsKt.dpToPx(i7) - Math.min((int) (iDpToPx * 0.5f), DimenUtilsKt.dpToPx(700))) / 2.0f;
                        iIntValue = (int) fDpToPx;
                        numValueOf = Integer.valueOf(iIntValue);
                    } else {
                        f7 = iDpToPx;
                        f8 = 0.25f;
                    }
                } else if (KScreenAdjustUtilsKt.widthBreakPointMedium(windowSizeClassWindowSize)) {
                    f7 = iDpToPx;
                    f8 = 0.2f;
                } else {
                    iIntValue = ((Number) f76327b.getValue()).intValue();
                    numValueOf = Integer.valueOf(iIntValue);
                }
                fDpToPx = f7 * f8;
                iIntValue = (int) fDpToPx;
                numValueOf = Integer.valueOf(iIntValue);
            } else {
                numValueOf = null;
            }
            num = numValueOf;
            if (numValueOf != null) {
                break;
            } else {
                i8++;
            }
        }
        if (num != null) {
            int iIntValue2 = num.intValue();
            for (View view2 : viewArr) {
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMarginStart(iIntValue2);
                        marginLayoutParams.setMarginEnd(iIntValue2);
                        view2.setLayoutParams(marginLayoutParams);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b() {
        /*
            com.bilibili.lib.dd.DeviceDecision r0 = com.bilibili.lib.dd.DeviceDecision.INSTANCE
            r6 = r0
            r0 = 0
            r5 = r0
            r0 = r6
            java.lang.String r1 = "interest_choose_kmp_enabled"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L31
            boolean r0 = s71.a.a
            if (r0 != 0) goto L1e
            r0 = r5
            r4 = r0
            boolean r0 = s71.a.b
            if (r0 == 0) goto L33
        L1e:
            r0 = r5
            r4 = r0
            kotlin.Lazy r0 = com.bilibili.pegasus.components.interest.C5628b.f76326a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L33
        L31:
            r0 = 1
            r4 = r0
        L33:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.C5628b.b():boolean");
    }
}
