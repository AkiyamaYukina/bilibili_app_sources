package com.bilibili.playset.dialog;

import Vn.A;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/dialog/OperateItem.class */
@StabilityInferred(parameters = 0)
public final class OperateItem implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84714c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/dialog/OperateItem$a.class */
    public static final class a implements Parcelable.Creator<OperateItem> {
        @Override // android.os.Parcelable.Creator
        public final OperateItem createFromParcel(Parcel parcel) {
            return new OperateItem(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final OperateItem[] newArray(int i7) {
            return new OperateItem[i7];
        }
    }

    public OperateItem(int i7, int i8, int i9) {
        this.f84712a = i7;
        this.f84713b = i8;
        this.f84714c = i9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperateItem)) {
            return false;
        }
        OperateItem operateItem = (OperateItem) obj;
        return this.f84712a == operateItem.f84712a && this.f84713b == operateItem.f84713b && this.f84714c == operateItem.f84714c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84714c) + I.a(this.f84713b, Integer.hashCode(this.f84712a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return C4277b.a(this.f84714c, ")", A.b(this.f84712a, this.f84713b, "OperateItem(resId=", ", textId=", ", command="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f84712a);
        parcel.writeInt(this.f84713b);
        parcel.writeInt(this.f84714c);
    }
}
