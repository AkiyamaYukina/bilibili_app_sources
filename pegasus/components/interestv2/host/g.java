package com.bilibili.pegasus.components.interestv2.host;

import M3.C2592k;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/g.class */
@StabilityInferred(parameters = 1)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f77054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function0<Boolean> f77055d;

    public g() {
        this(0);
    }

    public /* synthetic */ g(int i7) {
        this(new C2592k(2), false, false, false);
    }

    public g(@NotNull Function0 function0, boolean z6, boolean z7, boolean z8) {
        this.f77052a = z6;
        this.f77053b = z7;
        this.f77054c = z8;
        this.f77055d = function0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f77052a == gVar.f77052a && this.f77053b == gVar.f77053b && this.f77054c == gVar.f77054c && Intrinsics.areEqual(this.f77055d, gVar.f77055d);
    }

    public final int hashCode() {
        return this.f77055d.hashCode() + z.a(z.a(Boolean.hashCode(this.f77052a) * 31, 31, this.f77053b), 31, this.f77054c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidInterestChooseSessionOptions(waitCnyBeforeRefresh=");
        sb.append(this.f77052a);
        sb.append(", includeCnyInfoInRefresh=");
        sb.append(this.f77053b);
        sb.append(", markMainVisibleBeforeResumeDialogQueue=");
        sb.append(this.f77054c);
        sb.append(", shouldShowAgeGate=");
        return Y0.c.a(sb, this.f77055d, ")");
    }
}
