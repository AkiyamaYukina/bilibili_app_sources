package com.bilibili.location;

import androidx.compose.ui.graphics.colorspace.A;
import androidx.room.B;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/BLLocation.class */
public final class BLLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f65449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f65450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f65451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f65452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f65453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f65454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f65455g;

    public BLLocation() {
        this(null, null, null, null, 0.0d, 0.0d, 0L, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public BLLocation(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, double d7, double d8, long j7) {
        this.f65449a = str;
        this.f65450b = str2;
        this.f65451c = str3;
        this.f65452d = str4;
        this.f65453e = d7;
        this.f65454f = d8;
        this.f65455g = j7;
    }

    public /* synthetic */ BLLocation(String str, String str2, String str3, String str4, double d7, double d8, long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? 0.0d : d7, (i7 & 32) != 0 ? 0.0d : d8, (i7 & 64) != 0 ? 0L : j7);
    }

    public static /* synthetic */ BLLocation copy$default(BLLocation bLLocation, String str, String str2, String str3, String str4, double d7, double d8, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bLLocation.f65449a;
        }
        if ((i7 & 2) != 0) {
            str2 = bLLocation.f65450b;
        }
        if ((i7 & 4) != 0) {
            str3 = bLLocation.f65451c;
        }
        if ((i7 & 8) != 0) {
            str4 = bLLocation.f65452d;
        }
        if ((i7 & 16) != 0) {
            d7 = bLLocation.f65453e;
        }
        if ((i7 & 32) != 0) {
            d8 = bLLocation.f65454f;
        }
        if ((i7 & 64) != 0) {
            j7 = bLLocation.f65455g;
        }
        return bLLocation.copy(str, str2, str3, str4, d7, d8, j7);
    }

    @Nullable
    public final String component1() {
        return this.f65449a;
    }

    @Nullable
    public final String component2() {
        return this.f65450b;
    }

    @Nullable
    public final String component3() {
        return this.f65451c;
    }

    @Nullable
    public final String component4() {
        return this.f65452d;
    }

    public final double component5() {
        return this.f65453e;
    }

    public final double component6() {
        return this.f65454f;
    }

    public final long component7() {
        return this.f65455g;
    }

    @NotNull
    public final BLLocation copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, double d7, double d8, long j7) {
        return new BLLocation(str, str2, str3, str4, d7, d8, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BLLocation)) {
            return false;
        }
        BLLocation bLLocation = (BLLocation) obj;
        return Intrinsics.areEqual(this.f65449a, bLLocation.f65449a) && Intrinsics.areEqual(this.f65450b, bLLocation.f65450b) && Intrinsics.areEqual(this.f65451c, bLLocation.f65451c) && Intrinsics.areEqual(this.f65452d, bLLocation.f65452d) && Double.compare(this.f65453e, bLLocation.f65453e) == 0 && Double.compare(this.f65454f, bLLocation.f65454f) == 0 && this.f65455g == bLLocation.f65455g;
    }

    @Nullable
    public final String getCityId() {
        return this.f65449a;
    }

    @Nullable
    public final String getCityName() {
        return this.f65450b;
    }

    public final double getLat() {
        return this.f65453e;
    }

    public final double getLon() {
        return this.f65454f;
    }

    @Nullable
    public final String getNationName() {
        return this.f65451c;
    }

    public final long getTime() {
        return this.f65455g;
    }

    @Nullable
    public final String getType() {
        return this.f65452d;
    }

    public int hashCode() {
        String str = this.f65449a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f65450b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f65451c;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f65452d;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return Long.hashCode(this.f65455g) + A.a(this.f65454f, A.a(this.f65453e, ((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31, 31), 31);
    }

    public final void setCityId(@Nullable String str) {
        this.f65449a = str;
    }

    public final void setCityName(@Nullable String str) {
        this.f65450b = str;
    }

    public final void setLat(double d7) {
        this.f65453e = d7;
    }

    public final void setLon(double d7) {
        this.f65454f = d7;
    }

    public final void setNationName(@Nullable String str) {
        this.f65451c = str;
    }

    public final void setTime(long j7) {
        this.f65455g = j7;
    }

    public final void setType(@Nullable String str) {
        this.f65452d = str;
    }

    @NotNull
    public String toString() {
        String str = this.f65449a;
        String str2 = this.f65450b;
        String str3 = this.f65451c;
        String str4 = this.f65452d;
        double d7 = this.f65453e;
        double d8 = this.f65454f;
        long j7 = this.f65455g;
        StringBuilder sbA = G0.b.a("BLLocation(cityId=", str, ", cityName=", str2, ", nationName=");
        B.a(str3, ", type=", str4, ", lat=", sbA);
        sbA.append(d7);
        z4.a.a(sbA, ", lon=", d8, ", time=");
        return android.support.v4.media.session.a.a(sbA, j7, ")");
    }
}
