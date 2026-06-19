package com.bilibili.pegasus.data.interestchoose;

import I1.C2157f0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.media3.common.util.C4638g;
import androidx.room.B;
import cf.i;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseSubItem.class */
@Parcelize
public final class InterestChooseSubItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InterestChooseSubItem> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private final int f77416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fid")
    private final long f77417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("icon")
    @Nullable
    private final String f77418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("name")
    @Nullable
    private final String f77419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("desc")
    @Nullable
    private final String f77420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("default_selected")
    private final int f77421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f77422g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f77423i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseSubItem$a.class */
    public static final class a implements Parcelable.Creator<InterestChooseSubItem> {
        @Override // android.os.Parcelable.Creator
        public final InterestChooseSubItem createFromParcel(Parcel parcel) {
            int i7 = parcel.readInt();
            long j7 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i8 = parcel.readInt();
            boolean z6 = true;
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z6 = false;
            }
            return new InterestChooseSubItem(i7, j7, string, string2, string3, i8, z7, z6, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final InterestChooseSubItem[] newArray(int i7) {
            return new InterestChooseSubItem[i7];
        }
    }

    public InterestChooseSubItem() {
        this(0, 0L, null, null, null, 0, false, false, 0);
    }

    public InterestChooseSubItem(int i7, long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, int i8, boolean z6, boolean z7, int i9) {
        this.f77416a = i7;
        this.f77417b = j7;
        this.f77418c = str;
        this.f77419d = str2;
        this.f77420e = str3;
        this.f77421f = i8;
        this.f77422g = z6;
        this.h = z7;
        this.f77423i = i9;
    }

    public static InterestChooseSubItem a(InterestChooseSubItem interestChooseSubItem, boolean z6, int i7, int i8) {
        int i9 = interestChooseSubItem.f77416a;
        long j7 = interestChooseSubItem.f77417b;
        String str = interestChooseSubItem.f77418c;
        String str2 = interestChooseSubItem.f77419d;
        String str3 = interestChooseSubItem.f77420e;
        int i10 = interestChooseSubItem.f77421f;
        if ((i8 & 64) != 0) {
            z6 = interestChooseSubItem.f77422g;
        }
        boolean z7 = interestChooseSubItem.h;
        if ((i8 & 256) != 0) {
            i7 = interestChooseSubItem.f77423i;
        }
        interestChooseSubItem.getClass();
        return new InterestChooseSubItem(i9, j7, str, str2, str3, i10, z6, z7, i7);
    }

    public final int b() {
        return this.f77421f;
    }

    @Nullable
    public final String c() {
        return this.f77420e;
    }

    public final long d() {
        return this.f77417b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseSubItem)) {
            return false;
        }
        InterestChooseSubItem interestChooseSubItem = (InterestChooseSubItem) obj;
        return this.f77416a == interestChooseSubItem.f77416a && this.f77417b == interestChooseSubItem.f77417b && Intrinsics.areEqual(this.f77418c, interestChooseSubItem.f77418c) && Intrinsics.areEqual(this.f77419d, interestChooseSubItem.f77419d) && Intrinsics.areEqual(this.f77420e, interestChooseSubItem.f77420e) && this.f77421f == interestChooseSubItem.f77421f && this.f77422g == interestChooseSubItem.f77422g && this.h == interestChooseSubItem.h && this.f77423i == interestChooseSubItem.f77423i;
    }

    @Nullable
    public final String h() {
        return this.f77418c;
    }

    public final int hashCode() {
        int iA = C3554n0.a(Integer.hashCode(this.f77416a) * 31, 31, this.f77417b);
        String str = this.f77418c;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f77419d;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f77420e;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return Integer.hashCode(this.f77423i) + z.a(z.a(I.a(this.f77421f, (((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode) * 31, 31), 31, this.f77422g), 31, this.h);
    }

    public final int i() {
        return this.f77416a;
    }

    @Nullable
    public final String j() {
        return this.f77419d;
    }

    @NotNull
    public final String toString() {
        int i7 = this.f77416a;
        long j7 = this.f77417b;
        String str = this.f77418c;
        String str2 = this.f77419d;
        String str3 = this.f77420e;
        int i8 = this.f77421f;
        boolean z6 = this.f77422g;
        boolean z7 = this.h;
        int i9 = this.f77423i;
        StringBuilder sbA = C2157f0.a(i7, j7, "InterestChooseSubItem(id=", ", fid=");
        B.a(", icon=", str, ", name=", str2, sbA);
        bf.a.a(i8, ", desc=", str3, ", defaultSelected=", sbA);
        C4638g.b(", isSelected=", ", isExposed=", sbA, z6, z7);
        return i.a(i9, ", absSubIndex=", ")", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f77416a);
        parcel.writeLong(this.f77417b);
        parcel.writeString(this.f77418c);
        parcel.writeString(this.f77419d);
        parcel.writeString(this.f77420e);
        parcel.writeInt(this.f77421f);
        parcel.writeInt(this.f77422g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.f77423i);
    }
}
