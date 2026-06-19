package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bilibili.droid.DimenUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/n.class */
public final class n {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/n$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f83259a;

        static {
            int[] iArr = new int[VideoSettingType.values().length];
            try {
                iArr[VideoSettingType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[VideoSettingType.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[VideoSettingType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[VideoSettingType.TOP_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f83259a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static final Drawable a(int i7, @NotNull VideoSettingType videoSettingType) throws NoWhenBranchMatchedException {
        float[] fArr;
        float fDpToPx = DimenUtilsKt.dpToPx(8.0f);
        int i8 = a.f83259a[videoSettingType.ordinal()];
        if (i8 == 1) {
            fArr = new float[]{fDpToPx, fDpToPx, fDpToPx, fDpToPx, 0.0f, 0.0f, 0.0f, 0.0f};
        } else if (i8 == 2) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        } else if (i8 == 3) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, fDpToPx, fDpToPx, fDpToPx, fDpToPx};
        } else {
            if (i8 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            fArr = new float[]{fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx};
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setShape(0);
        if (i7 != 0) {
            gradientDrawable.setColor(i7);
        }
        return gradientDrawable;
    }
}
