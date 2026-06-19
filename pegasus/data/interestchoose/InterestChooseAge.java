package com.bilibili.pegasus.data.interestchoose;

import W60.F;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.media3.common.util.C4638g;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseAge.class */
@Parcelize
public final class InterestChooseAge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InterestChooseAge> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private final long f77399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private final String f77400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("default_selected")
    private final int f77401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f77403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f77404f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseAge$a.class */
    public static final class a implements Parcelable.Creator<InterestChooseAge> {
        @Override // android.os.Parcelable.Creator
        public final InterestChooseAge createFromParcel(Parcel parcel) {
            long j7 = parcel.readLong();
            String string = parcel.readString();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            boolean z6 = true;
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z6 = false;
            }
            return new InterestChooseAge(i7, i8, j7, string, z7, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final InterestChooseAge[] newArray(int i7) {
            return new InterestChooseAge[i7];
        }
    }

    public InterestChooseAge() {
        this(0L, 63, null, false);
    }

    public InterestChooseAge(int i7, int i8, long j7, @Nullable String str, boolean z6, boolean z7) {
        this.f77399a = j7;
        this.f77400b = str;
        this.f77401c = i7;
        this.f77402d = i8;
        this.f77403e = z6;
        this.f77404f = z7;
    }

    public /* synthetic */ InterestChooseAge(long j7, int i7, String str, boolean z6) {
        this(0, 0, (i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? null : str, (i7 & 16) != 0 ? false : z6, false);
    }

    public static InterestChooseAge a(InterestChooseAge interestChooseAge, int i7, boolean z6, int i8) {
        long j7 = interestChooseAge.f77399a;
        String str = interestChooseAge.f77400b;
        int i9 = interestChooseAge.f77401c;
        if ((i8 & 8) != 0) {
            i7 = interestChooseAge.f77402d;
        }
        if ((i8 & 16) != 0) {
            z6 = interestChooseAge.f77403e;
        }
        boolean z7 = interestChooseAge.f77404f;
        interestChooseAge.getClass();
        return new InterestChooseAge(i9, i7, j7, str, z6, z7);
    }

    public final int b() {
        return this.f77401c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseAge)) {
            return false;
        }
        InterestChooseAge interestChooseAge = (InterestChooseAge) obj;
        return this.f77399a == interestChooseAge.f77399a && Intrinsics.areEqual(this.f77400b, interestChooseAge.f77400b) && this.f77401c == interestChooseAge.f77401c && this.f77402d == interestChooseAge.f77402d && this.f77403e == interestChooseAge.f77403e && this.f77404f == interestChooseAge.f77404f;
    }

    public final long getId() {
        return this.f77399a;
    }

    @Nullable
    public final String getTitle() {
        return this.f77400b;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f77399a);
        String str = this.f77400b;
        return Boolean.hashCode(this.f77404f) + z.a(I.a(this.f77402d, I.a(this.f77401c, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f77403e);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f77399a;
        String str = this.f77400b;
        int i7 = this.f77401c;
        int i8 = this.f77402d;
        boolean z6 = this.f77403e;
        boolean z7 = this.f77404f;
        StringBuilder sbA = n.a(j7, "InterestChooseAge(id=", ", title=", str);
        F.b(i7, i8, ", defaultSelected=", ", originPos=", sbA);
        C4638g.b(", isSelected=", ", isExposed=", sbA, z6, z7);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f77399a);
        parcel.writeString(this.f77400b);
        parcel.writeInt(this.f77401c);
        parcel.writeInt(this.f77402d);
        parcel.writeInt(this.f77403e ? 1 : 0);
        parcel.writeInt(this.f77404f ? 1 : 0);
    }
}
