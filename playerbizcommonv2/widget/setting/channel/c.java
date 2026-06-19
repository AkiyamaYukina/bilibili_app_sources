package com.bilibili.playerbizcommonv2.widget.setting.channel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.widget.setting.U;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f83224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Jr0.f f83226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<String> f83227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final U f83228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Function1<Continuation<? super Unit>, Object> f83229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final SingleExposeEntry f83230g;

    public c(@NotNull String str, boolean z6, @NotNull Jr0.f fVar, @NotNull StateFlow stateFlow, @NotNull U u7, @NotNull Function1 function1, @Nullable SingleExposeEntry singleExposeEntry) {
        this.f83224a = str;
        this.f83225b = z6;
        this.f83226c = fVar;
        this.f83227d = stateFlow;
        this.f83228e = u7;
        this.f83229f = function1;
        this.f83230g = singleExposeEntry;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f83224a, cVar.f83224a) && this.f83225b == cVar.f83225b && Intrinsics.areEqual(this.f83226c, cVar.f83226c) && Intrinsics.areEqual(this.f83227d, cVar.f83227d) && Intrinsics.areEqual(this.f83228e, cVar.f83228e) && Intrinsics.areEqual(this.f83229f, cVar.f83229f) && Intrinsics.areEqual(this.f83230g, cVar.f83230g);
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.z.a(this.f83224a.hashCode() * 31, 31, this.f83225b);
        return this.f83230g.hashCode() + O4.b.a((this.f83228e.hashCode() + androidx.core.content.b.a(this.f83227d, (this.f83226c.hashCode() + iA) * 31, 31)) * 31, 31, this.f83229f);
    }

    @NotNull
    public final String toString() {
        return "VideoSettingButton(iconUrl=" + this.f83224a + ", grayed=" + this.f83225b + ", badgeInfo=" + this.f83226c + ", titleFlow=" + this.f83227d + ", onClick=" + this.f83228e + ", runUntilDetach=" + this.f83229f + ", exposeEntry=" + this.f83230g + ")";
    }
}
