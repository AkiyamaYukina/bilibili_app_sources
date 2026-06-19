package com.bilibili.ship.theseus.ogv.operation.layout;

import aC.J;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.S;
import java.util.Arrays;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/layout/e.class */
@StabilityInferred(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final S f94129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LD.g f94130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final J f94131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f94132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f94133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableState f94134f;

    public e() {
        throw null;
    }

    public e(S s7, LD.g gVar, J j7) {
        this.f94129a = s7;
        this.f94130b = gVar;
        this.f94131c = j7;
        this.f94132d = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f94133e = SnapshotStateKt.mutableStateOf$default(Duration.box-impl(Duration.Companion.getZERO-UwyO8pc()), null, 2, null);
        this.f94134f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    @NotNull
    public static String a(long j7) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        long j8 = 3600;
        long j9 = j7 / j8;
        long j10 = 60;
        return String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j9), Long.valueOf((j7 % j8) / j10), Long.valueOf(j7 % j10)}, 3));
    }

    public final long b() {
        return ((Duration) this.f94133e.getValue()).unbox-impl();
    }
}
