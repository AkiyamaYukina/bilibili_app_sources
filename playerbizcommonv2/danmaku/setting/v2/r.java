package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import L3.C2528u;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.unit.Dp;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/r.class */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f81461a = Dp.m3880constructorimpl(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ClosedFloatingPointRange<Float> f81462b = RangesKt.rangeTo(20.0f, 100.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ClosedFloatingPointRange<Float> f81463c = RangesKt.rangeTo(50.0f, 200.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Lazy f81464d = LazyKt.lazy(new C2528u(6));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/r$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f81465a;

        static {
            int[] iArr = new int[DanmakuSettingsStyle.values().length];
            try {
                iArr[DanmakuSettingsStyle.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[DanmakuSettingsStyle.TOP_WITHOUT_DIVIDER.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[DanmakuSettingsStyle.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[DanmakuSettingsStyle.MIDDLE_WITHOUT_DIVIDER.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[DanmakuSettingsStyle.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[DanmakuSettingsStyle.SINGLE.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            f81465a = iArr;
        }
    }

    @NotNull
    public static final String a(boolean z6) {
        return z6 ? "1" : "2";
    }

    public static final boolean b(@NotNull DanmakuSettingsStyle danmakuSettingsStyle) {
        return danmakuSettingsStyle.compareTo(DanmakuSettingsStyle.BOTTOM) < 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static final Shape c(@NotNull DanmakuSettingsStyle danmakuSettingsStyle) throws NoWhenBranchMatchedException {
        Shape shapeM1504RoundedCornerShapea9UjIt4$default;
        switch (a.f81465a[danmakuSettingsStyle.ordinal()]) {
            case 1:
            case 2:
                float f7 = 12;
                shapeM1504RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m1504RoundedCornerShapea9UjIt4$default(Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7), 0.0f, 0.0f, 12, null);
                break;
            case 3:
            case 4:
                shapeM1504RoundedCornerShapea9UjIt4$default = a0.f43510a;
                break;
            case 5:
                float f8 = 12;
                shapeM1504RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m1504RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8), 3, null);
                break;
            case 6:
                shapeM1504RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(12));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return shapeM1504RoundedCornerShapea9UjIt4$default;
    }
}
