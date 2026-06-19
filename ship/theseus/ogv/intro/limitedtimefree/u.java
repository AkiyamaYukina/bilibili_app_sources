package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import a70.L;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ogv.bpf.countdown.CountdownModelKt$createCountdownModel$1;
import com.bilibili.ship.theseus.ogv.activity.OgvOperationGuideFloatingVo;
import com.bilibili.ship.theseus.ogv.intro.T;
import com.bilibili.ship.theseus.ogv.intro.U;
import j$.time.Clock;
import kotlin.Unit;
import kotlin.time.Duration;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/u.class */
@StabilityInferred(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T f93277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final U f93278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvOperationGuideFloatingVo f93279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f93280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CompletableDeferred<Unit> f93281e = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableState f93282f = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CountdownModelKt$createCountdownModel$1 f93283g;

    @NotNull
    public final State h;

    public u(@NotNull T t7, @NotNull U u7, @NotNull OgvOperationGuideFloatingVo ogvOperationGuideFloatingVo, @NotNull ExposureEntry exposureEntry) {
        this.f93277a = t7;
        this.f93278b = u7;
        this.f93279c = ogvOperationGuideFloatingVo;
        this.f93280d = exposureEntry;
        q91.i.Companion.getClass();
        q91.i iVar = new q91.i(Clock.systemUTC().instant());
        OgvOperationGuideFloatingVo.Countdown countdown = ogvOperationGuideFloatingVo.f91483c;
        this.f93283g = new CountdownModelKt$createCountdownModel$1(iVar.c(countdown != null ? countdown.f91491b : Duration.Companion.getZERO-UwyO8pc()));
        this.h = SnapshotStateKt.derivedStateOf(new L(this, 4));
    }
}
