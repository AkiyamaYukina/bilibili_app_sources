package com.bilibili.ogv.pub.community;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.I;
import cf.f;
import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/BangumiBadgeInfo.class */
@Bson
@Parcelize
public final class BangumiBadgeInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BangumiBadgeInfo> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("text")
    @JvmField
    @Nullable
    public final String f71489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("text_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @JvmField
    @Nullable
    public final Integer f71490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("text_size")
    private final int f71491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("bg_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @JvmField
    @Nullable
    public Integer f71492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("bg_color_night")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @JvmField
    @Nullable
    public Integer f71493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("img")
    @JvmField
    @Nullable
    public String f71494f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/BangumiBadgeInfo$a.class */
    public static final class a implements Parcelable.Creator<BangumiBadgeInfo> {
        @Override // android.os.Parcelable.Creator
        public final BangumiBadgeInfo createFromParcel(Parcel parcel) {
            return new BangumiBadgeInfo(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BangumiBadgeInfo[] newArray(int i7) {
            return new BangumiBadgeInfo[i7];
        }
    }

    public BangumiBadgeInfo() {
        this(null, null, 0, null, null, null, 63);
    }

    public BangumiBadgeInfo(@Nullable String str, @Nullable Integer num, int i7, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2) {
        this.f71489a = str;
        this.f71490b = num;
        this.f71491c = i7;
        this.f71492d = num2;
        this.f71493e = num3;
        this.f71494f = str2;
    }

    public /* synthetic */ BangumiBadgeInfo(String str, Integer num, int i7, Integer num2, Integer num3, String str2, int i8) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : num, (i8 & 4) != 0 ? 0 : i7, (i8 & 8) != 0 ? null : num2, (i8 & 16) != 0 ? null : num3, (i8 & 32) != 0 ? null : str2);
    }

    public final int a() {
        return this.f71491c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiBadgeInfo)) {
            return false;
        }
        BangumiBadgeInfo bangumiBadgeInfo = (BangumiBadgeInfo) obj;
        return Intrinsics.areEqual(this.f71489a, bangumiBadgeInfo.f71489a) && Intrinsics.areEqual(this.f71490b, bangumiBadgeInfo.f71490b) && this.f71491c == bangumiBadgeInfo.f71491c && Intrinsics.areEqual(this.f71492d, bangumiBadgeInfo.f71492d) && Intrinsics.areEqual(this.f71493e, bangumiBadgeInfo.f71493e) && Intrinsics.areEqual(this.f71494f, bangumiBadgeInfo.f71494f);
    }

    public final int hashCode() {
        String str = this.f71489a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.f71490b;
        int iA = I.a(this.f71491c, ((iHashCode2 * 31) + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.f71492d;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.f71493e;
        int iHashCode4 = num3 == null ? 0 : num3.hashCode();
        String str2 = this.f71494f;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return ((((iA + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f71489a;
        Integer num = this.f71490b;
        int i7 = this.f71491c;
        Integer num2 = this.f71492d;
        Integer num3 = this.f71493e;
        String str2 = this.f71494f;
        StringBuilder sbA = Id.a.a("BangumiBadgeInfo(badgeText=", num, str, ", badgeTextColor=", ", badgeTextSize=");
        sbA.append(i7);
        sbA.append(", bgColor=");
        sbA.append(num2);
        sbA.append(", bgColorNight=");
        sbA.append(num3);
        sbA.append(", img=");
        sbA.append(str2);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f71489a);
        Integer num = this.f71490b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.a(parcel, 1, num);
        }
        parcel.writeInt(this.f71491c);
        Integer num2 = this.f71492d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f.a(parcel, 1, num2);
        }
        Integer num3 = this.f71493e;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            f.a(parcel, 1, num3);
        }
        parcel.writeString(this.f71494f);
    }
}
