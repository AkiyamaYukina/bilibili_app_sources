package com.bilibili.ship.theseus.united.player.ai;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/f.class */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f104372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f104373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f104374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f104375f;

    public f() {
        this(false, false, "", "", "", "");
    }

    public f(boolean z6, boolean z7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f104370a = z6;
        this.f104371b = z7;
        this.f104372c = str;
        this.f104373d = str2;
        this.f104374e = str3;
        this.f104375f = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f104370a == fVar.f104370a && this.f104371b == fVar.f104371b && Intrinsics.areEqual(this.f104372c, fVar.f104372c) && Intrinsics.areEqual(this.f104373d, fVar.f104373d) && Intrinsics.areEqual(this.f104374e, fVar.f104374e) && Intrinsics.areEqual(this.f104375f, fVar.f104375f);
    }

    public final int hashCode() {
        return this.f104375f.hashCode() + E.a(E.a(E.a(z.a(Boolean.hashCode(this.f104370a) * 31, 31, this.f104371b), 31, this.f104372c), 31, this.f104373d), 31, this.f104374e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TranslateGuideData(guideSwitch=");
        sb.append(this.f104370a);
        sb.append(", isInWhite=");
        sb.append(this.f104371b);
        sb.append(", aiTranslationTitle=");
        sb.append(this.f104372c);
        sb.append(", aiTranslationContent=");
        sb.append(this.f104373d);
        sb.append(", confirmButtonText=");
        sb.append(this.f104374e);
        sb.append(", cancelButtonText=");
        return C8770a.a(sb, this.f104375f, ")");
    }
}
