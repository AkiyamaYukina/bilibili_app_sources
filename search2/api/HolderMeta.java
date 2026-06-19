package com.bilibili.search2.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.random.RandomKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/HolderMeta.class */
@StabilityInferred(parameters = 0)
@Parcelize
public final class HolderMeta implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HolderMeta> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f86278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f86279b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/HolderMeta$a.class */
    public static final class a implements Parcelable.Creator<HolderMeta> {
        @Override // android.os.Parcelable.Creator
        public final HolderMeta createFromParcel(Parcel parcel) {
            return new HolderMeta(parcel.readInt() != 0, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final HolderMeta[] newArray(int i7) {
            return new HolderMeta[i7];
        }
    }

    public HolderMeta() {
        this(0);
    }

    public /* synthetic */ HolderMeta(int i7) {
        this(false, System.currentTimeMillis() ^ RandomKt.Random(Long.MAX_VALUE).nextLong());
    }

    public HolderMeta(boolean z6, long j7) {
        this.f86278a = z6;
        this.f86279b = j7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HolderMeta)) {
            return false;
        }
        HolderMeta holderMeta = (HolderMeta) obj;
        return this.f86278a == holderMeta.f86278a && this.f86279b == holderMeta.f86279b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f86279b) + (Boolean.hashCode(this.f86278a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = z4.e.a(this.f86279b, "HolderMeta(isExposed=", ", uuid=", this.f86278a);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f86278a ? 1 : 0);
        parcel.writeLong(this.f86279b);
    }
}
