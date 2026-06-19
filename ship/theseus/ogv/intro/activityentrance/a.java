package com.bilibili.ship.theseus.ogv.intro.activityentrance;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/a.class */
@StabilityInferred(parameters = 0)
public final class a extends Nj0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92305b = 2131500206;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ActivityEntrance f92306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f92307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f92308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final e f92309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Drawable f92310g;
    public boolean h;

    public a(@NotNull ActivityEntrance activityEntrance, @NotNull ExposureEntry exposureEntry, @NotNull Map map, @NotNull e eVar) {
        this.f92306c = activityEntrance;
        this.f92307d = exposureEntry;
        this.f92308e = map;
        this.f92309f = eVar;
    }

    @Override // Nj0.c
    public final int m() {
        return this.f92305b;
    }
}
