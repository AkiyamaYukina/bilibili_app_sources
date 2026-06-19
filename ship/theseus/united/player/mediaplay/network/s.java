package com.bilibili.ship.theseus.united.player.mediaplay.network;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/s.class */
@StabilityInferred(parameters = 1)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f104606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f104607d;

    public s(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        this.f104604a = str;
        this.f104605b = str2;
        this.f104606c = str3;
        this.f104607d = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f104604a, sVar.f104604a) && Intrinsics.areEqual(this.f104605b, sVar.f104605b) && Intrinsics.areEqual(this.f104606c, sVar.f104606c) && Intrinsics.areEqual(this.f104607d, sVar.f104607d);
    }

    public final int hashCode() {
        int iA = E.a(this.f104604a.hashCode() * 31, 31, this.f104605b);
        int iHashCode = 0;
        String str = this.f104606c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f104607d;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return ((iA + iHashCode2) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TFToast(btnText=");
        sb.append(this.f104604a);
        sb.append(", btnLink=");
        sb.append(this.f104605b);
        sb.append(", title=");
        sb.append(this.f104606c);
        sb.append(", description=");
        return C8770a.a(sb, this.f104607d, ")");
    }
}
