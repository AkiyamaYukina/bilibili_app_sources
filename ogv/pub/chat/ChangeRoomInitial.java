package com.bilibili.ogv.pub.chat;

import I.E;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.snapshots.z;
import androidx.media3.common.G;
import cf.n;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/chat/ChangeRoomInitial.class */
@Parcelize
public final class ChangeRoomInitial implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChangeRoomInitial> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f71478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f71479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f71480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f71481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f71482e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/chat/ChangeRoomInitial$a.class */
    public static final class a implements Parcelable.Creator<ChangeRoomInitial> {
        @Override // android.os.Parcelable.Creator
        public final ChangeRoomInitial createFromParcel(Parcel parcel) {
            return new ChangeRoomInitial(parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChangeRoomInitial[] newArray(int i7) {
            return new ChangeRoomInitial[i7];
        }
    }

    public ChangeRoomInitial(long j7, long j8, int i7, boolean z6, @NotNull String str) {
        this.f71478a = j7;
        this.f71479b = j8;
        this.f71480c = i7;
        this.f71481d = str;
        this.f71482e = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeRoomInitial)) {
            return false;
        }
        ChangeRoomInitial changeRoomInitial = (ChangeRoomInitial) obj;
        return this.f71478a == changeRoomInitial.f71478a && this.f71479b == changeRoomInitial.f71479b && this.f71480c == changeRoomInitial.f71480c && Intrinsics.areEqual(this.f71481d, changeRoomInitial.f71481d) && this.f71482e == changeRoomInitial.f71482e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71482e) + E.a(I.a(this.f71480c, C3554n0.a(Long.hashCode(this.f71478a) * 31, 31, this.f71479b), 31), 31, this.f71481d);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f71478a;
        long j8 = this.f71479b;
        int i7 = this.f71480c;
        String str = this.f71481d;
        boolean z6 = this.f71482e;
        StringBuilder sbA = z.a(j7, "ChangeRoomInitial(roomId=", ", seasonId=");
        G.a(i7, j8, ", seasonType=", sbA);
        n.a(", cover=", str, ", isChatRoom=", sbA, z6);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f71478a);
        parcel.writeLong(this.f71479b);
        parcel.writeInt(this.f71480c);
        parcel.writeString(this.f71481d);
        parcel.writeInt(this.f71482e ? 1 : 0);
    }
}
