package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.common.TranslateButton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/G0.class */
@StabilityInferred(parameters = 0)
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final t0 f101003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final t0 f101004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f101005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f101006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TranslateButton f101007e;

    public G0(@Nullable t0 t0Var, @Nullable t0 t0Var2, boolean z6, @NotNull String str, @Nullable TranslateButton translateButton) {
        this.f101003a = t0Var;
        this.f101004b = t0Var2;
        this.f101005c = z6;
        this.f101006d = str;
        this.f101007e = translateButton;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return Intrinsics.areEqual(this.f101003a, g02.f101003a) && Intrinsics.areEqual(this.f101004b, g02.f101004b) && this.f101005c == g02.f101005c && Intrinsics.areEqual(this.f101006d, g02.f101006d) && Intrinsics.areEqual(this.f101007e, g02.f101007e);
    }

    public final int hashCode() {
        t0 t0Var = this.f101003a;
        int iHashCode = t0Var == null ? 0 : t0Var.hashCode();
        t0 t0Var2 = this.f101004b;
        int iA = I.E.a(androidx.compose.animation.z.a(((iHashCode * 31) + (t0Var2 == null ? 0 : t0Var2.hashCode())) * 31, 31, this.f101005c), 31, this.f101006d);
        TranslateButton translateButton = this.f101007e;
        return iA + (translateButton == null ? 0 : translateButton.hashCode());
    }

    @NotNull
    public final String toString() {
        return "RelateThreePoint(dislike=" + this.f101003a + ", feedBack=" + this.f101004b + ", watchLater=" + this.f101005c + ", dislikeReport=" + this.f101006d + ", translateButton=" + this.f101007e + ")";
    }
}
