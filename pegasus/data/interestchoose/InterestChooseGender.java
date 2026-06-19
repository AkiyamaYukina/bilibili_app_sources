package com.bilibili.pegasus.data.interestchoose;

import W60.F;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.media3.common.util.C4638g;
import cf.b;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseGender.class */
@Parcelize
public final class InterestChooseGender implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InterestChooseGender> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private final long f77405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private final String f77406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("icon")
    @Nullable
    private final String f77407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("items")
    @Nullable
    private final List<InterestChooseItem> f77408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("default_selected")
    private final int f77409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f77410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f77411g;
    public boolean h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseGender$a.class */
    public static final class a implements Parcelable.Creator<InterestChooseGender> {
        @Override // android.os.Parcelable.Creator
        public final InterestChooseGender createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j7 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i7 = parcel.readInt();
                arrayList = new ArrayList(i7);
                int iA = 0;
                while (true) {
                    int i8 = iA;
                    if (i8 == i7) {
                        break;
                    }
                    iA = b.a(InterestChooseItem.CREATOR, parcel, arrayList, i8, 1);
                }
            } else {
                arrayList = null;
            }
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            boolean z6 = true;
            boolean z7 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z6 = false;
            }
            return new InterestChooseGender(j7, i9, string, i10, string2, z7, z6, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final InterestChooseGender[] newArray(int i7) {
            return new InterestChooseGender[i7];
        }
    }

    public InterestChooseGender() {
        this(0L, false, 255, null, null);
    }

    public InterestChooseGender(long j7, int i7, @Nullable String str, int i8, @Nullable String str2, boolean z6, boolean z7, @Nullable List list) {
        this.f77405a = j7;
        this.f77406b = str;
        this.f77407c = str2;
        this.f77408d = list;
        this.f77409e = i7;
        this.f77410f = i8;
        this.f77411g = z6;
        this.h = z7;
    }

    public /* synthetic */ InterestChooseGender(long j7, boolean z6, int i7, String str, String str2) {
        this((i7 & 1) != 0 ? 0L : j7, 0, (i7 & 2) != 0 ? null : str, 0, (i7 & 4) != 0 ? null : str2, (i7 & 64) != 0 ? false : z6, false, null);
    }

    public static InterestChooseGender a(InterestChooseGender interestChooseGender, List list, int i7, boolean z6, int i8) {
        long j7 = interestChooseGender.f77405a;
        String str = interestChooseGender.f77406b;
        String str2 = interestChooseGender.f77407c;
        if ((i8 & 8) != 0) {
            list = interestChooseGender.f77408d;
        }
        int i9 = interestChooseGender.f77409e;
        if ((i8 & 32) != 0) {
            i7 = interestChooseGender.f77410f;
        }
        if ((i8 & 64) != 0) {
            z6 = interestChooseGender.f77411g;
        }
        boolean z7 = interestChooseGender.h;
        interestChooseGender.getClass();
        return new InterestChooseGender(j7, i9, str, i7, str2, z6, z7, list);
    }

    public final int b() {
        return this.f77409e;
    }

    @Nullable
    public final String c() {
        return this.f77407c;
    }

    @Nullable
    public final List<InterestChooseItem> d() {
        return this.f77408d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseGender)) {
            return false;
        }
        InterestChooseGender interestChooseGender = (InterestChooseGender) obj;
        return this.f77405a == interestChooseGender.f77405a && Intrinsics.areEqual(this.f77406b, interestChooseGender.f77406b) && Intrinsics.areEqual(this.f77407c, interestChooseGender.f77407c) && Intrinsics.areEqual(this.f77408d, interestChooseGender.f77408d) && this.f77409e == interestChooseGender.f77409e && this.f77410f == interestChooseGender.f77410f && this.f77411g == interestChooseGender.f77411g && this.h == interestChooseGender.h;
    }

    public final long getId() {
        return this.f77405a;
    }

    @Nullable
    public final String getTitle() {
        return this.f77406b;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f77405a);
        String str = this.f77406b;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f77407c;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        List<InterestChooseItem> list = this.f77408d;
        if (list != null) {
            iHashCode2 = list.hashCode();
        }
        return Boolean.hashCode(this.h) + z.a(I.a(this.f77410f, I.a(this.f77409e, ((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31, 31), 31), 31, this.f77411g);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f77405a;
        String str = this.f77406b;
        String str2 = this.f77407c;
        List<InterestChooseItem> list = this.f77408d;
        int i7 = this.f77409e;
        int i8 = this.f77410f;
        boolean z6 = this.f77411g;
        boolean z7 = this.h;
        StringBuilder sbA = n.a(j7, "InterestChooseGender(id=", ", title=", str);
        sbA.append(", icon=");
        sbA.append(str2);
        sbA.append(", items=");
        sbA.append(list);
        F.b(i7, i8, ", defaultSelected=", ", originPos=", sbA);
        C4638g.b(", isSelected=", ", isExposed=", sbA, z6, z7);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f77405a);
        parcel.writeString(this.f77406b);
        parcel.writeString(this.f77407c);
        List<InterestChooseItem> list = this.f77408d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = cf.a.a(parcel, 1, list);
            while (itA.hasNext()) {
                ((InterestChooseItem) itA.next()).writeToParcel(parcel, i7);
            }
        }
        parcel.writeInt(this.f77409e);
        parcel.writeInt(this.f77410f);
        parcel.writeInt(this.f77411g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
