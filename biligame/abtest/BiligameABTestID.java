package com.bilibili.biligame.abtest;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/abtest/BiligameABTestID.class */
@StabilityInferred(parameters = 1)
public final class BiligameABTestID {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f62142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f62143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f62144c;

    public BiligameABTestID(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f62142a = str;
        this.f62143b = str2;
        this.f62144c = str3;
    }

    public static /* synthetic */ BiligameABTestID copy$default(BiligameABTestID biligameABTestID, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = biligameABTestID.f62142a;
        }
        if ((i7 & 2) != 0) {
            str2 = biligameABTestID.f62143b;
        }
        if ((i7 & 4) != 0) {
            str3 = biligameABTestID.f62144c;
        }
        return biligameABTestID.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f62142a;
    }

    @Nullable
    public final String component2() {
        return this.f62143b;
    }

    @Nullable
    public final String component3() {
        return this.f62144c;
    }

    @NotNull
    public final BiligameABTestID copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new BiligameABTestID(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiligameABTestID)) {
            return false;
        }
        BiligameABTestID biligameABTestID = (BiligameABTestID) obj;
        return Intrinsics.areEqual(this.f62142a, biligameABTestID.f62142a) && Intrinsics.areEqual(this.f62143b, biligameABTestID.f62143b) && Intrinsics.areEqual(this.f62144c, biligameABTestID.f62144c);
    }

    @Nullable
    public final String getExpId() {
        return this.f62142a;
    }

    @Nullable
    public final String getGroupDefaultId() {
        return this.f62144c;
    }

    @Nullable
    public final String getGroupExpId() {
        return this.f62143b;
    }

    public int hashCode() {
        int iHashCode = 0;
        String str = this.f62142a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f62143b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f62144c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BiligameABTestID(expId=");
        sb.append(this.f62142a);
        sb.append(", groupExpId=");
        sb.append(this.f62143b);
        sb.append(", groupDefaultId=");
        return C8770a.a(sb, this.f62144c, ")");
    }
}
