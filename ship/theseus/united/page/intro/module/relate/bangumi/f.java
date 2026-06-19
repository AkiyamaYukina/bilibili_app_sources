package com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import kotlin.Unit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/bangumi/f.class */
@StabilityInferred(parameters = 0)
public final class f extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f101131a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f101135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f101136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f101137g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Drawable f101138i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f101140k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f101132b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f101133c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f101134d = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f101139j = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f101141l = DimenUtilsKt.dpToPx(128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f101142m = DimenUtilsKt.dpToPx(72);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f101143n = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);

    public f(@NotNull ExposureEntry exposureEntry) {
        this.f101131a = exposureEntry;
    }
}
