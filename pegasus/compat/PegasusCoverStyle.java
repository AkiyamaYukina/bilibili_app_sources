package com.bilibili.pegasus.compat;

import Ao0.e;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/compat/PegasusCoverStyle.class */
@StabilityInferred(parameters = 0)
public final class PegasusCoverStyle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float f75662b;

    @NotNull
    public static final PegasusCoverStyle INSTANCE = new PegasusCoverStyle();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f75661a = LazyKt.lazy(new e(0));
    public static final int $stable = 8;

    public final float getCoverRatio() {
        float f7 = f75662b;
        float default_ratio = f7;
        if (f7 == 0.0f) {
            default_ratio = getDEFAULT_RATIO();
        }
        return default_ratio;
    }

    public final float getDEFAULT_RATIO() {
        return ((Number) f75661a.getValue()).floatValue();
    }

    public final void setCoverRatio(float f7) {
        float f8 = f75662b;
        if (f8 != 0.0f) {
            BLog.i("PegasusCoverStyle", "cover ratio can only be assigned once");
            return;
        }
        BLog.i("PegasusCoverStyle", "setCoverRatio:" + f7 + " field:" + f8);
        if (0.33f > f7 || f7 > 2.0f) {
            f7 = getDEFAULT_RATIO();
        }
        f75662b = f7;
    }
}
