package com.bilibili.search2.result.holder.chatgpt.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/DisclaimerItem.class */
@StabilityInferred(parameters = 0)
public final class DisclaimerItem implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f87973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f87974b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/DisclaimerItem$a.class */
    public static final class a implements Parcelable.Creator<DisclaimerItem> {
        @Override // android.os.Parcelable.Creator
        public final DisclaimerItem createFromParcel(Parcel parcel) {
            return new DisclaimerItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DisclaimerItem[] newArray(int i7) {
            return new DisclaimerItem[i7];
        }
    }

    public DisclaimerItem() {
        this(null, null);
    }

    public DisclaimerItem(@Nullable String str, @Nullable String str2) {
        this.f87973a = str;
        this.f87974b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclaimerItem)) {
            return false;
        }
        DisclaimerItem disclaimerItem = (DisclaimerItem) obj;
        return Intrinsics.areEqual(this.f87973a, disclaimerItem.f87973a) && Intrinsics.areEqual(this.f87974b, disclaimerItem.f87974b);
    }

    public final int hashCode() {
        String str = this.f87973a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f87974b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return p.a("DisclaimerItem(icon=", this.f87973a, ", text=", this.f87974b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f87973a);
        parcel.writeString(this.f87974b);
    }
}
