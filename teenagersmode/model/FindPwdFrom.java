package com.bilibili.teenagersmode.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bus.IInterProcData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/model/FindPwdFrom.class */
@StabilityInferred(parameters = 0)
@Parcelize
public final class FindPwdFrom implements IInterProcData {

    @NotNull
    public static final Parcelable.Creator<FindPwdFrom> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f110576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110577b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/model/FindPwdFrom$a.class */
    public static final class a implements Parcelable.Creator<FindPwdFrom> {
        @Override // android.os.Parcelable.Creator
        public final FindPwdFrom createFromParcel(Parcel parcel) {
            return new FindPwdFrom(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FindPwdFrom[] newArray(int i7) {
            return new FindPwdFrom[i7];
        }
    }

    public FindPwdFrom(@NotNull String str, boolean z6) {
        this.f110576a = str;
        this.f110577b = z6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindPwdFrom)) {
            return false;
        }
        FindPwdFrom findPwdFrom = (FindPwdFrom) obj;
        return Intrinsics.areEqual(this.f110576a, findPwdFrom.f110576a) && this.f110577b == findPwdFrom.f110577b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110577b) + (this.f110576a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "FindPwdFrom(from=" + this.f110576a + ", success=" + this.f110577b + ")";
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f110576a);
        parcel.writeInt(this.f110577b ? 1 : 0);
    }
}
