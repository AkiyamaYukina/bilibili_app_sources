package com.bilibili.ship.theseus.cheese.player.layer;

import I.E;
import androidx.compose.animation.C3357h;
import androidx.compose.animation.z;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import eu0.C6987f;
import eu0.C6988g;
import hu0.C7505c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/e.class */
@Stable
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C7505c f90627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f90628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f90629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C6987f f90630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final FunctionReferenceImpl f90631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f90632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f90633g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public ShowLayerFrom f90634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableState f90635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableState f90636k;

    public e() {
        throw null;
    }

    public e(C7505c c7505c, String str, String str2, C6987f c6987f, Function1 function1, Function0 function0, Function0 function02, boolean z6, int i7) {
        c6987f = (i7 & 8) != 0 ? new C6987f("", 0L, 0, false, 0) : c6987f;
        z6 = (i7 & 128) != 0 ? false : z6;
        ShowLayerFrom showLayerFrom = ShowLayerFrom.DEAFULT;
        this.f90627a = c7505c;
        this.f90628b = str;
        this.f90629c = str2;
        this.f90630d = c6987f;
        this.f90631e = (FunctionReferenceImpl) function1;
        this.f90632f = function0;
        this.f90633g = function02;
        this.h = z6;
        this.f90634i = showLayerFrom;
        this.f90635j = SnapshotStateKt.mutableStateOf$default(C6988g.a(), null, 2, null);
        this.f90636k = SnapshotStateKt.mutableStateOf$default(new c.a(), null, 2, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f90627a, eVar.f90627a) && Intrinsics.areEqual(this.f90628b, eVar.f90628b) && Intrinsics.areEqual(this.f90629c, eVar.f90629c) && Intrinsics.areEqual(this.f90630d, eVar.f90630d) && Intrinsics.areEqual(this.f90631e, eVar.f90631e) && Intrinsics.areEqual(this.f90632f, eVar.f90632f) && Intrinsics.areEqual(this.f90633g, eVar.f90633g) && this.h == eVar.h && this.f90634i == eVar.f90634i;
    }

    public final int hashCode() {
        int iA = E.a(E.a(this.f90627a.hashCode() * 31, 31, this.f90628b), 31, this.f90629c);
        return this.f90634i.hashCode() + z.a(C3357h.a(C3357h.a((this.f90631e.hashCode() + ((this.f90630d.hashCode() + iA) * 31)) * 31, 31, this.f90632f), 31, this.f90633g), 31, this.h);
    }

    @NotNull
    public final String toString() {
        return "CheesePayLayerUIState(playerMask=" + this.f90627a + ", priceText=" + this.f90628b + ", buttonText=" + this.f90629c + ", seasonOverview=" + this.f90630d + ", coverFactory=" + this.f90631e + ", onClickPay=" + this.f90632f + ", onClickBack=" + this.f90633g + ", isRiskControl=" + this.h + ", showFrom=" + this.f90634i + ")";
    }
}
