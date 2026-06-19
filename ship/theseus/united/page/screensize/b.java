package com.bilibili.ship.theseus.united.page.screensize;

import I3.C2250n0;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screensize/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f102942a = LazyKt.lazy(new C2250n0(8));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f102943b = DeviceDecision.INSTANCE.getBoolean("dd_united_866_screen_adjust", true);

    public static final boolean a(@NotNull WindowSizeClass windowSizeClass) {
        return f102943b && KScreenAdjustUtilsKt.isLargeLandscape(windowSizeClass);
    }

    public static final boolean b(@NotNull WindowSizeClass windowSizeClass) {
        return f102943b && KScreenAdjustUtilsKt.isLargePortrait(windowSizeClass);
    }

    public static final boolean c(@NotNull WindowSizeClass windowSizeClass) {
        return f102943b && KScreenAdjustUtilsKt.isMedium(windowSizeClass);
    }

    public static final boolean d(@NotNull WindowSizeClass windowSizeClass) {
        return !f102943b || KScreenAdjustUtilsKt.isNormal(windowSizeClass);
    }

    @NotNull
    public static final String e(@NotNull a aVar) {
        return aVar.i() ? "0" : aVar.h() ? "1" : aVar.g() ? "2" : aVar.f() ? "3" : CaptureSchema.OLD_INVALID_ID_STRING;
    }
}
