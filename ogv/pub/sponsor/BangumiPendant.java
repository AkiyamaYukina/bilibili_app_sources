package com.bilibili.ogv.pub.sponsor;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/sponsor/BangumiPendant.class */
@Bson
@Parcelize
public final class BangumiPendant implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BangumiPendant> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f71783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f71784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f71785c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/sponsor/BangumiPendant$a.class */
    public static final class a implements Parcelable.Creator<BangumiPendant> {
        @Override // android.os.Parcelable.Creator
        public final BangumiPendant createFromParcel(Parcel parcel) {
            return new BangumiPendant(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BangumiPendant[] newArray(int i7) {
            return new BangumiPendant[i7];
        }
    }

    public BangumiPendant() {
        this(null, null, null, 7);
    }

    public BangumiPendant(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f71783a = str;
        this.f71784b = str2;
        this.f71785c = str3;
    }

    public /* synthetic */ BangumiPendant(String str, String str2, String str3, int i7) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiPendant)) {
            return false;
        }
        BangumiPendant bangumiPendant = (BangumiPendant) obj;
        return Intrinsics.areEqual(this.f71783a, bangumiPendant.f71783a) && Intrinsics.areEqual(this.f71784b, bangumiPendant.f71784b) && Intrinsics.areEqual(this.f71785c, bangumiPendant.f71785c);
    }

    public final int hashCode() {
        String str = this.f71783a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f71784b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f71785c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f71783a;
        String str2 = this.f71784b;
        return C8770a.a(b.a("BangumiPendant(pid=", str, ", name=", str2, ", image="), this.f71785c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f71783a);
        parcel.writeString(this.f71784b);
        parcel.writeString(this.f71785c);
    }
}
