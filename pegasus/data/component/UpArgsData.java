package com.bilibili.pegasus.data.component;

import bf.a;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/component/UpArgsData.class */
public final class UpArgsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("up_id")
    private final long f77360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("up_name")
    @Nullable
    private final String f77361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("up_face")
    @Nullable
    private final String f77362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("selected")
    private int f77363d;

    public UpArgsData() {
        this(0L, null, null, 0, 15, null);
    }

    public UpArgsData(long j7, @Nullable String str, @Nullable String str2, int i7) {
        this.f77360a = j7;
        this.f77361b = str;
        this.f77362c = str2;
        this.f77363d = i7;
    }

    public /* synthetic */ UpArgsData(long j7, String str, String str2, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0L : j7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? 0 : i7);
    }

    public static /* synthetic */ UpArgsData copy$default(UpArgsData upArgsData, long j7, String str, String str2, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = upArgsData.f77360a;
        }
        if ((i8 & 2) != 0) {
            str = upArgsData.f77361b;
        }
        if ((i8 & 4) != 0) {
            str2 = upArgsData.f77362c;
        }
        if ((i8 & 8) != 0) {
            i7 = upArgsData.f77363d;
        }
        return upArgsData.copy(j7, str, str2, i7);
    }

    public final long component1() {
        return this.f77360a;
    }

    @Nullable
    public final String component2() {
        return this.f77361b;
    }

    @Nullable
    public final String component3() {
        return this.f77362c;
    }

    public final int component4() {
        return this.f77363d;
    }

    @NotNull
    public final UpArgsData copy(long j7, @Nullable String str, @Nullable String str2, int i7) {
        return new UpArgsData(j7, str, str2, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpArgsData)) {
            return false;
        }
        UpArgsData upArgsData = (UpArgsData) obj;
        return this.f77360a == upArgsData.f77360a && Intrinsics.areEqual(this.f77361b, upArgsData.f77361b) && Intrinsics.areEqual(this.f77362c, upArgsData.f77362c) && this.f77363d == upArgsData.f77363d;
    }

    public final int getSelected() {
        return this.f77363d;
    }

    @Nullable
    public final String getUpFace() {
        return this.f77362c;
    }

    public final long getUpId() {
        return this.f77360a;
    }

    @Nullable
    public final String getUpName() {
        return this.f77361b;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f77360a);
        String str = this.f77361b;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f77362c;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return Integer.hashCode(this.f77363d) + (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31);
    }

    public final void setSelected(int i7) {
        this.f77363d = i7;
    }

    @NotNull
    public String toString() {
        long j7 = this.f77360a;
        String str = this.f77361b;
        String str2 = this.f77362c;
        int i7 = this.f77363d;
        StringBuilder sbA = n.a(j7, "UpArgsData(upId=", ", upName=", str);
        a.a(i7, ", upFace=", str2, ", selected=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
